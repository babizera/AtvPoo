public class Aluno extends Pessoa {

    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        super(nome, matricula);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Curso: " + this.curso);
        System.out.println("-------------------------");
    }
}
