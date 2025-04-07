import javax.swing.*;

public class Salario {
    public static void main(String[] args) {
        // Solicita ao usuário que digite o nome
        String nome = JOptionPane.showInputDialog("Digite seu nome?");

        int ct = 1;
        double total = 0;

        // Inicia um loop que irá executar 12 vezes para receber os salários
        while (ct <= 12) {
            // Solicita ao usuário que digite o salário
            String salario = JOptionPane.showInputDialog("Digite o " + ct + " salário ");

            // Converte o valor do salário para um número decimal (double)
            double valor = Double.parseDouble(salario);

            // Adiciona o valor do salário ao total
            total += valor;
            ++ct;
        }

        // Calcula a média dos salários
        double media = total / 12;

        // Exibe uma caixa de diálogo com o resultado
        JOptionPane.showMessageDialog(null, "O 13º salário do " + nome + " é " + media);

        // Encerra o programa
        System.exit(0);
    }
}
