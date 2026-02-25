import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumItens {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(contaNumeros(numeros));
    }

    public static int contaNumeros(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        } else {
            return 1 + contaNumeros(lista.subList(0, lista.size() - 1));
        }
    }
}