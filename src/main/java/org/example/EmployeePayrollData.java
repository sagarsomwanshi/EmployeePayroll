package org.example;

public class EmployeePayrollData {
    int ID;
    String Name;
    double Salary;

    public EmployeePayrollData() {
    }

    public EmployeePayrollData(int ID, String name, double salary) {
        this.ID = ID;
        Name = name;
        Salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}