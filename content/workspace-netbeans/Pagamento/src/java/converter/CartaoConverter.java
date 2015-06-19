/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import model.Cartao;

/**
 *
 * @author ciro
 */
@FacesConverter(forClass = Cartao.class)
public class CartaoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) throws ConverterException {
        StringBuilder convertida
                = new StringBuilder(value.toString());
        boolean invalido = false;
        char caractereInvalido = '\0';
        for (int i = 0; i < convertida.length() && !invalido; i++) {
            char ch = convertida.charAt(i);
            if (!Character.isDigit(ch)) {
                if (ch == ' ' || ch == '.') {
                    convertida.deleteCharAt(i);
                } else {
                    invalido = true;
                    caractereInvalido = ch;
                }
            }
        }
        if (invalido) {
            FacesMessage message = new FacesMessage(
                    "Erro de conversão no número do cartão: caractere inválido ("
                    + caractereInvalido + ")");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(message);
        }
        return new Cartao(convertida.toString());
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
// retorna o cartão no formato XXXX XXXX XXXX XXXX
        int[] limites = {4, 8, 12};
        int fim, inicio = 0;
        StringBuilder resultado = new StringBuilder();
        String valor = value.toString();
        for (int i = 0; i < limites.length
                && limites[i] < valor.length(); i++) {
            fim = limites[i];
            resultado.append(valor.substring(inicio, fim));
            resultado.append(" ");
            inicio = fim;
        }
        resultado.append(valor.substring(inicio));
        return resultado.toString();
    }

}
