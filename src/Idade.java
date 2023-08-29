import javax.swing.*;

public class Idade {
    public static void main(String[] args) {

        String idade = JOptionPane.showInputDialog("Digite sua idade: ");
        int n1 = Integer.parseInt(idade);
        String mensagem = "";
        if (n1 >= 18){
                    mensagem = "Você pode ter aulas para ter sua habilitação";
        } else {
            mensagem = "você deve esperar mais um pouco";
        }
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);

    }
}
