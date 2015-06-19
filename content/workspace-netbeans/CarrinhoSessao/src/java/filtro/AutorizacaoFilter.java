/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtro;

import beans.Usuario;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lab3
 */
@WebFilter(filterName = "AutorizacaoFilter", urlPatterns = {"/faces/protegido/*"})
public class AutorizacaoFilter implements Filter {

    public AutorizacaoFilter() {
    }

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Usuario user = (Usuario) ((HttpServletRequest) request).getSession().getAttribute("usuario");
        if (user != null && user.isAutorizado()) {
            chain.doFilter(request, response);
        } else {
            String contextPath = ((HttpServletRequest) request).getContextPath();
            ((HttpServletResponse) response).sendRedirect(contextPath + "/faces/login.xhtml?msg=Faça o login!");
        }
    }
        /**
         * Destroy method for this filter
         */
    public void destroy() {
         
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {

    }

}
