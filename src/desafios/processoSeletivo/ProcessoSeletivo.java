package processoSeletivo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        //        analisarCandidato(1900.00);
//        analisarCandidato(2200.00);
//        analisarCandidato(2000.00);
//        selecaoDeCandidatos();
//        imprimirSelecionados();

        String [] candidatos = {"Falipe ", "Marcia ", "Julia ", "Paulo ", "Augusto "};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {

            atendeu = atender();
            continuarTentando = atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato Realizado com sucesso com candidato " + candidato );

        }while (continuarTentando && tentativasRealizadas < 3);
        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + "na " +tentativasRealizadas + " tentativa");
        else
            System.out.println("Não conseguimos contato com o candidato " + candidato + ", numero maximo de tentativas " + tentativasRealizadas + " realizadas.");
            
    }


    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Falipe ", "Marcia ", "Julia ", "Paulo ", "Augusto "};
        System.out.println("Impromir candidados informando indice");

        for(int indice= 0; indice < candidatos.length; indice++){
            System.out.println("candidato de n " + (indice+1) + " é " + candidatos[indice] );
        }
        System.out.println("Forma abreviada pelo for each");

        for(String candidato: candidatos){
            System.out.println("O Candidato selecionado foi " + candidato);
        }
    }

    static void selecaoDeCandidatos(){
        String[] candidatos = { "Felipe ", "Natanael ", "Amanda ", "Bernardo ", "Heloisa ", "Carol ", "Alice ", "Andreza ", "Andre ", "Leonardo "};

        int candidatoSelecionado = 0;
        int candidatosAtual = 0;
        double salarioBase= 2000.0;
        while (candidatoSelecionado < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + "O canditado foi selecionado");
            }else {
                System.out.println("O candidato " + candidato + "O canditado não foi selecionado");
                candidatoSelecionado++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o canditado");
        } else if (salarioBase==salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta");

        }else {
            System.out.println("Aguardando resultados");
        }
    }
}
