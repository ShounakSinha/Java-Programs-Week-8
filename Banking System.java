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
        return 0;
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
        return 5;
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
        return 6;
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
        return 7;
    }
}

public class Main {
    public static void main(String args[]) {
        Bank b[] = new Bank[3]; 
        b[0] = new SBI();
        b[1] = new HDFC();
        b[2] = new ICICI();

        for (int i = 0; i < b.length; i++) {
            System.out.println("Interest Rate of " + b[i].getClass().getSimpleName() + " is: " + b[i].getRateOfInterest() + "%");
        }
    }
}
