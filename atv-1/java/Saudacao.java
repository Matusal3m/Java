import java.util.Calendar;

class Saudacao {
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();

        int horas;
        horas = now.get(Calendar.HOUR_OF_DAY);

        if (horas >= 5 && horas <= 11) {
            System.out.println("Bom dia");
        } else if (horas >= 12 && horas <= 18) {
            System.out.println("Boa tarde"); 
        } else if (horas >= 19 && horas <= 23) {
            System.out.println("Boa noite");
        } else {
            System.out.println("Vai dormir, Raphael");
        }
    }
}