package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import util.Messages;

@FacesValidator("validator.telefoneValidator")
public class TelefoneValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String fone = value.toString();
        if (fone.length()==0) {
            String msg = Messages.getString("msgs", "obrigatorio");
            FacesMessage message = new FacesMessage(msg);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
        if (fone.length() < 8 || fone.length() > 15) {
            String msg = Messages.getString("msgs", "tamanhoTel");
            FacesMessage message = new FacesMessage(msg);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
    }
    
}
