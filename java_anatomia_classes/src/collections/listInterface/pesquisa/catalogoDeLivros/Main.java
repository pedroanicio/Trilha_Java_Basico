package collections.listInterface.pesquisa.catalogoDeLivros;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        Livro l1 = new Livro("Java para iniciantes", "Pedro", 2020);
        Livro l2 = new Livro("Python para iniciantes", "Andre", 2024);
        catalogoLivros.adicionarLivro(l1);
        catalogoLivros.adicionarLivro(l2);


        catalogoLivros.pesquisarPorAutor("Pedro");


        catalogoLivros.pesquisarPorIntervaloAnos(2019, 2027);

        catalogoLivros.pesquisarPorTitulo("Java para iniciantes");

    }
}
