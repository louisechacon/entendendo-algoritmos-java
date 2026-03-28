import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maior {
    public static void main (String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(3, 1, 7, 31, 2, 10, 15));
        System.out.println(encontraMaior(numeros));
    }

    public static int encontraMaior(List<Integer> lista) {
        int maior = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > maior) {
                maior = lista.get(i);
            }
        }
        return maior;
    }
}