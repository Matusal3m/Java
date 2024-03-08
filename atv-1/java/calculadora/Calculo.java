package calculadora;

public class Calculo {
    public int calculadora(int n1, int n2, String operador) {
        switch(operador) {
            case "+": 
                return n1 + n2;
            case "-" :
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return n1 / n2;
            default:
                return n1 + n2;
        }
    }
}
