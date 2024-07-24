package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livrosList;

    public CatalagoLivros() {
        this.livrosList = new ArrayList<>();
    }
    public void addLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> listPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for(Livro livro : livrosList) {
                if(livro.getAutor().equalsIgnoreCase(autor)) {
                    listPorAutor.add(livro);
                }
            }
        }
        return listPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosIntervaloPorAno = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for(Livro livro : livrosList) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosIntervaloPorAno.add(livro);
                }
            }
        }
        return livrosIntervaloPorAno;
    }
    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()) {
            for(Livro livro : livrosList) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.addLivro("Livro 1", "Autro 1", 2020);
        catalagoLivros.addLivro("Livro 1", "Autro 2", 2021);
        catalagoLivros.addLivro("Livro 3", "Autro 2", 2022);
        catalagoLivros.addLivro("Livro 4", "Autro 4", 2023);
        catalagoLivros.addLivro("Livro 5", "Autro 5", 2024);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autro 4"));
        System.out.println(catalagoLivros.pesquisaPorIntervaloAnos(2020, 2022));
        System.out.println(catalagoLivros.pesquisaPorTitulo("Livro 1"));
    }
}
