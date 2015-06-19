/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.beans;

import financas.model.Conta;
import financas.model.DAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author ciro
 */
@ManagedBean
@SessionScoped
public class ContaBackBean implements Serializable {

    private List<Conta> filtradas;
    private Conta conta = new Conta();
    private List<Conta> contas = new ArrayList<>();
    private boolean desabilitar = true;

    /**
     * Creates a new instance of ContaBackBean
     */
    public ContaBackBean() {
    }

    public List<Conta> getFiltradas() {
        return filtradas;
    }

    public void setFiltradas(List<Conta> filtradas) {
        this.filtradas = filtradas;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public boolean isDesabilitar() {
        return desabilitar;
    }

    public void setDesabilitar(boolean desabilitar) {
        this.desabilitar = desabilitar;
    }

    public String cadastrar() {
        DAO dao = new DAO(Conta.class);
        dao.adicionar(conta);
        conta = new Conta();
        return null;
    }

    public String listarContas() {
        DAO dao = new DAO(Conta.class);
        contas = dao.listarGenerico("Conta.listarTodas");
        return "/listcontas";
    }

    public String consultarConta() {
        conta = new Conta();
        desabilitar = true;
        return "/consconta";
    }

    public String consultar() {
        DAO dao = new DAO(Conta.class);
        conta = (Conta) dao.consultar(conta.getId());
        if (conta == null) {
            FacesContext fc = FacesContext.getCurrentInstance();
            FacesMessage message = new FacesMessage("Não existe uma conta com esse id");
            fc.addMessage("frm:botao", message);
            conta = new Conta();
            desabilitar = true;
        } else {
            desabilitar = false;
        }
        return null;
    }

    public String alterarConta() {
        return "/altconta";
    }

    public String alterar() {
        DAO dao = new DAO(Conta.class);
        dao.alterar(conta);
        return "/consconta";
    }

    public String excluir() {
        DAO dao = new DAO(Conta.class);
        dao.excluir(conta.getId());
        desabilitar = true;
        conta = new Conta();
        return null;
    }

    public boolean consultarPorNome(Object value, Object filter, Locale locale) {
        String filterText = (filter == null) ? null : filter.toString().trim();
        String valueText = (value == null) ? null : value.toString();
        if (filterText == null || filterText.equals("")) {
            return true;
        }
        if (valueText == null) {
            return false;
        }
        return valueText.matches("(?i).*" + filterText + ".*");
    }

    public void onEdit(RowEditEvent event) {
        Conta c = (Conta) event.getObject();
        DAO<Conta> dao = new DAO(Conta.class);
        dao.alterar(c);
        FacesMessage msg = new FacesMessage("Conta atualizada", c.getTitular());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onCancel(RowEditEvent event) {
        Conta c = (Conta) event.getObject();
        FacesMessage msg = new FacesMessage("Atualização cancelada", c.getTitular());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onDelete(Conta c) {
        DAO<Conta> dao = new DAO(Conta.class);
        dao.excluir(c.getId());
        contas.remove(c);
        FacesMessage msg = new FacesMessage("Conta removida", c.getTitular());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}
