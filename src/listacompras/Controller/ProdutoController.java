package listacompras.Controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import listacompras.Model.Produto;

public class ProdutoController {
    
    Produto prod;
    ArrayList<Produto> lista = new ArrayList<Produto>();

    public void setNomeProdutoController(String nomeProduto) {
        try {
            if (nomeProduto.length() > 0 && nomeProduto != "") {
                new Produto().setNomeProduto(nomeProduto);
            } else {
                JOptionPane.showMessageDialog(null, "Você deve preencher o nome do produto");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void setQuantidadeProduto(int quantidade) {
        try {

            if (quantidade > 0) {

            } else {
                JOptionPane.showMessageDialog(null, "A quantidade de produtos deve ser maior que 0");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void setProduto(String nomeProduto, int quantidade){
        if(nomeProduto.length() > 0 && quantidade > 0){
            prod = new Produto(nomeProduto, quantidade);
            lista.add(prod);
        }
    }
    
    public ArrayList<Produto> getLista(){
    return lista;
    }
    
    public void limpaLista(){
        for(Produto p: lista){
        p.setNomeProduto("");
        p.setQuantidade(0);
        }
    }

}
