import java.util.HashMap;

public class Cache {

    public static HashMap<String, String> cache = new HashMap<>();
    
    public static void main(String[] args) {
        System.out.println(pegaPagina("URL"));
    }

    public static String pegaPagina(String url) {
        if (cache.containsKey(url)) {
            return cache.get(url);
        } else {
            String dados = pegaDadosDoServidor(url);
            cache.put(url, dados);
            return dados;
        }
    }

    public static String pegaDadosDoServidor(String url) {
        return "dado";
    }
}