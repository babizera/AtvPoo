public class Pessoa {
    private String nome;
    private String identificador;

    public Pessoa(String nome, String identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

    public String getNome() { return nome;}
    public void setNome(String nome) {
        if (!nome.isEmpty()) this.nome = nome;
    }

    public String getIdentificador() { return identificador; }
    public void setIdentificador(String identificador) {
        if (!identificador.isEmpty()) this.identificador = identificador;
    }

    public void exibirDados() {
        System.out.println("Nome:" + nome);
        System.out.println("Identificador:" + identificador);
    }
}
