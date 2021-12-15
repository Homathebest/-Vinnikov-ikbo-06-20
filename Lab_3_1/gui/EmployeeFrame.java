package Lab_3_1.gui;

import Lab_3_1.controller.Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeFrame extends JFrame {

    private Controller controller;
    private JButton addButton;
    public EmployeeFrame() {
        super("Staff Manager");
        controller = new Controller();
        setLayout(new BorderLayout());
        EmployeeAddForm empAddForm = new EmployeeAddForm();
        TableForm tableForm = new TableForm();
        tableForm.setData(controller.getEmployees());
        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                empAddForm.addDataToDB();
                tableForm.setData(controller.getEmployees());
                tableForm.refresh();
            }
        });
        add(empAddForm.getEmployeeAddPanel(), BorderLayout.WEST);
        add(tableForm.getTablePanel(), BorderLayout.CENTER);
        add(addButton, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
