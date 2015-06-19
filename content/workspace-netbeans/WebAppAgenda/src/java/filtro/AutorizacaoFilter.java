package filtro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Usuario;

@WebFilter(filterName = "AutorizacaoFilter", urlPatterns = {"/faces/sistema/*"})
public class AutorizacaoFilter implements Filter {

    public AutorizacaoFilter() {
    }
    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Usuario user = (Usuario) ((HttpServletRequest) request).getSession().getAttribute("usuariosession");
        if (user != null && user.getId()>0) {
            chain.doFilter(request, response);
        } else {
            String contextPath = ((HttpServletRequest) request).getContextPath();
            ((HttpServletResponse) response).sendRedirect(contextPath + "/faces/index.xhtml?msg=Faça o login!");
        }
    }
    
    public void destroy() {
         
    }
    
    public void init(FilterConfig filterConfig) {

    }

}
