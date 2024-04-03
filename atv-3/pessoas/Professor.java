import java.time.LocalDate;

public class Professor extends Aluno {
  private int anoFormacao;

  public Professor(String nome, LocalDate dataNascimeto, String apelido, int matricula, String curso) {
    super(nome, dataNascimeto, apelido, matricula, curso);
  }

  public void saudacao() {
    String saudacao = encontraSaudacao();
    System.out.println(saudacao + ", me chamo " + getName() + ", mas meu apelido é " + this.apelido + ", tenho "
        + calculaIdade() + " anos e me formei em " + anoFormacao);
  } 

  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Getulio", LocalDate.of(2000, 10, 8), "Noia");
    Aluno aluno = new Aluno("Paulo", LocalDate.of(2000, 10, 8), "Paulinho", 122, "Informatica");
    pessoa.saudacao();
    aluno.saudacao();
  }
}
