import modelo.Fornecedor;
import modelo.Loja;
import modelo.Produto;

public class Main {
    public static void main(String[] args) {
        //Setando fonecedores
        Fornecedor f1 = new Fornecedor("Ana");
        Fornecedor f2 = new Fornecedor("João");

        //Produtos da loja
        Produto p1 = new Produto("Flat mop", f2);
        Produto p2 = new Produto("Detergente", f2);

        //Criando Loja
        Loja loja = new Loja("Loja LimpaBem");

        //Vinculando fornecedores a loja
        loja.adicionarFornecedor(f1);
        loja.adicionarFornecedor(f2);

        //Transações
        loja.realizarCompra(p1, 30);
        loja.realizarCompra(p2, 50);
        loja.realizarCompra(p2, -1);

        loja.realizarVenda(p1, 24);
        loja.realizarVenda(p2, 49);

        //Exibindo estoque atual
        loja.exibirEstoque();
    }
}
