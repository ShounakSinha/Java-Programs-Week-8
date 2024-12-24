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

class Employee
{
    private String name, id;
    private int salary=0;
    Employee()
    {
        System.out.println("An object of Emloyee Class created");
    }
    void displayDetails()
    {
        System.out.println("The Employee Name is : "+name);
        System.out.println("The Employee ID is : "+id);
        System.out.println("The Employee salary is : "+salary);
    }
}
class Main {
    public static void main(String[] args)throws IOException {
        System.out.println("Try programiz.pro");
    }
}
