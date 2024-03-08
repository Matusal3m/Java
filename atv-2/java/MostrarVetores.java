public class MostrarVetores {

  public static void main(String[] args) {
    //Mostrar um vetor de 15 números

    int[] numInteiros = new int[15];

    for(int i = 0; i < 15; i++) {
      numInteiros[i] = i+1;
    }

    for (int i : numInteiros) {
      System.out.print(i);
    }
  }

}