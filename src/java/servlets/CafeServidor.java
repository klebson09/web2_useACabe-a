package servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author slk
 */
public class CafeServidor extends HttpServlet {

  
   
   
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Sua opção foi processada com sucesso");
        String tipo = request.getParameter("tipo");
        out.println("<br> Conselho sobre o café &nbsp" + tipo);
        
    }
}
