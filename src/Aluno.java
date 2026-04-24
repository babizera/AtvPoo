public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        setNome(nome);
        setMatricula(matricula);
        setCurso(curso);
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: O nome não pode estar vazio!");
        }
    }

    public void setMatricula(String matricula) {
        if (!matricula.isEmpty()) {
            this.matricula = matricula;
        } else {
            System.out.println("Erro: A matrícula não pode estar vazia!");
        }
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public String getCurso() { return curso; }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
        System.out.println("-------------------------");
    }
}