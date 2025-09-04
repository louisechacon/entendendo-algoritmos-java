public class ContagemRegressiva {

    public static void main(String[] args) {
        regressiva(5);
    }

    public static void regressiva(int i){
        System.out.print(i);
        if (i <= 1) {
            return;
        } else {
            System.out.print("...");
            regressiva(i-1);
        }
        }
    }