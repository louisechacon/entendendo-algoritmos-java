import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quicksort {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(10, 5, 2, 3));
        System.out.println(ordenarNumeros(numeros));
    }

    public static List<Integer> ordenarNumeros(List<Integer> lista) {
        if (lista.size() < 2) {
            return lista;

        } else {
            int pivo = lista.get(0);

            List<Integer> menores = new ArrayList<>();
            for (int i = 1; i < lista.size(); i++) {
                if (lista.get(i) <= pivo) {
                    menores.add(lista.get(i));
                }
            }

            List<Integer> maiores = new ArrayList<>();
            for (int i = 1; i < lista.size(); i++) {
                if (lista.get(i) > pivo) {
                    maiores.add(lista.get(i));
                }
            }

            List <Integer> ordenados = new ArrayList<>();
            ordenados.addAll(ordenarNumeros(menores));
            ordenados.add(pivo);
            ordenados.addAll(ordenarNumeros(maiores));
            return ordenados;
        }
    }
}