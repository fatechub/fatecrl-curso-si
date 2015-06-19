import java.util.ArrayList;
import java.util.List;

public class CustomerTable {
    private List<Customer> customers;
    public CustomerTable() {
        customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "123", "Flávia", 
                      "Souza", 500.0f));
        customers.add(new Customer(2, "234", "Ramon", 
                      "Duran", 10000.0f));
    }
    
    public Customer findCustomer(int account) {
        for (Customer c : customers)
            if (c.getAccount() == account)
                return c;
        return null;
    }
}