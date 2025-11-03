import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soma {
    public static void main (String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(somaRecursao(numeros));
    }

    public static int somarNumeros(List<Integer> lista) {
        int total = 0;
        for (int i = 0; i < lista.size(); i++) {
            total += lista.get(i);
        }
        return total;
    }

    public static int somaRecursao(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        } else {
            return lista.get(0) + somaRecursao(lista.subList(1, lista.size()));
        }
    }
}