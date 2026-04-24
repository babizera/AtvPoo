public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String identificador, String disciplina) {
        super(nome, identificador);
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá! Sou o professor " + getNome() + " e leciono a disciplina de " + this.disciplina + ".");
    }
}