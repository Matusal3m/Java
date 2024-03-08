import java.util.Scanner;

public class ApenasVogais {

  public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    String[] letras = new String[7];

    for(int i = 0; i < 7; i++) {
      System.out.print("Adicionar letra: ");
      letras[i] = leia.next();
    }

    for (String string : letras) {
      if ("a".equals(string) || "e".equals(string) || "i".equals(string) || "o".equals(string) || "u".equals(string)) {
        System.out.println(string);
      }
    }

    leia.close();
  }

}
