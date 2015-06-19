package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.http.HttpSession;
import model.DAO;
import model.Usuario;
import util.JPAEntityManager;
import util.Messages;

@ManagedBean
@SessionScoped
public class UsuarioBackBean extends Usuario implements Serializable{
    private Usuario usuario;
    private boolean autorizado;

    public UsuarioBackBean() {
        this.usuario = new Usuario();
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String autorizarUsuario(UsuarioBackBean u) {
        EntityManager entity = JPAEntityManager.getEntityManager();
        String targetURL = "";
        List<Usuario> users = new ArrayList<>();

        Query query = entity.createNamedQuery("Usuario.consultaLogin");
        query.setParameter(1, u.getUsuario().getNomeUsuario());
        query.setParameter(2, u.getUsuario().getSenha());

        users = query.getResultList();
        
        for (Usuario usuarioBanco : users) {
            if (usuarioBanco != null) {
                this.autorizado = true;
                
                this.usuario = usuarioBanco;
                targetURL = "/protected/index";
                return targetURL;
            }
        }
        String msg = Messages.getString("msgs", "usuarioSenha");
        FacesMessage message = new FacesMessage(msg);
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, message);      
        return "/login";
    }

    public String logout() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
        session.invalidate();
        autorizado = false;
        return "/login";
    } 
    
    public String verificaUsuario(ActionEvent event) {
        DAO dao = new DAO(Usuario.class);
        Usuario consulta =(Usuario) dao.consultar(usuario.getNomeUsuario());
        if (consulta == null) {
            cadastrar();
        } else {
            String msg = Messages.getString("msgs", "usuarioExiste");
            FacesMessage message = new FacesMessage(msg);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.addMessage(null, message);
        }
        return null;
    }
    
    public String cadastrar() {
        DAO dao = new DAO(Usuario.class);
        dao.adicionar(usuario);
        usuario = new Usuario();
        String msg = Messages.getString("msgs", "cadSucesso");
        FacesMessage message = new FacesMessage(msg);
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, message);
        return null;
    }
}
