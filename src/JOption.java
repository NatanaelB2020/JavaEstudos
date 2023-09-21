import javax.swing.JOptionPane;

public class JOption {

    public static void main(String[] args) {

        // Exibe uma caixa de diálogo de entrada de texto para obter o nome do usuário
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");

        // Exibe uma caixa de diálogo de entrada de texto para obter o sobrenome do usuário
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");

        // Combina o nome e sobrenome em uma única String
        String nomecompleto = nome + " " + sobrenome;

        // Exibe uma caixa de diálogo de mensagem com o nome completo do usuário
        JOptionPane.showMessageDialog(null, nomecompleto);

        // Exibe uma caixa de diálogo de mensagem com uma saudação personalizada
        JOptionPane.showMessageDialog(
                null,
                "Olá Mundo! " + nomecompleto + ", Idiota pra caramba!!"
        );

        // Encerra o programa
        System.exit(0);
    }
}
