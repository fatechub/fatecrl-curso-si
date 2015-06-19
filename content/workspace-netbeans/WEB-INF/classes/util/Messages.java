
package util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import javax.faces.context.FacesContext;

public class Messages {
    public static String getString(String resourceBundleName,String resourceBundleKey, Object ... params)throws MissingResourceException {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ResourceBundle bundle = facesContext.getApplication().
        getResourceBundle(facesContext, resourceBundleName);
        String msg = bundle.getString(resourceBundleKey);
        for (Object param : params) {
            msg += param;
        }
    return msg;
    }
}
