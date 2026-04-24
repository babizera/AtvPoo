public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String identificador, String disciplina) {
        super(nome, identificador);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("-------------------------");
    }
}