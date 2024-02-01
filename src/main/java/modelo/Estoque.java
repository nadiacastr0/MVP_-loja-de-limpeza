package modelo;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Produto, Integer> estoque;

    public Estoque() {
        this.estoque = new HashMap<>();
    }
    public void adicionarProduto(Produto produto, int quantidade) {
        estoque.put(produto, estoque.getOrDefault(produto, 0) +quantidade);
    }

    public void removerProduto(Produto produto, int quantidade) {
        int estoqueAtual = estoque.getOrDefault(produto, 0);
        if (estoqueAtual >= quantidade) {
            estoque.put(produto, estoqueAtual - quantidade);
        } else {
            System.out.println("Sem estoque para realizar venda de" + quantidade + "unidades de " + produto.getNome());
        }
    }
    public void mostrarEstoque() {
        System.out.println("Estoque de loja: ");
        for (Map.Entry<Produto, Integer> e : estoque.entrySet()){
            Produto produto = e.getKey();
            int quantidade = e.getValue();
            System.out.println(produto.getNome() + " - " + quantidade + " unidades");
        }
    }
}
