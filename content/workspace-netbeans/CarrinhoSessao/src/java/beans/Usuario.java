package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import model.Item;

@ManagedBean
@SessionScoped
public class Usuario {
    private static String LOGIN = "ramon";
    private static String SENHA = "123";

    /**
     * @return the LOGIN
     */
    public static String getLOGIN() {
        return LOGIN;
    }

    /**
     * @param aLOGIN the LOGIN to set
     */
    public static void setLOGIN(String aLOGIN) {
        LOGIN = aLOGIN;
    }

    /**
     * @return the SENHA
     */
    public static String getSENHA() {
        return SENHA;
    }

    /**
     * @param aSENHA the SENHA to set
     */
    public static void setSENHA(String aSENHA) {
        SENHA = aSENHA;
    }
    private String login;
    private String senha;
    private boolean autorizado;

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the autorizado
     */
    public boolean isAutorizado() {
        return autorizado;
    }

    /**
     * @param autorizado the autorizado to set
     */
    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }
    
    public String autorizar(){
        if(login.equals(LOGIN) && senha.equals(SENHA)){
            autorizado = true;
            return "/protegido/index";
        }
        else{
            autorizado = false;
            return null;
        }
    }
    
    public String sair(){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession)context.getExternalContext().getSession(false);
        if(session!=null)
            session.invalidate();
        return "/login";        
    }
}
