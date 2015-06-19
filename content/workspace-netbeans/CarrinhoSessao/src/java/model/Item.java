package model;

import java.util.Objects;

public class Item {

    private Integer id;
    private String descricao;
    private Integer quantidade;
    private Double valor;

    public Item() {
    }

    public Item(Integer id, String descricao, Integer quantidade,
            Double valor) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        return (Objects.equals(this.id, other.id));
    }
}
