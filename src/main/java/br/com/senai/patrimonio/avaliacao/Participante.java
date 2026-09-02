package br.com.senai.patrimonio.avaliacao;

import br.com.senai.patrimonio.avaliacao.enums.Nivel;

public class Participante extends Pessoa {
    private String matricula;
    private Nivel nivel;

    public Participante(){}

    public Participante(String nome, String telefonr, String email, String matricula, Nivel nivel) {
        super(nome, telefonr, email);
        this.matricula = matricula;
        this.nivel = nivel;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
}
