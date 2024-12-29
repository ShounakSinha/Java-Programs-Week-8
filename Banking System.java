// Dynamic Polymorphism: Banking System
// Objective: Show runtime polymorphism through method overriding.

// Create a base class Bank with a method getRateOfInterest().
// Create derived classes:
// SBI, HDFC, ICICI: Override getRateOfInterest() with specific rates.
// In the main() method:
// Create an array of Bank objects.
// Assign objects of SBI, HDFC, and ICICI to it.
// Use a loop to call getRateOfInterest() on each object and display the bank name and interest rate.


import java.io.*;

class Bank
{
    Bank()
    {
        System.out.println("Banks constructor called");
    }
    public int getRateOfInterest()
    {
        
    }
}
class SBI extends Bank
{
    SBI()
    {
        System.out.println("SBI's constructor called");
    }
    public int getRateOfInterest()
    {
        
    }
}
class HDFC extends Bank
{
    HDFC()
    {
        System.out.println("HDFC Bank's constructor called");
    }
    public int getRateOfInterest()
    {
        
    }
}
class ICICI extends Bank
{
    ICICI()
    {
        System.out.println("ICICI Bank's constructor called");
    }
    public int getRateOfInterest()
    {
        
    }
}

class Main {
    public static void main(String[] args)htrows IOException
    {
        
    }
}
