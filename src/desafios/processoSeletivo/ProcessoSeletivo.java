package desafios.processoSeletivo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        // Array de candidatos com nomes
        String[] candidatos = {"Falipe ", "Marcia ", "Julia ", "Paulo ", "Augusto "};

        // Itera sobre os candidatos e simula o processo de contato
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    // Simula o processo de entrar em contato com um candidato
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        // Realiza tentativas até que o contato seja bem-sucedido ou o limite de tentativas seja atingido
        do {
            atendeu = atender();
            continuarTentando = atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato Realizado com sucesso com candidato " + candidato);

        } while (continuarTentando && tentativasRealizadas < 3);

        // Exibe resultados das tentativas de contato
        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        else
            System.out.println("Não conseguimos contato com o candidato " + candidato + ", número máximo de tentativas " + tentativasRealizadas + " realizadas.");
    }

    // Simula a chance de atender uma chamada (33% de chance de atender)
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    // Método para imprimir informações sobre candidatos selecionados (comentado e não utilizado no main)
    static void imprimirSelecionados() {
        String[] candidatos = {"Falipe ", "Marcia ", "Julia ", "Paulo ", "Augusto "};
        System.out.println("Imprimir candidatos informando índice");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("Candidato de número " + (indice + 1) + " é " + candidatos[indice]);
        }
        System.out.println("Forma abreviada pelo foreach");

        for (String candidato : candidatos) {
            System.out.println("O Candidato selecionado foi " + candidato);
        }
    }

    // Método para simular a seleção de candidatos com base em salários pretendidos (comentado e não utilizado no main)
    static void selecaoDeCandidatos() {
        String[] candidatos = {"Felipe ", "Natanael ", "Amanda ", "Bernardo ", "Heloisa ", "Carol ", "Alice ", "Andreza ", "Andre ", "Leonardo "};

        int candidatoSelecionado = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        // Realiza a seleção de candidatos
        while (candidatoSelecionado < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado");
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado");
                candidatoSelecionado++;
            }
            candidatosAtual++;
        }
    }

    // Método para gerar um valor de salário pretendido aleatório entre 1800.0 e 2200.0
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Método para analisar um candidato com base em seu salário pretendido (comentado e não utilizado no main)
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultados");
        }
    }
}
