package com.stackroute.solidprinciple2;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String designation;
    private int age;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int employeeId, String employeeName, String designation, int age) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        this.age = age;
    }
    public Employee(){}
}
