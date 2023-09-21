import javax.swing.*;

public class Filhos2 {
    public static void main(String[] args) {
        // Solicita ao usuário que digite a quantidade de filhos e armazena como uma string
        String qtd = JOptionPane.showInputDialog("Quantos filhos você tem?");
        // Converte a string em um valor inteiro (número de filhos)
        int filhos = Integer.parseInt(qtd);
        // Cria um objeto StringBuilder para armazenar os dados dos filhos de forma eficiente
        StringBuilder rel = new StringBuilder();

        // Loop for usado para iterar sobre cada filho
        for (int ct = 1; ct <= filhos; ct++) {
            // Solicita ao usuário que digite o nome do filho
            String nome = JOptionPane.showInputDialog("Digite o nome do " + ct + "º filho:");
            // Solicita ao usuário que digite a idade do filho
            String idade = JOptionPane.showInputDialog("Digite a idade do " + ct + "º filho:");
            // Cria uma string formatada com os dados do filho
            String item = "Nome: " + nome + ", Idade: " + idade + "\n";
            // Adiciona o item ao StringBuilder 'rel'
            rel.append(item);
        }

        // Exibe os dados dos filhos em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, rel.toString());
        // Encerra o programa
        System.exit(0);
    }
}
