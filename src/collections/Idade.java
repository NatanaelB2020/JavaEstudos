import javax.swing.*;

public class Idade {
    public static void main(String[] args) {

        // Solicita ao usuário que digite sua idade e armazena o valor como uma String
        String idade = JOptionPane.showInputDialog("Digite sua idade: ");

        // Converte a String 'idade' em um valor inteiro (int) e armazena em 'n1'
        int n1 = Integer.parseInt(idade);

        String mensagem = "";

        // Verifica se 'n1' é maior ou igual a 18
        if (n1 >= 18) {
            mensagem = "Você pode ter aulas para ter sua habilitação";
        } else {
            mensagem = "Você deve esperar mais um pouco";
        }

        // Exibe uma caixa de diálogo com a mensagem correspondente
        // JOptionPane.showMessageDialog é usado para exibir caixas de diálogo em aplicativos Java
        JOptionPane.showMessageDialog(null, mensagem);

        // Encerra o programa
        System.exit(0);
    }
}
