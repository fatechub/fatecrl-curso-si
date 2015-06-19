package managedbeans;

import models.DAO;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import models.Contato;
import models.Usuario;

/**
 *
 * @author Adam Macias, Flávia Souza, Ramon Duran
 */
@ManagedBean(name = "UsuarioMB")
@SessionScoped
public class UsuarioMB implements Serializable {
    
    private Usuario usuario = new Usuario();
    private Contato contato = new Contato();
    private List<Usuario> usuarios = new ArrayList<>(); 
    private List<Contato> contatos = new ArrayList<>();

    public UsuarioMB() {} 

    /*
     * Functions Usuario
     */
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }    
    
    public String loginUsuario() throws Exception {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);

        DAO dao = new DAO(Usuario.class);
        Usuario usuriofind = (Usuario) dao.getRow("Usuario.logar", usuario.getLogin(), usuario.getSenha());        
        if (usuriofind!=null) {
            session.setAttribute("usuariosession", usuriofind );
            usuario = new Usuario();
            return "/sistema/painel";
        }else{
            FacesMessage msg = new FacesMessage("Login ou senha incorretos!");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return null;
        }
    }
    
    public String logoutUsuario(){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession)context.getExternalContext().getSession(false);
        if(session!=null)
            session.invalidate();
        return "/index";        
    }
    
    public Usuario getUsuarioAuth() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(false); 
        Usuario usuariosession = (Usuario) session.getAttribute("usuariosession");
        Usuario usuariologado = consultaUsuario( usuariosession.getId() );
        return usuariologado;
    }
    
    public Usuario consultaUsuario(long Id) {
        DAO dao = new DAO(Usuario.class);
        Usuario usuriofind = (Usuario) dao.getRow("Usuario.consultaUsuario", Id);
        return usuriofind;
    }
        
    public String cadastrarUsuario() throws SQLException { 
        DAO dao = new DAO(Usuario.class); 
        Usuario usuriofind = (Usuario) dao.getRow("Usuario.consultaUsuarioPorLogin", usuario.getLogin());        
        if (usuriofind!=null) {
            FacesMessage msg = new FacesMessage("OPSSS! Já existe um login igual a esse, tente outro.", usuario.getLogin());            
            FacesContext.getCurrentInstance().addMessage(null, msg);
            usuario.setLogin("");
        }else{            
            DAO daox = new DAO(Usuario.class);
            daox.adicionar(usuario);
            FacesMessage msg = new FacesMessage("Usuario cadastrado com Sucesso!", usuario.getLogin());
            FacesContext.getCurrentInstance().addMessage(null, msg);
            usuario = new Usuario();                   
        }
        return null;
    }
    
    /*
     * Functions Contato
     */
    
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
    
    public String cadastrarContato() {
        DAO dao = new DAO(Contato.class);
        contato.setUsuario( this.getUsuarioAuth() );
        dao.adicionar(contato);
        FacesMessage msg = new FacesMessage("Contato cadastrado com Sucesso!", contato.getNome());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        contato = new Contato();
        return null;
    }
    
    public String editarContato(Contato contato) {        
        if(contato!=null) { 
            this.contato = contato; 
        }else{
            DAO dao = new DAO(Contato.class);
            dao.alterar(this.contato);
            FacesMessage msg = new FacesMessage("Contato editado com Sucesso!", this.contato.getNome());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }        
        return "/sistema/contatoseditar";
    }
    
    public String deletarContato(Contato contato) {        
        DAO dao = new DAO(Contato.class);
        dao.excluir(contato.getId());
        FacesMessage msg = new FacesMessage("Contato deletado com Sucesso!", contato.getNome());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        this.contato = new Contato();
        return "/sistema/contatos";
    }
    
    public List<Contato> consultarContatos() throws SQLException {
        DAO dao = new DAO(Usuario.class);
        contatos = dao.listarGenerico("Usuario.listarContatos", this.getUsuarioAuth());
        contato = new Contato();
        return contatos;
    }
    
    public String consultarContatosPorNome() throws SQLException {        
        DAO dao = new DAO(Usuario.class);
        contatos = dao.listarGenerico("Usuario.listarContatosPorNome", this.getUsuarioAuth(), "%"+contato.getNome()+"%");
        contato = new Contato();
        return null;
    }
    
    /*
     * Functions Helps
     */
    
    public String converterTelefone(String valor){
        StringBuilder resultado = new StringBuilder();
        //String valor = value.toString();
        switch (valor.length()) {
            case 8: // formato: 9999-9999
                resultado.append(valor.substring(0, 4));
                resultado.append("-").append(valor.substring(4, 8));
                break;
            case 9: // formato: 99999-9999
                resultado.append(valor.substring(0, 5));
                resultado.append("-").append(valor.substring(5, 9));
                break;
            case 10: // formato: (99) 9999-9999
                resultado.append("(").append(valor.substring(0, 2)).append(") ");
                resultado.append(valor.substring(2, 6));
                resultado.append("-").append(valor.substring(6, 10));
                break;
            case 11: // formato: (99) 99999-9999
                resultado.append("(").append(valor.substring(0, 2)).append(") ");
                resultado.append(valor.substring(2, 7));
                resultado.append("-").append(valor.substring(7, 11));
                break;
            default: // formato: nenhum
                resultado.append(valor);
        }
        return resultado.toString();
    }
    
}
