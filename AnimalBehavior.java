// Interface Implementation: Animal Behavior
// Objective: Use interfaces to demonstrate abstraction.

// Create an interface Animal with methods eat(), sleep(), and makeSound().
// Implement the interface in classes:
// Dog, Cat, and Bird.
// In the main() method:
// Create objects of each class and call all methods.

interface Animal {
    void eat();
    void sleep();
    void makeSound();
}

interface Status {
    boolean hasEaten();
    boolean hasSlept();
}
