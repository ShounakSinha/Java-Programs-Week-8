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
class Manager extends Employee
{
    private String dept;
    Manager()
    {
        System.out.println(Constructor of Manager is called");
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
        System.ut.println("After overriding");
        System.out.println("The Employee Name is : "+name);
        System.out.println("The Employee ID is : "+id);
        System.out.println("The Employee salary is : "+salary);
        System.out,println("The Manager's department is : "+dept)
    }
}
class Developer extends Employee
{
    private String programmingLanguage;
    Developer()
    {
        System.out.println(Constructor of Developer is called");
    }
    public void setProgrammingLanguage(String dept)
    {
        programmingLanguage=lang;
    }
    public String getProgrammingLanguage()
    {
        return programmingLanguage;
    }
    void displayDetails()
    {
        System.ut.println("After overriding");
        System.out.println("The Employee Name is : "+name);
        System.out.println("The Employee ID is : "+id);
        System.out.println("The Employee salary is : "+salary);
        System.out,println("The Developer's language is : "+dept)
    }
}
class Main {
    public static void main(String[] args)throws IOException {
        System.out.println("Try programiz.pro");
    }
}
