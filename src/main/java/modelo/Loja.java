package modelo;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome;
    private List<Fornecedor> fornecedores;
    private Estoque estoque;

    public Loja(String nome) {
        this.nome = nome;
        this.fornecedores = new ArrayList<>();
        this.estoque = new Estoque();
    }
    public void adicionarFornecedor(Fornecedor fornecedor){
        fornecedores.add(fornecedor);
    }
    public void realizarCompra(Produto produto, int quantidade){
        estoque.adicionarProduto(produto, quantidade);
    }

    public void realizarVenda(Produto produto, int quantidade){
        estoque.removerProduto(produto, quantidade);
    }

    public void exibirEstoque(){
        estoque.mostrarEstoque();
    }
}
