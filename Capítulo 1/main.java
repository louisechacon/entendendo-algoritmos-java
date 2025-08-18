public class PrimeiroExercicio {
  public static pesquisaBinaria(Integer[] lista, Integer item) {
    Integer baixo = 0;
    Integer alto = lista.length - 1;

    while (baixo <= alto);
      Integer meio = lista.length / 2;
      Integer chute = meio;

      if (chute == item){
        return lista[meio];
      }

      if (chute > item){
        alto = meio - 1;
      } else {
        baixo = meio + 1;
      }
    return null
  }

  public static void main(String[] args) {
  Integer[] lista = {1, 3, 5, 7, 9};
  Integer posicao = pesquisaBinaria(lista, 3);
  System.out.println("Posição: " + posicao);
  Integer posicao = pesquisaBinaria(lista, -1);
  System.out.println("Posição: " + posicao);
  Integer posicao = pesquisaBinaria(lista, 9);
  System.out.println("Posição: " + posicao);
  }

}
