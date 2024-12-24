// This marks the question
// Basic Inheritance: Employee Management System
// Objective: Implement a class hierarchy to manage employee details.

// Create a base class Employee with attributes: name, id, salary.
// Add a method displayDetails() to show employee details.
// Create derived classes:
// Manager: Adds department.
// Developer: Adds programmingLanguage.
// Override displayDetails() in each subclass to include additional details.
// Write a main() method to demonstrate creating objects of each class and displaying their details.

import java.io.*;
class Employee
{
    private String name, id;
    private int salary=0;
    Employee()
    {
        System.out.println("An object of Emloyee Class created");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and Setter for salary
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    void displayDetails()
    {
        System.out.println("The Employee Name is : "+getName());
        System.out.println("The Employee ID is : "+getId());
        System.out.println("The Employee salary is : "+getSalary());
    }
    
}
class Manager extends Employee
{
    private String dept;
    Manager()
    {
        System.out.println("Constructor of Manager is called");
    }
    public void setDepartment(String dept)
    {
        this.dept=dept;
    }
    public String getDepartment()
    {
        return dept;
    }
    
    void displayDetails()
    {
        System.out.println("After overriding");
        System.out.println("The Employee Name is : "+getName());
        System.out.println("The Employee ID is : "+getId());
        System.out.println("The Employee salary is : "+getSalary());
        System.out.println("The Manager's department is : "+dept);
    }
}
class Developer extends Employee
{
    private String programmingLanguage;
    Developer()
    {
        System.out.println("Constructor of Developer is called");
    }
    public void setProgrammingLanguage(String lang)
    {
        programmingLanguage=lang;
    }
    public String getProgrammingLanguage()
    {
        return programmingLanguage;
    }
    void displayDetails()
    {
        System.out.println("After overriding");
        System.out.println("The Employee Name is : "+getName());
        System.out.println("The Employee ID is : "+getId());
        System.out.println("The Employee salary is : "+getSalary());
        System.out.println("The Developer's language is : "+ programmingLanguage);
    }
}
class Main {
    public static void main(String[] args)throws IOException {
        System.out.println("Try programiz.pro");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Employee em = new Employee();
        Employee em1 = new Manager();
        Manager man1= new Manager();
        System.out.println("Enter details for Manager:");
        Manager manager = new Manager();
        System.out.print("Enter Name: ");
        manager.setName(reader.readLine());
        System.out.print("Enter ID: ");
        manager.setId(reader.readLine());
        System.out.print("Enter Salary: ");
        manager.setSalary(Integer.parseInt(reader.readLine()));
        System.out.print("Enter Department: ");
        manager.setDepartment(reader.readLine());
        System.out.println("\nEnter details for Developer:");
        Developer developer = new Developer();
        System.out.print("Enter Name: ");
        developer.setName(reader.readLine());
        System.out.print("Enter ID: ");
        developer.setId(reader.readLine());
        System.out.print("Enter Salary: ");
        developer.setSalary(Integer.parseInt(reader.readLine()));
        System.out.print("Enter Programming Language: ");
        developer.setProgrammingLanguage(reader.readLine());

        System.out.println("\nManager Details:");
        manager.displayDetails();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();
    }
}
