package collectionsJavaApi2023.set.Ordenacao;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco,quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtosPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        // Adicionando produtos ao cadastro
        cadastroProduto.adicionarProduto("Smartphone",1L,  1000d, 10);
        cadastroProduto.adicionarProduto("Notebook",2L,  1500d, 5);
        cadastroProduto.adicionarProduto("Mouse", 1L,  30d, 20);
        cadastroProduto.adicionarProduto("Teclado",4L,  50d, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProduto.produtoSet);

        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProduto.exibirProdutoPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProduto.exibirPorPreco());
    }

}

