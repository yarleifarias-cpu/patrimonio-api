package br.com.senai.patrimonio.model;

public class Endereco {
    private String rua;
    private String numero;
    private String conplemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(){}
        public String getRua() {
            return rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getConplemento() {
        return conplemento;
    }

    public void setConplemento(String conplemento) {
        this.conplemento = conplemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

}
