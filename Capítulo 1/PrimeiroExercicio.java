public class PrimeiroExercicio {
  public static Integer pesquisaBinaria(Integer[] lista, Integer item) {
    Integer baixo = 0;
    Integer alto = lista.length - 1;

    while (baixo <= alto){
      Integer meio = (baixo + alto) / 2;
      Integer chute = lista[meio];

      if (chute == item){
        return meio;
      }

      if (chute > item){
        alto = meio - 1;
      } else {
        baixo = meio + 1;
      }
    }
    return null;
  }

  public static void main(String[] args) {
  Integer[] lista = {1, 3, 5, 7, 9};
  Integer posicao_a = pesquisaBinaria(lista, 3);
  System.out.print("Posição: ");
  System.out.println(posicao_a);
  Integer posicao_b = pesquisaBinaria(lista, -1);
  System.out.print("Posição: ");
  System.out.println(posicao_b);
  }
}
