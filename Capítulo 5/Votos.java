import java.util.HashMap;

public class Votos {
    public static void main(String[] args) {
        
        HashMap<String, Boolean> eleitores = new HashMap<>();

        votar("Tom", eleitores);
        votar("Mike", eleitores);
        votar("Mike", eleitores);
    }

    public static void votar(String nome, HashMap<String, Boolean> eleitores) {

        if (eleitores.containsKey(nome)) {
            System.out.println("Mande embora!");
        } else {
            eleitores.put(nome, true);
            System.out.println("Deixe votar!");
        }
    }
}