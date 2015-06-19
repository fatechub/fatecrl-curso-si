package converter;

import java.util.Locale;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Adam Macias, Flávia Souza, Ramon Duran
 */
@FacesConverter("converter.LocalizacaoConverter")
public class LocalizacaoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return Locale.forLanguageTag(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return ((Locale) value).toLanguageTag();
    }
}
