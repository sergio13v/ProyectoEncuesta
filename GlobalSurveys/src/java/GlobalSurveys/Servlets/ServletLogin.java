/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Servlets;

import GlobalSurveys.Ejb.UsuarioFacade;
import GlobalSurveys.Entity.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Articuno
 */
@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {

    @EJB
    private UsuarioFacade usuarioFacade;
    
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //traigo los parametros del jsp
       String nombre = request.getParameter("un");
       String clave = request.getParameter("pw");
       
       
       
       Usuario user = this.usuarioFacade.buscarPorNombre(nombre);
       
       if (user == null) {
           // El nombre de usuario no existe
           RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
           rd.forward(request, response);
           
           
       } else {
            // Autenticación es correcta
           
            if (user.getPasswd().equals(clave)) {

             
               if (user.getAdmin()== true) {    
                   
                   RequestDispatcher rd = request.getRequestDispatcher("PanelAdmin.jsp");
                   rd.forward(request, response);
                   
               }else{
                   
                    RequestDispatcher rd = request.getRequestDispatcher("PanelUsuario.jsp");
                    rd.forward(request, response);                                                                                            
                   }
                                       
               } else {
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);// La clave no es correcta
           }
       }
       
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }    
    

}
