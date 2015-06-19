/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author ciro
 */
@ManagedBean(name = "user")
@SessionScoped
public class SimpleLogin {
    private static final String LOGIN = "ciro";
    private static final String PASSWORD = "123";
    private String loginname;
    private String password;
    private boolean contato;
    private List<String> cores;
    private String educacao;
    private int ano;
    private List<String> idiomas;

    /**
     * Creates a new instance of SimpleLogin
     */
    public SimpleLogin() {
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }
    
    public List<SelectItem> getIdiomasFluentes() {
        List<SelectItem> idiomas = new ArrayList<>();
        idiomas.add(new SelectItem("Ing", "Inglês"));
        idiomas.add(new SelectItem("Esp", "Espanhol"));
        idiomas.add(new SelectItem("Fra", "Francês"));
        idiomas.add(new SelectItem("Ita", "Italiano"));
        return idiomas;
    }
            
    public List<String> getAnosEducacao() {
        List<String> anos = new ArrayList<>();
        int anoAtual = new GregorianCalendar().get(GregorianCalendar.YEAR);
        for (int i = 0; i < 20; i++) {
            anos.add(String.valueOf(anoAtual - i));
        }
        return anos;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    public String getEducacao() {
        return educacao;
    }

    public void setEducacao(String educacao) {
        this.educacao = educacao;
    }

    public List<String> getCores() {
        return cores;
    }

    public void setCores(List<String> cores) {
        this.cores = cores;
    }
    
    public boolean isContato() {
        return contato;
    }

    public void setContato(boolean contato) {
        this.contato = contato;
    }
    
    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String validar() {
        if (loginname.equals(LOGIN) && password.equals(PASSWORD)) {
            return "/success";
        }
        return "/fail";
    }
}


