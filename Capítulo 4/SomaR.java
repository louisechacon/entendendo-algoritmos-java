import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomaR {
    public static void main (String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 5, 10));
        System.out.println(somaRecursao(numeros));
    }

    public static int somaRecursao(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        } else {
            return lista.get(0) + somaRecursao(lista.subList(1, lista.size()));
        }
    }
}