// Abstraction: Vehicle System
// Objective: Demonstrate abstraction using abstract classes.

// Create an abstract class Vehicle with:
// Abstract methods start(), stop().
// A non-abstract method display() that shows a general message.
// Implement subclasses:
// Car: Implements methods with car-specific logic.
// Bike: Implements methods with bike-specific logic.
// Write a main() method to create and manipulate objects of Car and Bike.



import java.io.*;
abstract class Vehicle
{
    Vehicle()
    {
        System.out.println("Constructor of Vehicle Class called");
    }
    abstract void Start();
    abstract void Stop();
    public void display()
    {
        System.out.println("Hi...amra ekhon Vehicle er display te");
    }
}
class Car extends Vehicle
{
    Car()
    {
        System.out.println("Constructor of Car Class called");
    }
    void Start()
    {
        System.out.println("The Cra is started");
    }
    void Stop()
    {
        System.out.println("The Cra is stopped");
    }
}
class Bike extends Vehicle
{
    Bike()
    {
        System.out.println("Constructor of Bike Class called");
    }
    void Start()
    {
        System.out.println("The Bike is started");
    }
    void Stop()
    {
        System.out.println("The Bike is stopped");
    }
}
class Main {
    public static void main(String[] args)throws IOException
    {
        BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
        Vehicle car= new Car();
        Vehicle bike = new Bike();
        car.Start();
        bike.Stop();
    }
}
