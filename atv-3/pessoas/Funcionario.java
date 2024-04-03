import java.time.LocalDate;

public class Funcionario extends Pessoa {
  private String funcao;
  private double salario;

    public Funcionario(String name, LocalDate dataNascimeto, String apelido, String funcao, double salario) {
      super(name, dataNascimeto, apelido);
      this.funcao = funcao;
      this.salario = salario;
  }

  public void saudacao() {
    String saudacao = encontraSaudacao();
    System.out.println(saudacao + ", me chamo " + getName() + ", mas meu apelido é " + this.apelido + ", tenho "
        + calculaIdade() + " anos, minha função é " + funcao + " e meu salario é de " + salario + "reais");
  }

  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Adriano", LocalDate.of(2000, 10, 8), "Drino");
    pessoa.saudacao();
  }
}
