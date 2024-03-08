import java.util.Arrays;
import java.util.Scanner;

public class VetorInverso {
  
  public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    
    int[] numInteiros = new int[15];
    int[] arrayInvertida = new int[15];
    String preecherArray;

    System.out.print("Preencher o array MANUALMENTE?(S/N): ");
    preecherArray = leia.next();

    if ("S".equals(preecherArray)) {

      for(int i = 0; i < 15; i++) {
        System.out.println("Coloque um valor para o index " + i + ": ");
        numInteiros[i] = leia.nextInt();
      }

    } else {

      for(int i = 0; i < 15; i++) {
        numInteiros[i] = i + 1;
      }

    }

    for(int i = 0; i < 15; i++) {
      arrayInvertida[i] = numInteiros[14 - i];
    }

    System.out.println("Array original: " + Arrays.toString(numInteiros));
    System.out.println("Array invertida: " + Arrays.toString(arrayInvertida));

    leia.close();
  }

}