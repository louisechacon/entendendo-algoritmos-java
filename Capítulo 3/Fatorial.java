public class Fatorial {
    public static void main (String[] args) {
        int x = 5;
        int fatorial = calculaFatorial(x);
        System.out.printf("O fatorial de %d é %d", x, fatorial);
    }

    public static int calculaFatorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * calculaFatorial(x-1);
        }
    }
}