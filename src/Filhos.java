import javax.swing.*;

public class Filhos {
    public static void main(String[] args) {
        String qtd = JOptionPane.showInputDialog("Digite quantos filhos?");
        int filhos = Integer.parseInt(qtd);
        int ct = 1;
        String rel = "";
        while (ct <= filhos){
            String nome = JOptionPane.showInputDialog("digite o " + ct + " nome ?");
            String idade = JOptionPane.showInputDialog("Digite a " + ct + " idade?");
            rel += "nome" +" " + nome + " " + "idade" + " " + idade + "\n";
            ++ct;
        }
        JOptionPane.showMessageDialog(null, rel);
        System.exit(0);

    }
}
