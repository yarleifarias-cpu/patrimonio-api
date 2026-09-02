package br.com.senai.patrimonio.avaliacao;

public class Pessoa {
    private String nome;
    private String email;
    private String telefonr;

    public Pessoa() {}

    public Pessoa(String nome, String telefonr, String email) {
        this.nome = nome;
        this.telefonr = telefonr;
        this.email = email;
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

    public String getTelefonr() {
        return telefonr;
    }

    public void setTelefonr(String telefonr) {
        this.telefonr = telefonr;
    }
}
