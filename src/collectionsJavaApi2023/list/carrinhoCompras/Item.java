package collectionsJavaApi2023.list.carrinhoCompras;

public class Item {
    public String nome;

    double preco;
    int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" + nome + ',' + preco +
                "," + quantidade +
                "}";
    }
}
