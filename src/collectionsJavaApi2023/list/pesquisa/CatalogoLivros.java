package collectionsJavaApi2023.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adcionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> getLivroList() {
        return livroList;
    }

    public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloDeAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorIntervaloDeAno.add(l);
                }
            }
        }
        return livroPorIntervaloDeAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }

            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adcionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adcionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adcionarLivro("Livro 3", "Autor 2", 2022);
        catalogoLivros.adcionarLivro("Livro 4", "Autor 4", 2023);
        catalogoLivros.adcionarLivro("Livro 5", "Autor 5", 2024);
        catalogoLivros.adcionarLivro("Livro 6", "Autor 6", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAno(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}


