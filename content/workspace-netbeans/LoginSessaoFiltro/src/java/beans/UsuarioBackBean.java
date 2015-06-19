package beans;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import models.Usuario;

@ManagedBean(name = "UsuarioBackBean")
@SessionScoped
public class UsuarioBackBean implements Serializable {

    private Usuario usuario = new Usuario();

    public UsuarioBackBean() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String login() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
        Usuario usurioEncontrado = null;
        
        // Simulando a busca no banco de dados e retornando o usuario, caso o login e senha conhecidirem.
        if(usuario.getLogin().equals("flavia") && usuario.getSenha().equals("123")){
            usurioEncontrado = new Usuario();
            usurioEncontrado.setId(1L);
            usurioEncontrado.setLogin("fravia");
            usurioEncontrado.setNome("Fraviaaaa Bobona");
            usurioEncontrado.setSenha("123");
        }

        // Se encontrar...
        if (usurioEncontrado!= null) {
            session.setAttribute("usuariosession", usurioEncontrado);
            usuario = new Usuario();
            return "/secreta/index";
        } else {
            FacesMessage msg = new FacesMessage("Login ou senha incorretos!");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return null;
        }
    }

    public String sair() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "/index";
    }

    public Usuario getUsuarioAuth() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
        Usuario usuariosession = (Usuario) session.getAttribute("usuariosession");
        return usuariosession;
    }
}
