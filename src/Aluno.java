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
    public void apresentar() {
        System.out.println("Olá! Meu nome é " + getNome() + " e sou aluno do curso de " + getCurso() + ".");
    }
}
