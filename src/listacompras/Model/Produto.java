package listacompras.Model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Produto {

    private String nomeProduto;
    private int quantidade;

    public Produto(String nomeProduto, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }

    public Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
