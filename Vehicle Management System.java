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
    public boolean bikestart=false, carstart=false;
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
    void statusOfCar()
    {
        if(carstart==false)
        {
            System.out.println("Gaari dariye achhe");
        }
        else
        {
            System.out.println("Gaari chalu hoye gachhe");
        }
    }
    void Start()
    {
        carstart=true;
        System.out.println("The Cra is started");
    }
    void Stop()
    {
        carstart=false;
        System.out.println("The Cra is stopped");
    }
}
class Bike extends Vehicle
{
    Bike()
    {
        System.out.println("Constructor of Bike Class called");
    }
    void statusOfBike()
    {
        if(bikestart==false)
        {
            System.out.println("Bike dariye achhe");
        }
        else
        {
            System.out.println("Bike chalu hoye gachhe");
        }
    }
    void Start()
    {
        bikestart=true;
        System.out.println("The Bike is started");
    }
    void Stop()
    {
        bikestart=false;
        System.out.println("The Bike is stopped");
    }
}
class Main {
    public static void main(String[] args)throws IOException
    {
        BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
        Car car= new Car();
        Bike bike = new Bike();
        car.statusOfCar();
        bike.statusOfBike();
        car.Start();
        bike.Start();
        Car car2= new Car();
        Bike bike2 = new Bike();
        car2.statusOfCar();
        bike2.statusOfBike();
        System.out.println("Halat of Car and Bike 1 : ");
        car.statusOfCar();
        bike.statusOfBike();
        System.out.println("\n\n");
        car2.Start();
        bike2.Stop();
        car2.statusOfCar();
        bike2.statusOfBike();
        
        
    }
}
