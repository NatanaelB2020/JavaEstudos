import javax.swing.*;

public class DiferencaNumeros {
    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        String n2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

                int n3 = Integer.parseInt(n1);
                int n4 =  Integer.parseInt(n2);
                String n5 = "";
                if (n3 >  n4){
                    n5 = "O primerio é maior ";

                }if (n3 < n4) {
                    n5 = "O segundo é maior " ;

                } else {
                    n5 = "Os numeros são iguais " + n3;
        }
                JOptionPane.showMessageDialog(null , n5);
                System.exit(0);
        }

    }

