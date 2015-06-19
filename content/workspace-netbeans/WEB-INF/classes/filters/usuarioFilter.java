package filters;

import beans.UsuarioBackBean;
import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "usuarioFilter", urlPatterns = {"/faces/protected/*"}, dispatcherTypes = DispatcherType.REQUEST)
public class usuarioFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpSession session = ((HttpServletRequest) request).getSession();
        UsuarioBackBean u = (UsuarioBackBean) session.getAttribute("usuarioBackBean");

        if (u.getUsuario() != null && u.isAutorizado()) {
            chain.doFilter(request, response);
        } else {
            String contextPath = ((HttpServletRequest) request).getContextPath();
            ((HttpServletResponse) response).sendRedirect(contextPath + "/faces/login.xhtml?msgAutorizacaoFilter=Faca o Login");
        }

    }

    @Override
    public void destroy() {
    }

}
