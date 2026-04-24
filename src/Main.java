public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria Silva", "2026001", "Informática");

        // Criando o Aluno 2 com dados diferentes
        Aluno aluno2 = new Aluno("João Pereira", "2026002", "Redes de Computadores");

        System.out.println("Aluno 1:");
        aluno1.exibirDados();

        System.out.println("Aluno 2:");
    }
}
