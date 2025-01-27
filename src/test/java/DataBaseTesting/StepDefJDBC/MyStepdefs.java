package DataBaseTesting.StepDefJDBC;

import DataBaseTesting.JDBCutils.JDBC;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class MyStepdefs extends JDBC {
    private Connection connection;

    @Given("I have connected to the database")
    public void iHaveConnectedToTheDatabase() {
        String url = "jdbc:mysql://localhost:3306/your_database"; // Change this
        String username = "root"; // Change this
        String password = ""; // Change this

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database: " + e.getMessage());
        }
    }

    @Then("I verify that the employee with ID {int} exists in the database")
    public void i_verify_that_the_employee_exists_in_the_database(int employeeId) throws SQLException {
        Connection conn = JDBC.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Employees WHERE EmployeeID = " + employeeId);

        JDBC.closeConnection(conn, stmt, rs);
    }
}
