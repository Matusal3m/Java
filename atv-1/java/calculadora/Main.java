package calculadora;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculo calc = new Calculo();
        Scanner leia = new Scanner(System.in);
        int n1;
        int n2;
        String operador;

        System.out.println("Insira o primero valor");
        n1 = leia.nextInt();
        System.out.println("Insira o segundo valor");
        n2 = leia.nextInt();
        System.out.println("Escolha que operação será feita");
        operador = leia.next();

        System.out.println(calc.calculadora(n1,  n2, operador));
        leia.close();
    }
}
