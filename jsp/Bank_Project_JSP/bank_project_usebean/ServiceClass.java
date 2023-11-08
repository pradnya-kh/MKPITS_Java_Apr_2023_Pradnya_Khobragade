package com.example.bank_project_usebean;

import java.sql.*;

public class ServiceClass {

    Connection connection;


    public ServiceClass() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver Loaded");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_details", "root", "pradnya@1999");
            System.out.println("Connection Successfulley");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int insertRecord(BankAccount_details bankAccountDetails) {
        int result=0;
        try {
            PreparedStatement preparedStatements = connection.prepareStatement("insert into Accountant_detail values(?,?,?,?,?,?,?)");
            preparedStatements.setString(1, bankAccountDetails.getName());
            preparedStatements.setString(2, bankAccountDetails.getUser_id());
            preparedStatements.setString(3, bankAccountDetails.getPassword());
            preparedStatements.setString(4, bankAccountDetails.getMobile());
            preparedStatements.setString(5, bankAccountDetails.getAddress());
            preparedStatements.setString(6, bankAccountDetails.getCity());
            preparedStatements.setInt(7,bankAccountDetails.getBalance());
            result=preparedStatements.executeUpdate();

        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        return result;
    }
    public ResultSet loginAccount(BankAccount_details bankAccountDetails){
        ResultSet resultSet=null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Accountant_detail where User_id=? and Password =?");
            preparedStatement.setString(1,bankAccountDetails.getUser_id());
            preparedStatement.setString(2,bankAccountDetails.getPassword());
            resultSet = preparedStatement.executeQuery();

        }catch (Exception e){
            System.out.println(e);
        }
        return resultSet;
    }
    public int depositAmount(BankAccount_details bankAccountDetails){
        int result=0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update Bank_account set Balance=Balance+? where User_id=?");
            preparedStatement.setInt(1,bankAccountDetails.getBalance());
            preparedStatement.setString(2,bankAccountDetails.getPassword());
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}









