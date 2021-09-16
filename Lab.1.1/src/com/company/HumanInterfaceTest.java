package com.company;

public class HumanInterfaceTest {

    public void test()
    {
        Employee employee = new Employee("Employee");
        Client client = new Client("Client");
        System.out.println(employee.getName());
        System.out.println(employee.think());
        System.out.println(client.getName());
        System.out.println(client.think());
    }
}