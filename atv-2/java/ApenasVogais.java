import java.util.Scanner;

public class ApenasVogais {

  public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    String[] letras = new String[7];

    for(int i = 0; i < 7; i++) {
      System.out.print("Adicionar letra: ");
      letras[i] = leia.next();
    }

    for (String letra : letras) {
      if ("a".equals(letra) || "e".equals(letra) || "i".equals(letra) || "o".equals(letra) || "u".equals(letra)) {
        System.out.println(letra);
      }
    }

    leia.close();
  }

}
