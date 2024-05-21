package collections.listInterface.pesquisa.catalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        catalogo.add(livro);
    }

    public void pesquisarPorAutor(String autor){
        System.out.println("Livros do autor "+ autor);
        for (Livro l : catalogo){
            if (l.getAutor().equalsIgnoreCase(autor)){
                System.out.println(l);
            }
        }
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        System.out.println("Livros lançados nesse intervalo: ");
        for (Livro l: catalogo){
            if (l.getAnoPublicacao() <= anoFinal && l.getAnoPublicacao() >= anoInicial){
                System.out.println(l);
            }else{
                System.out.println("Nenhum encontrado");
            }
        }
    }

    public void pesquisarPorTitulo(String titulo){
        for (Livro l : catalogo){
            if (l.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(l);
            }
        }
    }
}
