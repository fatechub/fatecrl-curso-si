package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Ciro Cirne Trindade
 */
@FacesValidator("validator.Telefone")
public class TelefoneValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String fone = value.toString();
        if (fone.length() < 8 || fone.length() > 15) {
            FacesMessage message = new FacesMessage("O comprimento do telefone deve estar entre 8 e 15. Por exemplo: (99) 9999-9999");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
    }
    
}
