package com.sparta.jas.Model;

import java.sql.*;

public class EmployeeDAO {
    private final String PATH = "jdbc:oracle:thin:@localhost:1521:xe";
    private final String query = "SELECT e.first_name, e.last_name, e.salary FROM employees e WHERE e.department_id = ?";
    private final String USER = "hr";
    private final String PASSWORD = "hr";

    public void getEmployee(String id){
        try (Connection connection = DriverManager.getConnection(PATH, USER, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String firstName = resultSet.getString(1);
                String lastName = resultSet.getString(2);
                int salary = resultSet.getInt(3);
                System.out.println(firstName + " " + lastName + " earns " + salary + " per month");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
