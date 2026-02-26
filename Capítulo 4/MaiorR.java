import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaiorR {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(3, 1, 7, 2, 10));
        System.out.println(encontraMaior(numeros));
    }

    public static int encontraMaior(List<Integer> lista) {
        if (lista.size() == 1) {
            return lista.get(0);
        }

        int ultimo = lista.get(lista.size() - 1);
        int penultimo = lista.get(lista.size() - 2);

        if (penultimo > ultimo) {
            return encontraMaior(lista.subList(0, lista.size() - 1));
        } else {
            List<Integer> semPenultimo = new ArrayList<>(lista.subList(0, lista.size() - 2));
            semPenultimo.add(ultimo);
            return encontraMaior(semPenultimo);
        }
    }
}