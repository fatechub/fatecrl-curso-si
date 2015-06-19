/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author ciro
 */
@ManagedBean
@RequestScoped
public class Reserva {

    private static final double DIARIA_SIMPLES = 190.;
    private static final double DIARIA_DUPLO = 350.;
    private static final double DIARIA_TRIPLO = 500.;
    private static final double DIARIA_QUADRUPLO = 620.;
    private String nome;
    private String email;
    private Date entrada;
    private int noites;
    private int hospedes;
    private double valor;

    /**
     * Creates a new instance of Reserva
     */
    public Reserva() {
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

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public int getNoites() {
        return noites;
    }

    public void setNoites(int noites) {
        this.noites = noites;
    }

    public int getHospedes() {
        return hospedes;
    }

    public void setHospedes(int hospedes) {
        this.hospedes = hospedes;
    }

    public double getValor() {
        return valor;
    }

    public String reservar() {
        switch(hospedes) {
            case 1: valor = DIARIA_SIMPLES * noites;
                break;
            case 2: valor = DIARIA_DUPLO * noites;
                break;
            case 3: valor = DIARIA_TRIPLO * noites;
                break;
            case 4: valor = DIARIA_QUADRUPLO * noites;
        }
        return "/confirmacao";
    }
}
