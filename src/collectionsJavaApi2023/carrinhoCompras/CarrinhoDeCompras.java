package collectionsJavaApi2023.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adcionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemsParaRemover.add(i);
                }
            }
            itemList.removeAll(itemsParaRemover);
        } else {
            System.out.println("A lista está vazia");
        }
    }


    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()){
            System.out.println(this.itemList);
        }else {
            System.out.println("A lista está vazia");
        }
    }
    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adcionarItem("Abacate", Double.parseDouble("2.99"), Integer.parseInt("3"));
        carrinhoDeCompras.adcionarItem("laranja", Double.parseDouble("0.99"), Integer.parseInt("8"));
        carrinhoDeCompras.adcionarItem("Banana", Double.parseDouble("1.99"), Integer.parseInt("12"));
        carrinhoDeCompras.adcionarItem("Mexirica", Double.parseDouble("2.35"),Integer.parseInt( "12"));


        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra é = " +carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Abacate");
        System.out.println("O valor total da compra é = " +carrinhoDeCompras.calcularValorTotal());
    }
}
