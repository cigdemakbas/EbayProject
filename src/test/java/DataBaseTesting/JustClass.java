package DataBaseTesting;

import DataBaseTesting.JDBCutils.JDBC;

import java.sql.*;

public class JustClass{
    // 1-Create connection
    // 2- Create statement (query)
    // 3- Execute statement  (query)
    // 4- Store result in resultSet
    // 5- Close connection

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/3306/classicmodels"; // Change this
        String username = "root"; // Change this
        String password = "rootuser"; // Change this

        Connection conn = DriverManager.getConnection(url,username,password);
        Statement stmt = conn.createStatement();
        stmt.execute("Insert into cigdem (name) VALUES ('I added this from java code)' ");
        System.out.println("insert is successful");
        conn.close();
        System.out.println("Connectin closed");
    }

}
