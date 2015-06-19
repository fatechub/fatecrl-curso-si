package managedbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.faces.bean.ManagedBean; 
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem; 

/**
 *
 * @author Adam Macias, Flávia Souza, Ramon Duran
 */
@ManagedBean(name = "LocaleMB")
@SessionScoped
public class LocaleMB implements Serializable{

    private String nome;
    private Locale localizacao;
    private static final Locale[] countries = {Locale.forLanguageTag("pt-br"), Locale.ENGLISH};

    public LocaleMB() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Locale getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Locale localizacao) {
        this.localizacao = localizacao;
    }

    public void mudouIdioma(ValueChangeEvent event) {        
        FacesContext.getCurrentInstance().getViewRoot().setLocale( (Locale) event.getNewValue() );
    }

    public List<SelectItem> getIdiomasSuportados() {
        List<SelectItem> idiomas = new ArrayList<>();
        for (Locale loc : countries) {
            idiomas.add(new SelectItem(loc, loc.getDisplayLanguage()));
        }
        return idiomas;
    }
}
