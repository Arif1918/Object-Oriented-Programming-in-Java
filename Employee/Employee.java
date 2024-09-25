package Employee;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name,double salary,LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    //Method for calculate years of service from hire date to current date
    public int yearsOfService() {
        return Period.between(hireDate,LocalDate.now()).getYears();
    }
    //Print Employee Details with name , salary and hire date
    public void printEmployeeDetails() {
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Hire Date: "+hireDate);
    }
}
