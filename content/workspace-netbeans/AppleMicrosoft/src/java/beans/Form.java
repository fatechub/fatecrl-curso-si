package beans;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
@RequestScoped
public class Form {

    private String outcome;
    private static final Rectangle APPLE
            = new Rectangle(0, 0, 270, 340);
    private static final Rectangle MICROSOFT
            = new Rectangle(280, 0, 270, 340);

    public Form() {
    }

    public void trataCliqueMouse(ActionEvent e) {
        FacesContext context
                = FacesContext.getCurrentInstance();
        String clientId
                = e.getComponent().getClientId(context);
        Map<String, String> requestParams
                = context.getExternalContext().getRequestParameterMap();
        int x = new Integer((String) requestParams.get(clientId + ".x"));
        int y = new Integer((String) requestParams.get(clientId + ".y"));
        outcome = null;
        if (APPLE.contains(new Point(x, y))) {
            outcome = "apple";
        } else if (MICROSOFT.contains(new Point(x, y))) {
            outcome = "microsoft";
        }
    }

    public String go() {
        return outcome;
    }
}
