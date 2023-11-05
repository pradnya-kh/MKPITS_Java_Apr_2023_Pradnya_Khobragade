/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pradnya
 */
public class withdraw_Amount extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    static Connection connection;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            /* TODO output your page here. You may use following sample code. */
             int withdraw_amount = Integer.parseInt(request.getParameter("withdraw"));
            HttpSession httpSession = request.getSession();
            String username = httpSession.getAttribute("user_id").toString();
            Date date = new java.sql.Date(httpSession.getCreationTime());
            String transactionType = "Withdraw";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("Driver loaded");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_Details","root","Pradnya@121");
            out.println("connection established");
            
            PreparedStatement preparedStatement = connection.prepareStatement("insert into transactions values(?,?,?,?)");
            preparedStatement.setString(1, username);
            preparedStatement.setDate(2, date);
            preparedStatement.setInt(3, withdraw_amount);
            preparedStatement.setString(4,transactionType);
            int resultSet = preparedStatement.executeUpdate();
            if(resultSet != 0){
                out.println("<h2>withdrawl amount successful</h2>");
            }else{
                out.println("<h2>Unable to withdraw amount</h2>");
            }
            
            PreparedStatement preparedUpdateStatement = connection.prepareStatement("update acount_details set Balance=Balance-? where CustomerID=?");
            preparedUpdateStatement.setString(2, username);
            preparedUpdateStatement.setInt(1, withdraw_amount);
            int updateResultSet = preparedUpdateStatement.executeUpdate();
            if(updateResultSet != 0){
                out.println("<h2>Amount updated successfully</h2>");
            }else{
                out.println("<h2>wUnable to update amount</h2>");
            }
   
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet withdraw_Amount</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet withdraw_Amount at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(withdraw_Amount.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(withdraw_Amount.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(withdraw_Amount.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(withdraw_Amount.class.getName()).log(Level.SEVERE, null, ex);
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
