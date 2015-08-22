package servlets;
import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import model.EspecialistaEmCafe;

/**
 *
 * @author slk
 */
public class CafeServidor extends HttpServlet {

    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
//        Versão 2
        String tipo = request.getParameter("tipo");
        EspecialistaEmCafe espc = new EspecialistaEmCafe();
        List result = espc.getMarcas(tipo);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Selecione o conselho para o café");
        
        Iterator it = result.iterator();
        while (it.hasNext()) {
           out.print("<br> Especialista: " + it.next());
            
        }
                
//        versão 1
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("Sua opção foi processada com sucesso");
//        String tipo = request.getParameter("tipo");
//        out.println("<br> Conselho sobre o café &nbsp" + tipo);
        
        
        
    }
}
