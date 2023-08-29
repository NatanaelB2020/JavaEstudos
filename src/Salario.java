import javax.swing.*;

public class Salario {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome?");
        int ct = 1;
        double total = 0;
        while (ct <= 12){
            String salario = JOptionPane.showInputDialog("Digite o " + ct + " salário ");
            double valor = Double.parseDouble(salario);
            total += valor;
            ++ct;
        }
        double media = total / 12;
        JOptionPane.showMessageDialog(null, "13 salario do " + nome + " é "+ " " + media);
        System.exit(0);
    }
}
