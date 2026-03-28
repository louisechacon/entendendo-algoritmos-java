import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
 
    public static void main(String[] args) {
 
        List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(ordenacaoporSelecao(numeros));
 
    }
 
    public static Integer buscaMenor(List<Integer> lista) {

        int menor = lista.get(0);
        int indice_menor_elemento = 0;

        for (int i = 1; i < lista.size(); i++) {
            if(lista.get(i) < menor) {
                menor = lista.get(i);
                indice_menor_elemento = i;
            }
        }
        return indice_menor_elemento;
    }

    public static List<Integer> ordenacaoporSelecao(List<Integer> lista) {
        List<Integer> novaLista = new ArrayList<>();

        while (!lista.isEmpty()) {
            Integer indice_menor_elemento = buscaMenor(lista);
            novaLista.add(lista.get(indice_menor_elemento));
            lista.remove(indice_menor_elemento.intValue());
        }
        return novaLista;
    }
}
