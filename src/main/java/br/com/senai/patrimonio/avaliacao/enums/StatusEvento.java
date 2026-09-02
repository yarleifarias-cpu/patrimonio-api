package br.com.senai.patrimonio.avaliacao.enums;

public enum StatusEvento {
    EVENTO_PLANEJADO("Evento planejado", 1),
    INSCRICOES_ABERTAS("Incrições abertas", 2),
    EVENTO_EM_ANDAMENTO("Evento em andamento", 3),
    EVENTO_ENCERRADO("Evento encerrado", 4),
    EVENTO_CANCELADO("Evento cancelado",5);

    private final String descricao;
    private final int codigo;

    StatusEvento(String descricao, int codigo) {
        this.descricao = descricao;
        this.codigo = codigo;


    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }
}
