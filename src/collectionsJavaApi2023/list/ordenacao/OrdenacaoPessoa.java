package collectionsJavaApi2023.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adcionarPessoa(String nome, int idade, double altura ){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ornadoPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adcionarPessoa("Nome 1", 35, 1.83);
        ordenacaoPessoa.adcionarPessoa("Nome 2", 14, 1.95);
        ordenacaoPessoa.adcionarPessoa("Nome 3", 60, 1.55);
        ordenacaoPessoa.adcionarPessoa("Nome 4", 20, 1.85);
        ordenacaoPessoa.adcionarPessoa("Nome 5", 1, 1.75);

        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println(ordenacaoPessoa.ornadoPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

