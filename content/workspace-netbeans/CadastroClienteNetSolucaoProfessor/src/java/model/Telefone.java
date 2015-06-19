package model;

/**
 *
 * @author Ciro Cirne Trindade
 */
public class Telefone {
    private String numero;

    public Telefone() {
    }

    public Telefone(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }

}
