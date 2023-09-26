package HerancaAbstracao;

import appsPolimorfismo.FacebookMensseger;
import appsPolimorfismo.MsnMenssenger;
import appsPolimorfismo.ServicoMensagemIntantanea;
import appsPolimorfismo.Telegram;

import java.util.Scanner;

public class Computador {
    public static void main(String[] args) {

        ServicoMensagemIntantanea smi = null;

        Scanner entrada  = new Scanner(System.in);

        System.out.println("Selecione o Messeger digite msn, Facebook digite  fbm, Telegram digite tlg: ");
        String seletor = entrada.nextLine();

        if(seletor.equals("msn")){
            smi = new MsnMenssenger();
        } else if (seletor.equals("fbm")) {
            smi = new FacebookMensseger();
        }
        else if (seletor.equals("tlg")){
            smi = new Telegram();
        }
        smi.enviaMensagem();
        smi.receberMensagem();


//        MsnMenssenger msn = new MsnMenssenger();
//        msn.enviaMensagem();
//        msn.receberMensagem();
//        System.out.println("Msn");
//
//        FacebookMensseger fcb = new FacebookMensseger();
//        fcb.enviaMensagem();
//        fcb.receberMensagem();
//        System.out.println("Fcb");
//
//        Telegram tlg = new Telegram();
//        tlg.enviaMensagem();
//        tlg.receberMensagem();
//        System.out.println("Tlg");

    }
}
