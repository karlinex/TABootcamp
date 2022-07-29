package com.bootcampexcersise.module10;

import java.util.List;

public class Employee extends Person{

    private String jobTitle;
    private String company;
    private double salary;

    public Employee() {
    }

    public Employee(String jobTitle, double salary) {
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(String name, String jobTitle, String company, double salary) {
        setName(name);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String title) {
        jobTitle = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String c) {
        company = c;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int s) {
        salary = s;
    }

    public static String getHighestPaidEmp(List<Employee> list) {
        Employee tempEmployee = list.get(0);
        for (Employee emp : list) {
            if (emp.getSalary() > tempEmployee.getSalary()) {
                tempEmployee = emp;
            }
        }
        return tempEmployee.getName();
    }

    public void introduce() {
        System.out.println("My name is " + getName() + "and I am " + getAge() + " years old");
        System.out.println("I am working as " + jobTitle + " in " + company + "and my salary is " + salary);
    }

}
