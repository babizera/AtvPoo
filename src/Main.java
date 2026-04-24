public class Main {
    public static void main(String[] args) {

        // 1. Criando os objetos (Polimorfismo)
        Pessoa p1 = new Aluno("Amanda Beatriz", "2026-SI", "Sistemas de Informação");
        Pessoa p2 = new Professor("Daniel Gusmão", "ID-100", "POO");

        // 2. Testando a exibição de dados (Herança)
        System.out.println("=== DADOS GERAIS ===");
        p1.exibirDados();
        p2.exibirDados();

        // 3. Testando a apresentação (Polimorfismo)
        System.out.println("\n=== APRESENTAÇÃO PERSONALIZADA ===");
        p1.apresentar();
        p2.apresentar();

        // 4. Teste de Abstração
        // Se descomentar a linha abaixo, o IntelliJ vai dar erro.
        // Pessoa p3 = new Pessoa("Erro", "000");
    }
}