/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author lab3
 */
@ManagedBean
@RequestScoped
public class Aluno {
    private String nome;
    private Float p1;
    private Float p2;
     private Float media;
     private String situacao;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public Float getP1() {
        return p1;
    }

    public Float getP2() {
        return p2;
    }

    public Float getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setP1(Float p1) {
        this.p1 = p1;
    }

    public void setP2(Float p2) {
        this.p2 = p2;
    }

    public String calcularMedia() {
         media = (p1 + p2) / 2;
         if (media >= 6) {
             situacao = "Aprovado";
         }
         else if (media >= 3) {
             situacao = "Substitutiva";
         }
         else {
             situacao = "Reprovado";
         }
         return "/media";
    }

}
