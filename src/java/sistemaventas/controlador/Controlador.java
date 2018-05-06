/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sistemaventas.dao.PaisAdm;
import sistemaventas.dao.UsuarioAdm;
import sistemaventas.modelo.adm.ISeguridadAdm;
import sistemaventas.modelo.adm.IUsuarioAdm;
import sistemaventas.modelo.adm.SeguridadAdmSQLOra;
import sistemaventas.modelo.adm.UsuarioAdmSQLOra;
import sistemaventas.vo.Pais;
import sistemaventas.vo.Usuario;
        

/**
 *
 * @author Admin
 */
public class Controlador extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
        
        String userName = request.getParameter("j_username");
        String userClave = request.getParameter("j_password");
        String mensaje;

        /*
        UsuarioAdm usuarioAdm = new UsuarioAdm();
        Usuario usu = usuarioAdm.getUsuario(userName);
        */
        ISeguridadAdm seguAdm = new SeguridadAdmSQLOra();
        Usuario usuObj = seguAdm.validarUsuario(userName, userClave);
        //if (userClave.equals(usu.getClave())) {
        if (usuObj != null){
            HttpSession sesion = request.getSession();
            sesion.setAttribute("bUsuario", usuObj);
            
            mensaje="Clave correcta";
            IUsuarioAdm usuAdm = new UsuarioAdmSQLOra();
            
            ArrayList<Usuario> listaUsuarios = usuAdm.getUsuarios();
            request.setAttribute("listaUsu", listaUsuarios);
            RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/usuario/listaUsuarios.jsp");
            dispatcher.forward(request, response);
        }else{
            mensaje="Clave Incorrecta";
            response.sendRedirect("jsp/mensaje.jsp?pusername="+userName+"&pmensaje="+mensaje);
        }
        /*
        try (PrintWriter out = response.getWriter()) {
    
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mi primera pagina con Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bienvenido Usuario: "+userName+"</h1>");
            out.println("<p>Mensaje: "+mensaje+"</p>");
            out.println("</body>");
            out.println("</html>");
        }
        */
    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
