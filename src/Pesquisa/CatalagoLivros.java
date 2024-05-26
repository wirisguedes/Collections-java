package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> livroList;


    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {

        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){

        List<Livro> livrosPorIntervalosAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalosAno.add(l);
                }
            }
        }

        return livrosPorIntervalosAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {

        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 1990);
        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 1993);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 1995);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 3", 1997);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 1999);

        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 1"));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAno(1990, 1991));

    }
}
