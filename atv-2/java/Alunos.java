import java.util.Scanner;
import java.util.Arrays;

public class Alunos {
  
  public static void main(String[] args) {
    
    Scanner leia = new Scanner(System.in);

    int[][] notasAlunos = new int[10][4];
    int[] medias = new int[10];

    // Inserir os dados

    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 4; j++) {
        System.out.print("Insira a nota do " + (j + 1) + "º bimestre do " + (i + 1) + "º aluno: ");
        notasAlunos[i][j] = leia.nextInt();   
      }
      System.out.println("");
    }

    // Calcular as médias

    for (int i = 0; i < 10; i++) {
      medias[i] = (notasAlunos[i][0] + notasAlunos[i][1] + notasAlunos[i][2] + notasAlunos[i][3])/4;
    }

    // Saída dos dados

    System.out.println("As respectivas médias são: " + Arrays.toString(medias));

    leia.close();

  }

}