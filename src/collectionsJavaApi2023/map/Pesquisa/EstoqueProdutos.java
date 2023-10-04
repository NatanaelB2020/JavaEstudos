package collectionsJavaApi2023.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adcionarProduto(long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotal(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p :estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() >maiorPreco){
                    produtoMaisCaro = p;
                }

            }
        }return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adcionarProduto(1l, "Produto A", 5.0, 25);
        estoqueProdutos.adcionarProduto(2l, "Produto B", 10.0, 13);
        estoqueProdutos.adcionarProduto(3l, "Produto C", 11.0, 8);
        estoqueProdutos.adcionarProduto(4l, "Produto D", 8.0, 5);
        estoqueProdutos.adcionarProduto(5l, "Produto E", 13.0, 12);

        estoqueProdutos.exibirProdutos();
        System.out.println("Valor maior do estoque: R$ " + estoqueProdutos.calcularValorTotal());
        System.out.println("Produto mais caro é " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
