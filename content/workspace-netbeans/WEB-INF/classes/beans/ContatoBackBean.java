package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Contato;
import model.DAO;
import org.primefaces.event.RowEditEvent;
import util.Messages;

@ManagedBean
@SessionScoped
public class ContatoBackBean implements Serializable {

    private List<Contato> filtrados;
    private Contato contato = new Contato();
    private List<Contato> contatos = new ArrayList<>();
    private boolean desabilitar = true;

    public ContatoBackBean() {
    }

    public List<Contato> getFiltrados() {
        return filtrados;
    }

    public void setFiltrados(List<Contato> filtrados) {
        this.filtrados = filtrados;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public boolean isDesabilitar() {
        return desabilitar;
    }

    public void setDesabilitar(boolean desabilitar) {
        this.desabilitar = desabilitar;
    }

    public String verificaEmail() {
        DAO dao = new DAO(Contato.class);
        Contato consulta =(Contato) dao.consultar(contato.getEmail());
        if (consulta == null) {
            cadastrar();
        } else {
            String msg = Messages.getString("msgs", "jaExiste");
            FacesMessage message = new FacesMessage(msg);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.addMessage("frmCadastro:btnCad", message);
        }
        return null;
    }

    public String cadastrar() {
        DAO dao = new DAO(Contato.class);
        dao.adicionar(contato);
        contato = new Contato();
        String msg = Messages.getString("msgs", "cadSucesso");
        FacesMessage message = new FacesMessage(msg);
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage("frmCadastro:btnCad", message);
        return null;
    }

    public String listarContatos() {
        DAO dao = new DAO(Contato.class);
        contatos = dao.listarGenerico("Contato.listarTodos");
        return "/protected/listcontatos";
    }

    public String consultarContatos() {
        contato = new Contato();
        desabilitar = true;
        return "/protected/conscontato";
    }

    public String consultar() {
        DAO dao = new DAO(Contato.class);
        contato = (Contato) dao.consultar(contato.getEmail());
        if (contato == null) {
            String msg = Messages.getString("msgs", "naoExiste");
            FacesMessage message = new FacesMessage(msg);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.addMessage("frm:botao", message);
            contato = new Contato();
            desabilitar = true;
        } else {
            desabilitar = false;
        }
        return null;
    }

    public String alterarContato() {
        return "/protected/altcontato";
    }

    public String alterar() {
        DAO dao = new DAO(Contato.class);
        dao.alterar(contato);
        return "/protected/conscontato";
    }

    public String excluir() {
        DAO dao = new DAO(Contato.class);
        dao.excluir(contato.getEmail());
        desabilitar = true;
        String msg = Messages.getString("msgs", "excSucesso");
        FacesMessage message = new FacesMessage(msg);
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage("frm:btnExcluir", message);
        contato = new Contato();
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
        Contato c = (Contato) event.getObject();
        DAO<Contato> dao = new DAO(Contato.class);
        dao.alterar(c);
        String msg = Messages.getString("msgs", "contAtualizado", "\n" + c.getNomeContato());
        FacesMessage message = new FacesMessage(msg);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, message);
    }

    public void onCancel(RowEditEvent event) {
        Contato c = (Contato) event.getObject();
        String msg = Messages.getString("msgs", "atuCancelada", "\n" + c.getNomeContato());
        FacesMessage message = new FacesMessage(msg);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, message);
    }

    public void onDelete(Contato c) {
        DAO<Contato> dao = new DAO(Contato.class);
        dao.excluir(c.getEmail());
        contatos.remove(c);
        String msg = Messages.getString("msgs", "excSucesso", "\n" + c.getNomeContato());
        FacesMessage message = new FacesMessage(msg);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, message);
    }

}
