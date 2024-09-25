package Employee;

import java.time.LocalDate;

public class MainClass {
    public static void main(String[] args) {

        //Create two employee object with name , salary and hire date of them
        Employee employee1 = new Employee("Ariful Islam",28640, LocalDate.parse("2017-08-01"));
        Employee employee2 = new Employee("Moin Uddin",16500,LocalDate.parse("2020-06-01"));

        //Call printEmployeeDetails method to print the employee1 details
        employee1.printEmployeeDetails();
        //Call years of service method to get years of experience of employee1 and print in this line
        System.out.println("Years Of Service : "+employee1.yearsOfService()+"\n");

        //Method to raise salary of employee1 to 10% percent
        employee1.raiseSalary(10);
        //Change the hire date of employee1 with "2019-08-01"
        employee1.setHireDate(LocalDate.parse("2019-08-01"));
        //Call printEmployeeDetails method to print the employee1 details
        employee1.printEmployeeDetails();
        //Call years of service method to get years of experience of employee1 and print in this line
        System.out.println("Years Of Service : "+employee1.yearsOfService()+"\n");


        //Call printEmployeeDetails method to print the employee2 details
        employee2.printEmployeeDetails();
        //Call years of service method to get years of experience of employee2 and print in this line
        System.out.println("Years Of Service : "+employee2.yearsOfService()+"\n");

        //Change the hire date of employee2 with "2021-08-01"
        employee2.setHireDate(LocalDate.parse("2021-08-01"));
        //Call printEmployeeDetails method to print the employee2 details
        employee2.printEmployeeDetails();
        //Call years of service method to get years of experience of employee2 and print in this line
        System.out.println("Years Of Service : "+employee2.yearsOfService()+"\n");

    }
}
