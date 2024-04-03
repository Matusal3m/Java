import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Pessoa {

  private String name;
  private LocalDate dataNascimento;
  private LocalDate dataHoje = LocalDate.now();
  public String apelido;

  public static void main(String[] args) {
    System.out.println(LocalDate.now());
  }

  public Pessoa(String name, LocalDate dataNascimeto, String apelido) {
    this.name = name;
    this.dataNascimento = dataNascimeto;
    this.apelido = apelido;
  }

  private long calculaIdade() {
    return dataNascimento.until(dataHoje, ChronoUnit.YEARS);
  }

  public void saudacao() {
    String saudacao = encontraSaudacao();
    System.out.println(saudacao + ", me chamo " + this.name + ", mas meu apelido é " + this.apelido + ", tenho "
        + calculaIdade() + " anos");
  }

  private String encontraSaudacao() {
    Calendar now = Calendar.getInstance();

    int horas;
    horas = now.get(Calendar.HOUR_OF_DAY);

    if (horas >= 5 && horas <= 11) {
      return "Bom dia";
    } else if (horas >= 12 && horas <= 18) {
      return "Boa tarde";
    } else {
      return "Boa noite";
    }
  }

}
