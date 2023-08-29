import javax.swing.*;

public class Filhos2 {
    public static void main(String[] args) {
        String qtd = JOptionPane.showInputDialog("Quamtos filhos você tem?");
        int filhos = Integer.parseInt(qtd);
        StringBuilder rel = new StringBuilder();
        for (int ct = 1; ct <= filhos; ct++){
            String nome = JOptionPane.showInputDialog("Digite o nome " + " " + ct + " " + "nome?");
            String idade = JOptionPane.showInputDialog("Digite a idade" + " " + ct +" " + "idade?");
            String item = "Nome" + " " + nome + " " + " idade " + " " + idade + "\n";
            rel.append(item);
        }
        JOptionPane.showMessageDialog(null, rel);
        System.exit(0);
    }
}
