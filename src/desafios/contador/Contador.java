package contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int parametroUm = Integer.parseInt(terminal.nextLine());
        System.out.println("Digite o segundo numero: ");
        int parametroDois = Integer.parseInt(terminal.nextLine());

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("Parâmetro invalido, o segundo parâmetro deve ser maior que o primeiro");

        }
    }
    static void contar(int parametroUm, int paratroDois ) throws ParametrosInvalidosException{
        if(parametroUm >= paratroDois){
            throw new ParametrosInvalidosException();
        }
        for (int contador = parametroUm; contador <= paratroDois; contador++){
            System.out.println("Imprimindo o número " + contador);
        }
    }

}
