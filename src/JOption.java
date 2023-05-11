import javax.swing.JOptionPane;
import java.util.Scanner;

public class JOption {

    public static void main(String[] args) {

        String nome  = JOptionPane.showInputDialog("Digite seu nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");
        String nomecompleto = nome + " " + sobrenome;
        JOptionPane.showMessageDialog(null, nomecompleto);
//       Cria uma interface Grafica com Mensagem, Um pop up , serve para mensagens de erro muito utilizado.



        JOptionPane.showMessageDialog(null, "Olá Mundo!" +" "  + nomecompleto + " " +", Idiota pra caramba!!");
        System.exit(0);
    }
}
