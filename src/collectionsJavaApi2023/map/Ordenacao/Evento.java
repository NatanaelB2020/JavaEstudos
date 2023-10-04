package collectionsJavaApi2023.map.Ordenacao;

public class Evento {
    private String nome;

    private String atracacao;

    public Evento(String nome, String atracacao) {
        this.nome = nome;
        this.atracacao = atracacao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracacao() {
        return atracacao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracacao='" + atracacao + '\'' +
                '}';
    }
}
