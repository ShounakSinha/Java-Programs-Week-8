// Abstraction: Vehicle System
// Objective: Demonstrate abstraction using abstract classes.

// Create an abstract class Vehicle with:
// Abstract methods start(), stop().
// A non-abstract method display() that shows a general message.
// Implement subclasses:
// Car: Implements methods with car-specific logic.
// Bike: Implements methods with bike-specific logic.
// Write a main() method to create and manipulate objects of Car and Bike.


abstract class Vehicle
{
    Vehicle()
    {
        System.out.println("Constructor of Vehicle Class called");
    }
}
class Car extends Vehicle
{
    Car()
    {
        System.out.println("Constructor of Car Class called");
    }
}
class Bike extends Vehicle
{
    Bike()
    {
        System.out.println("Constructor of Bike Class called");
    }
}
class Main {
    public static void main(String[] args)throws IOException
    {
        
    }
}
