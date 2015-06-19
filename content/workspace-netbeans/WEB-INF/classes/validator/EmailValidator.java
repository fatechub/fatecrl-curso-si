package validator;

import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import util.Messages;

@FacesValidator("validator.emailValidator")
public class EmailValidator implements Validator {

    private Pattern pattern;
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        if (o == null) {
            return;
        }

        if (!pattern.matcher(o.toString()).matches()) {
            String msg = Messages.getString("msgs", "naoValido");
            FacesMessage message = new FacesMessage(msg);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
    }

}
