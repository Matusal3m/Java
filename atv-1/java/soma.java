import java.util.Scanner;

class Soma {
    public static int retornaSoma(int n1, int n2) {
        return n1 + n2;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int n1;
        int n2;

        System.out.println("Insira o primeiro valor para a soma: ");
        n1 = leia.nextInt();

        System.out.println("Insira o primeiro valor para a soma: ");
        n2 = leia.nextInt();

        System.out.println(retornaSoma(n1, n2));

        leia.close();
    }
}