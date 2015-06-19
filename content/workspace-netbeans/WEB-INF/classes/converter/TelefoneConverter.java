package converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import model.Telefone;
import util.Messages;

@FacesConverter(forClass = Telefone.class)
public class TelefoneConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        StringBuilder convertida = new StringBuilder(value.toString());
        boolean invalido = false;
        char caractereInvalido = '\0';
        for (int i = 0; i < convertida.length() && !invalido; i++) {
            char ch = convertida.charAt(i);
            if (!Character.isDigit(ch)) {
                if (ch == ' ' || ch == '-' || ch == '(' || ch == ')') {
                    convertida.deleteCharAt(i);
                } else {
                    invalido = true;
                    caractereInvalido = ch;
                }
            }
        }
        if (invalido) {
            String msg = Messages.getString("msgs", "erroConversao");
            FacesMessage message = new FacesMessage(msg);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(message);
        }
        return new Telefone(convertida.toString());
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        StringBuilder resultado = new StringBuilder();
        String valor = value.toString();
        switch (valor.length()) {
            case 8: // formato: 9999-9999
                resultado.append(valor.substring(0, 4));
                resultado.append("-").append(valor.substring(4, 8));
                break;
            case 9: // formato: 99999-9999
                resultado.append(valor.substring(0, 5));
                resultado.append("-").append(valor.substring(5, 9));
                break;
            case 10: // formato: (99) 9999-9999
                resultado.append("(").append(valor.substring(0, 2)).append(") ");
                resultado.append(valor.substring(2, 6));
                resultado.append("-").append(valor.substring(6, 10));
                break;
            case 11: // formato: (99) 99999-9999
                resultado.append("(").append(valor.substring(0, 2)).append(") ");
                resultado.append(valor.substring(2, 7));
                resultado.append("-").append(valor.substring(7, 11));
                break;
            default: // formato: nenhum
                resultado.append(valor);
        }
        return resultado.toString();
    }

}
