package converter;

import java.util.Locale;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("converter.LocalizacaoConverter")
public class LocalizacaoConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        return Locale.forLanguageTag(string);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return ((Locale)o).toLanguageTag();
    }
    
}
