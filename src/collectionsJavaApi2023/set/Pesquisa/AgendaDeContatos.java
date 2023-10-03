package collectionsJavaApi2023.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaDeContatos {

    private Set<Contato> contatoSet;

    public AgendaDeContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarContato(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().startsWith(nome)) {
                    contatoPorNome.add(c);
                }

                }return contatoPorNome;
            }else {
            throw new RuntimeException("O conjunto está vazio!");

        }
    }
    public Contato atualizarContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaDeContatos agendaDeContatos = new AgendaDeContatos();
        agendaDeContatos.exibirContato();

        agendaDeContatos.adicionarContato("João", 123456789);
        agendaDeContatos.adicionarContato("Maria", 987654321);
        agendaDeContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaDeContatos.adicionarContato("Ana", 88889999);
        agendaDeContatos.adicionarContato("Fernando", 77778888);
        agendaDeContatos.adicionarContato("Carolina", 55555555);

        agendaDeContatos.exibirContato();

        System.out.println(agendaDeContatos.pesquisarContato("Fernando"));


        System.out.println("Contato atualizado: " + agendaDeContatos.atualizarContato("Fernando", 5555555));
        System.out.println(agendaDeContatos.pesquisarContato("Fernando"));
    }

}
