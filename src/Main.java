public class Main {
    public static void main(String[] args) {
        // Criando os objetos
        Pessoa p1 = new Aluno("Babi", "2026-SI", "Sistemas de Informação");
        Pessoa p2 = new Professor("Daniel Gusmão", "ID-100", "POO");

        System.out.println("=== TESTE DE POLIMORFISMO ===");

        // O Java decide qual método rodar em "tempo de execução"
        p1.apresentar();
        p2.apresentar();
    }
}