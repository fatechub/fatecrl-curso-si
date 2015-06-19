package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import model.Item;

@ManagedBean
@SessionScoped
public class ItensBackBean implements Serializable {

    private List<Item> itens = new ArrayList<>();

    public ItensBackBean() {
        itens.add(new Item(1, "Cerveja", 10, 2.56));
        itens.add(new Item(2, "Refrigerante", 20, 1.99));
        itens.add(new Item(3, "Suco", 15, 4.19));
        itens.add(new Item(4, "Carvão", 10, 7.89));
        itens.add(new Item(5, "Carne", 5, 29.9));
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Item> getItens() {
        return itens;
    }
}
