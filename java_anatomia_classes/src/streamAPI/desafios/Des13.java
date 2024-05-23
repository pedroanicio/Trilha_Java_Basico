package streamAPI.desafios;

import java.util.Arrays;
import java.util.List;

public class Des13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosFiltrados = numeros.stream().filter(n -> n >= 5 && n <= 10).toList();

        System.out.println(numerosFiltrados);
    }
}
