import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Aluno aluno = new Aluno("João", LocalDate.of(2008, 2, 1), "Jão", 134, "Enfermagem");
    Professor professor = new Professor("Marcos", LocalDate.of(2000, 10, 8), "Mar", 144, "Engenharia");
    Funcionario funcionario = new Funcionario("João", LocalDate.of(2008, 2, 1), "Jãozinho", "Zelador", 9999);
    Pessoa pessoa = new Pessoa("Marcoso", LocalDate.of(2000, 10, 8), "Maro");
    aluno.saudacao();
    professor.saudacao();
    funcionario.saudacao();
    pessoa.saudacao();
  }
}
