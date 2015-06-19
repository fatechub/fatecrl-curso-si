package beans;
 
import java.util.ArrayList;
import java.util.Date; 
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.faces.validator.ValidatorException;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import models.Service;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
 
/**
 *
 * @author Adam Macias, Flávia Souza, Ramon Duran
 */
@ManagedBean(name = "cadastro")
@SessionScoped
public class Cadastro {
    @NotEmpty(message="O Nome deve ser informado!")
    private String name;    
    @NotEmpty(message="O Email deve ser informado!")
    @Email(message="Informe um Email válido!")
    private String email;    
    @NotEmpty(message="O Telefone deve ser informado!")
    @Pattern(regexp = "[0-9]+", message="Digite apenas numeros!")
    @Length(min=8, message="O telefone deve conter ao menos 8 digitos!")
    private String phone;
    private Date dateborn;    
    private String gender;
    @NotNull(message="O CEP deve ser informado!")
    @Pattern(regexp = "[0-9]+", message="Digite apenas numeros!")
    @Length(min=8, max=8, message="O CEP deve conter 8 digitos!")    
    private String cep;    
    private String address;
    private String neighborhood;
    private String city;    
    @NotEmpty(message="Um UF deve ser informado!")
    private String state;
    @NotEmpty(message="Um serviço deve ser informado!")
    private ArrayList<String> services;
    private Double price; 

    public Cadastro() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the dateborn
     */
    public Date getDateborn() {
        return dateborn;
    }

    /**
     * @param dateborn the dateborn to set
     */
    public void setDateborn(Date dateborn) {
        this.dateborn = dateborn;
    }
    
    /**
     * @void validate dateborn for past
     * @param context
     * @param component
     * @param value
     */
    public void validateDateborn(FacesContext context, UIComponent component, Object value) {
        Date dateCurrent = new Date();
        dateborn = (Date) value != null ? (Date) value : dateCurrent;
        if (!dateCurrent.after(dateborn))
            throw new ValidatorException(new FacesMessage("Digite uma data no passado."));
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the neighborhood
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * @param neighborhood the neighborhood to set
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * @return the List<SelectItem> states
     */
    public List<SelectItem> getStatesList() {
        List<SelectItem> states = new ArrayList<>();        
        states.add(new SelectItem("São Paulo", "SP"));
        states.add(new SelectItem("Rio de Janeiro", "RJ"));
        states.add(new SelectItem("Rio grande do Sul", "RS"));
        return states;
    }

    /**
     * @return the services
     */
    public ArrayList<String> getServices() {
        return services;
    }

    /**
     * @param services the services to set
     */
    public void setServices(ArrayList<String> services) {
        this.services = services;
    }
    
    /**
     * @return the List<Service> services
     */
    public List<Service> getServicesList() {
        List<Service> servicesList = new ArrayList<>();
        servicesList.add(new Service(0,"Telefonia",29.90));
        servicesList.add(new Service(1,"TV",39.90));
        servicesList.add(new Service(2,"Internet",49.90));
        return servicesList;
    }
    
    /**
     * @return the price
     */
    public Double getPrice() {
        return Math.round(price * 100.0) / 100.0;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {        
        this.price = price;
    }
    
    /**
     * @return the "/confirmacao"
     */
    public String finalizar(){ 
        this.price = 0.0;
        
        for (String s : this.getServices()) {
            switch(s){
                case "Telefonia" : 
                    this.price += 29.9; 
                    break;
                case "TV" : 
                    this.price += 39.9; 
                    break;
                case "Internet" : 
                    this.price += 49.9; 
                    break;                   
            }
        }
        
        if( this.price >= 119.6){
            this.price -= (119.70 * 0.25);
        }
        
        return "/confirmacao"; 
    }
    
}

/**
 * Referencias:
 * http://www.jsftoolbox.com/documentation/help/12-TagReference/core/f_convertDateTime.html
 * https://serjaum.wordpress.com/2010/05/02/jsf-validando-data-inicial-e-data-final/
 * http://stackoverflow.com/questions/17754849/spring-3-2-date-time-format
 * http://www.javacodegeeks.com/2014/06/spring-4-datetimeformat-with-java-8-date-time-api.html
 * http://www.mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/
 * https://docs.oracle.com/javaee/6/api/javax/validation/constraints/package-summary.html
 * http://blog.triadworks.com.br/suporte-a-html5-com-jsf-2-2
 * http://stackoverflow.com/questions/7084706/hibernate-validator-length-how-to-specify-separate-message-for-min-and-max
 * http://stackoverflow.com/questions/1458535/which-types-can-be-used-for-java-annotation-members
 * http://showcase.omnifaces.org/converters/SelectItemsConverter
 * https://www.youtube.com/watch?v=MoU-wv4pB10
 * http://www.guj.com.br/java/229970-duvida-como-formatar-valores-para-moeda-corrente-em-javaresolvido
 * http://examples.javacodegeeks.com/core-java/util/arraylist/arraylist-in-java-example-how-to-use-arraylist/
 * http://crunchify.com/how-to-iterate-through-java-list-4-way-to-iterate-through-loop/
 * http://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
 * import javax.faces.event.ValueChangeEvent;
 * http://showcase.omnifaces.org/converters/ListConverter
 * https://javaserverfaces.java.net/nonav/docs/2.0/javadocs/javax/faces/convert/package-summary.html
 */