package br.com.senai.patrimonio.model;

import br.com.senai.patrimonio.model.enums.Cargo;

public class Funcionario extends Pessoa implements Localizavel {
    private Cargo cargo;
    private Empresa empresa;
    private Sala salasResposavel;

    public Funcionario(){}

    public Funcionario(Cargo cargo, Empresa empresa, Sala salasResposavel) {
        this.cargo = cargo;
        this.empresa = empresa;
        this.salasResposavel = salasResposavel;
    }

    public Funcionario(Long id, String nome, String cpf, Cargo cargo, Empresa empresa, Sala salasResposavel) {
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


    @Override
    public String getDescricaoLocalizavel() {
        return "Responsabilidade de "+ getNome() + " ("+ cargo + ")";
    }
}
