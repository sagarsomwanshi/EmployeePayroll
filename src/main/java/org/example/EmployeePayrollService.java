package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {
    ArrayList<EmployeePayrollData> EmployeePayrollList = new ArrayList<>();

    public void inputEmployeePayrollData(){
        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int ID = sc.nextInt();
        System.out.println("Enter Name of Employee");
        String Name = scn.nextLine();
        System.out.println("Enter Salary of Employee");
        double Salary = sc.nextDouble();
        EmployeePayrollData emp = new EmployeePayrollData(ID,Name,Salary);
        EmployeePayrollList.add(emp);

        System.out.println("Employee details : "+EmployeePayrollList);

    }
}
