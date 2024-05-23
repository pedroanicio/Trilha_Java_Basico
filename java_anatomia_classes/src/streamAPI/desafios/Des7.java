package streamAPI.desafios;

import java.util.Arrays;
import java.util.List;

public class Des7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 99, 10, 5, 4, 3);

        int maiorvalor = numeros.stream().reduce(0, Integer::max);

        System.out.println(maiorvalor);
    }
}
