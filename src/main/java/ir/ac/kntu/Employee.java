package ir.ac.kntu;

import java.util.Scanner;

public class Employee extends User {
    private Date doe;
    private int salary;

    public void addCustomer() {
        Customer customer = new Customer();
        customer.setName();
        customer.setPhone();
        customer.setEmail();
        customer.setUsername();
        customer.setPassword();
        customer.addToList();
    }

    public void setDoe() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year of employment:");
        int year = in.nextInt();
        System.out.println("Enter the month of employment:");
        int month = in.nextInt();
        System.out.println("Enter day of employment:");
        int day = in.nextInt();
        doe = new Date(year, month, day);
    }

    public Date getDoe() {
        return doe;
    }

    public void setSalary() {
        System.out.println("Enter this employee's salary:");
        Scanner in = new Scanner(System.in);
        salary = in.nextInt();
    }

    public int getSalary() {
        return salary;
    }
}
