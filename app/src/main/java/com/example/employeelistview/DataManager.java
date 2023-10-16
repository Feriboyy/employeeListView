package com.example.employeelistview;

import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Employee> employees = new ArrayList<>();

    public Employee createEmployee(String firstName, String lastName, String birthDay, String maritalStatus, String address, String mobileNumber) {
        Employee employee = new Employee(firstName, lastName, birthDay, maritalStatus, address, mobileNumber);
        employees.add(employee);
        return employee;

    }

    public boolean validateEmployee(String firstName, String lastName) {
        for (Employee E : employees) {
            if (E.getFirstName().equals(firstName) && E.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

}
