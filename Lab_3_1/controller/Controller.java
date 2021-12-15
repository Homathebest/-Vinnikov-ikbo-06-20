package Lab_3_1.controller;

import Lab_3_1.model.Database;
import Lab_3_1.model.Employee;

import java.sql.SQLException;
import java.util.List;

public class Controller {
    Database db = new Database();
    public Controller() {
        try {
            db.connect();
            db.getFromDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addEmployee(Employee employee) {
        db.addEmployeeToDatabase(employee);
    }
    public List<Employee> getEmployees() {
        return db.getEmployees();
    }
}
