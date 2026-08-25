package br.com.senai.patrimonio.model;

import br.com.senai.patrimonio.model.enums.Cargo;

public class Fucionario extends Pessoa {
    private Cargo cargo;
    private Empresa empresa;
    private Sala salasResposavel;

    public Fucionario(){}

    public Fucionario(Cargo cargo, Empresa empresa, Sala salasResposavel) {
        this.cargo = cargo;
        this.empresa = empresa;
        this.salasResposavel = salasResposavel;
    }

    public Fucionario(Long id, String nome, String cpf, Cargo cargo, Empresa empresa, Sala salasResposavel) {
        super(id, nome, cpf);
        this.cargo = cargo;
        this.empresa = empresa;
        this.salasResposavel = salasResposavel;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Sala getSalasResposavel() {
        return salasResposavel;
    }

    public void setSalasResposavel(Sala salasResposavel) {
        this.salasResposavel = salasResposavel;
    }
}
