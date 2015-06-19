package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import model.Item;

@ManagedBean
@SessionScoped
public class CarrinhoBackBean implements Serializable {

    private List<Item> itens = new ArrayList<>();

    public CarrinhoBackBean() {
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Double getTotal() {
        Double tot = 0.0;
        for (Item i : itens) {
            tot += i.getQuantidade() * i.getValor();
        }
        return tot;
    }

    public String adicionar(Item item) {
        boolean novo = true;
        item.setQuantidade(item.getQuantidade() - 1);
        for (Item i : itens) {
            if (i.equals(item)) {
                i.setQuantidade(i.getQuantidade() + 1);
                novo = false;
                break;
            }
        }
        if (novo) {
            itens.add(new Item(item.getId(), item.getDescricao(), 1,
                    item.getValor()));
        }
        return null;
    }

    public String excluir(Item item) {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
        ItensBackBean itensBackBean = (ItensBackBean) session.getAttribute("itensBackBean");
        if (itensBackBean != null) {
            for (Item i : itensBackBean.getItens()) {
                if (i.equals(item)) {
                    i.setQuantidade(i.getQuantidade() + 1);
                    break;
                }
            }
        }
        if (item.getQuantidade() > 1) {
            item.setQuantidade(item.getQuantidade() - 1);
        } else {
            itens.remove(item);
        }
        return null;
    }
}
