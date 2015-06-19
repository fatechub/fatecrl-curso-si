import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CustomerAjax extends Customer{

    private String message;

    public CustomerAjax() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBalance() {
        CustomerTable service = new CustomerTable();
        Customer c = service.findCustomer(getAccount());
        if (c == null) {
            message = "Conta desconhecida";
        } else {
            if (!getPassword().equals(c.getPassword())) {
                message = "Senha incorreta";
            } else {
                message
                        = String.format("Saldo de %s %s é R$ %.2f",
                                c.getFirstName(), c.getLastName(),
                                c.getBalance());
            }
        }
        return null;
    }
}
