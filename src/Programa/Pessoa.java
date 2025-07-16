package Programa;

public class Pessoa {

    private static int counter = 1;

    private String nome;
    private String email;
    private String cpf;

    public Pessoa(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        counter += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // método mágico que retorna uma representação textutal do objeto.
    public String toString() {
        return "\nNome: " + this.getNome() +
               "\nEmail: " + this.getEmail() +
               "\nCPF: " + this.getCpf();
    }

}
