package streamAPI.desafios;

import java.util.Arrays;
import java.util.List;

public class Des9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1, 7, 8, 9, 10, 5, 4, 3);

        long numerosNaoRpetidos = numeros.stream().distinct().count();

        System.out.println(numerosNaoRpetidos);

    }
}
