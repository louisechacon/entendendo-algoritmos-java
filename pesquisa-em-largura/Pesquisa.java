import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class Pesquisa {

    public static HashMap<String, List<String>> grafo = new HashMap<>();
    
    public static void main(String[] args) {

        grafo.put("voce", new ArrayList<>(Arrays.asList("alice", "bob", "claire")));
        grafo.put("bob", new ArrayList<>(Arrays.asList("anuj", "peggy")));
        grafo.put("alice", new ArrayList<>(Arrays.asList("peggy")));
        grafo.put("claire", new ArrayList<>(Arrays.asList("thom", "jonny")));
        grafo.put("anuj", new ArrayList<>());
        grafo.put("peggy", new ArrayList<>());
        grafo.put("thom", new ArrayList<>());
        grafo.put("jonny", new ArrayList<>());

        pesquisa("voce");

    }

    public static boolean pesquisa(String nome) {

        Deque<String> filaDePesquisa = new ArrayDeque<>();

        List<String> listaDeAmigos = grafo.get(nome);

        for (int i = 0; i < listaDeAmigos.size(); i++) {
            filaDePesquisa.addLast(listaDeAmigos.get(i));
        }

        List<String> verificadas = new ArrayList<>();

        while (!filaDePesquisa.isEmpty()) {
            String pessoa = filaDePesquisa.pop();

            if (!filaDePesquisa.contains(pessoa)) {
                if (pessoaEhVendedor(pessoa)) {
                    System.out.println(pessoa + " é um vendedor de manga!");
                    return true;
                } else {
                    List<String> listaDeAmigosDePessoa = grafo.get(pessoa);
                    for (int i = 0; i < listaDeAmigosDePessoa.size(); i++) {
                        filaDePesquisa.addLast(listaDeAmigosDePessoa.get(i));
                    }
                    verificadas.add(pessoa);
                }
            }
        }
        return false;
    }

    public static boolean pessoaEhVendedor(String pessoa) {
        return pessoa.endsWith("m");
    }

}