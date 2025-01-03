package JDBC;

import java.sql.*;

public class Mainl {
    public static void main(String[] args) throws Exception
    {
        System.out.println("Hello world!");

        String URL = "jdbc:mysql://localhost:3306/javadb";
        String NAME = "root";
        String PASSWORD = "prajusuju6";
        String QUERY = "select * from employee";

        Connection connection = DriverManager.getConnection(URL,NAME,PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(QUERY);

        while(resultSet.next()) {

            System.out.println("ID is : " + resultSet.getInt(1));
            System.out.println("NAME is : " + resultSet.getString(2));
            System.out.println("SALARY is : " + resultSet.getInt(3));

            System.out.println(" ");
            System.out.println(" _______________________________ ");
            System.out.println(" ");

        }
    }
}
