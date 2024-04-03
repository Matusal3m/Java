import java.time.LocalDate;

public class Aluno extends Pessoa {

  private int matricula;
  private String curso;

  public Aluno(String nome, LocalDate dataNascimeto, String apelido, int matricula, String curso) {
    super(nome, dataNascimeto, apelido);
    this.matricula = matricula;
    this.curso = curso;
  }

  public void saudacao() {
    String saudacao = encontraSaudacao();
    System.out.println(saudacao + ", me chamo " + getName() + ", mas meu apelido é " + this.apelido + ", tenho "
        + calculaIdade() + " anos, " + "minha matricula é " + matricula + " e meu curso é " + curso);
  }

}