package com.bootcampexcersise.module10;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    public static void main(String[] args) {
        Employee e1 = new Employee("Name1","Title1", "company1", 10000);
        Employee e2 = new Employee("Name2","Title2", "company2", 20000);
        Employee e3 = new Employee("Name3","Title3", "company3", 30000);
        Employee e4 = new Employee("Name4","Title4", "company4", 40000);
        Employee e5 = new Employee("Name5","Title5", "company5", 50000);

        List<Employee> empList = new ArrayList<>();

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        System.out.println("The Employee whose salary is the highest is : " + Employee.getHighestPaidEmp(empList));

    }

}
