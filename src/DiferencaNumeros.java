import javax.swing.*;

public class DiferencaNumeros {
    public static void main(String[] args) {

        // Solicita ao usuário que insira o primeiro número e armazena como uma String
        String n1 = JOptionPane.showInputDialog("Digite o primeiro número: ");

        // Solicita ao usuário que insira o segundo número e armazena como uma String
        String n2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        // Converte as Strings n1 e n2 em inteiros (int)
        int n3 = Integer.parseInt(n1);
        int n4 = Integer.parseInt(n2);

        String n5 = ""; // Inicializa a variável n5 com uma String vazia

        // Compara os valores de n3 e n4
        if (n3 > n4) {
            n5 = "O primeiro é maior";
        } else if (n3 < n4) {
            n5 = "O segundo é maior";
        } else {
            n5 = "Os números são iguais: " + n3;
        }

        // Exibe uma mensagem com o resultado da comparação usando uma caixa de diálogo
        JOptionPane.showMessageDialog(null, n5);

        // Encerra o programa
        System.exit(0);
    }
}
