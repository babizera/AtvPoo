public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Amanda Beatriz", "2026-SI", "Sistemas de Informação");
        Professor p = new Professor("Daniel Gusmão", "ID-100", "POO");

        System.out.println("=== DADOS DO ALUNO ===");
        a.exibirDados();

        System.out.println("=== DADOS DO PROFESSOR ===");
        p.exibirDados();
    }
}
