package collectionsJavaApi2023.set.Operacoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerconvidadoPorCodigoConvite(int codigoConvite){
         Convidado convidadoParaRemover = null;
         if(!convidadoSet.isEmpty()){
             for (Convidado c : convidadoSet) {
             if (c.getCodigoConvite() == codigoConvite){
             convidadoParaRemover = c;
             break;
             }
         }
         convidadoSet.remove(convidadoParaRemover);
         }else {
             throw new RuntimeException("O Conjunto está vazio");
         }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        if (!convidadoSet.isEmpty()){
            System.out.println(convidadoSet);
        }else {
            System.out.println("O conjunto está vazio");
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Alice", 1234);
        conjuntoConvidados.adicionarConvidado("Bob", 1235);
        conjuntoConvidados.adicionarConvidado("Charlie", 1235);
        conjuntoConvidados.adicionarConvidado("David", 1236);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.removerconvidadoPorCodigoConvite(1234);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();

    }

}

