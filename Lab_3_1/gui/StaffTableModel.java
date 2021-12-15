package Lab_3_1.gui;

import Lab_3_1.model.Employee;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class StaffTableModel extends AbstractTableModel {
    private List<Employee> db;
    private String[] colNames = {"Name", "Department", "Age", "Phone", "Position", "Gender"};
    public void setData(List<Employee> db) {
        this.db = db;
    }
    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
    @Override
    public int getRowCount() {
        return db.size();
    }
    @Override
    public int getColumnCount() {
        return 6;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee employee = db.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return employee.getName();
            case 1:
                return employee.getDepartment();
            case 2:
                return employee.getAge();
            case 3:
                return employee.getPhone();
            case 4:
                return employee.getPosition();
            case 5:
                return employee.getGender();
        }
        return null;
    }
}
