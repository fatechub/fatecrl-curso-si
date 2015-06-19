package listener;

import java.util.Locale;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class IdiomaListener implements ValueChangeListener{

    @Override
    public void processValueChange(ValueChangeEvent vce) throws AbortProcessingException {
        FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale)vce.getNewValue());
    }
}
