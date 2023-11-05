/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pradnya
 */
@WebServlet(urlPatterns = {"/Registration2"})
public class Registration2 extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        Connection connection;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String CustomerId = request.getParameter("CustomerID");
            String password = request.getParameter("Password");
            String Customer_Name = request.getParameter("CustomerName");
            String Addres = request.getParameter("Address");
            String city = request.getParameter("city");
            int Balance = Integer.parseInt(request.getParameter("Balance"));

            try {
              
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                out.println("Driver Loading");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_Details", "root", "Pradnya@121");
               out.println("Connection Established from database");
                
                 
            

                PreparedStatement preparedStatement = connection.prepareStatement("insert into acount_details values(?,?,?,?,?,?)");
                preparedStatement.setString(1, CustomerId);
                preparedStatement.setString(2, password);
                preparedStatement.setString(3, Customer_Name);
                preparedStatement.setString(4, Addres);
                preparedStatement.setString(5, city);
                preparedStatement.setDouble(6, Balance);
                int returnValue = preparedStatement.executeUpdate();

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
            
           
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Registration2.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Registration2.class.getName()).log(Level.SEVERE, null, ex);
        }
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
