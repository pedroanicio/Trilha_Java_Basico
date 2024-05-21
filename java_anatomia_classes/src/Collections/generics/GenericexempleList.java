package Collections.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericexempleList {
    public static void main(String[] args) {
        // Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); // it allows to add any type

        // Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");
        //listaGenerics.add(10); error

        // Iterating over the list with generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        //Iterating over the list without Generics (cast required)
        for (Object elemento : listaSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
