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

class Tiger implements Animal, Status {
    private boolean hasEaten;
    private boolean hasSlept;

    @Override
    public void eat() {
        System.out.println("Tiger is eating meat.");
        hasEaten = true;
    }

    @Override
    public void sleep() {
        System.out.println("Tiger is sleeping.");
        hasSlept = true;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    @Override
    public boolean hasEaten() {
        return hasEaten;
    }

    @Override
    public boolean hasSlept() {
        return hasSlept;
    }
}

class Buffalo implements Animal, Status {
    private boolean hasEaten;
    private boolean hasSlept;

    @Override
    public void eat() {
        System.out.println("Buffalo is eating grass.");
        hasEaten = true;
    }

    @Override
    public void sleep() {
        System.out.println("Buffalo is sleeping.");
        hasSlept = true;
    }

    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }

    @Override
    public boolean hasEaten() {
        return hasEaten;
    }

    @Override
    public boolean hasSlept() {
        return hasSlept;
    }
}

class Human implements Animal, Status {
    private boolean hasEaten;
    private boolean hasSlept;

    @Override
    public void eat() {
        System.out.println("Human is eating food.");
        hasEaten = true;
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping.");
        hasSlept = true;
    }

    @Override
    public void makeSound() {
        System.out.println("Hello!");
    }

    @Override
    public boolean hasEaten() {
        return hasEaten;
    }

    @Override
    public boolean hasSlept() {
        return hasSlept;
    }
}

class Dog implements Animal, Status {
    private boolean hasEaten;
    private boolean hasSlept;

    @Override
    public void eat() {
        System.out.println("Dog is eating dog food.");
        hasEaten = true;
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
        hasSlept = true;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public boolean hasEaten() {
        return hasEaten;
    }

    @Override
    public boolean hasSlept() {
        return hasSlept;
    }
}

class Cat implements Animal, Status {
    private boolean hasEaten;
    private boolean hasSlept;

    @Override
    public void eat() {
        System.out.println("Cat is eating fish.");
        hasEaten = true;
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping.");
        hasSlept = true;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public boolean hasEaten() {
        return hasEaten;
    }

    @Override
    public boolean hasSlept() {
        return hasSlept;
    }
}

class Bird implements Animal, Status {
    private boolean hasEaten;
    private boolean hasSlept;

    @Override
    public void eat() {
        System.out.println("Bird is eating worms.");
        hasEaten = true;
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping.");
        hasSlept = true;
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet!");
    }

    @Override
    public boolean hasEaten() {
        return hasEaten;
    }

    @Override
    public boolean hasSlept() {
        return hasSlept;
    }
}

public class AnimalBehavior {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Buffalo buffalo = new Buffalo();
        Human human = new Human();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        tiger.eat();
        tiger.sleep();
        tiger.makeSound();
        System.out.println("Tiger has eaten: " + tiger.hasEaten());
        System.out.println("Tiger has slept: " + tiger.hasSlept());

        buffalo.eat();
        buffalo.sleep();
        buffalo.makeSound();
        System.out.println("Buffalo has eaten: " + buffalo.hasEaten());
        System.out.println("Buffalo has slept: " + buffalo.hasSlept());

        human.eat();
        human.sleep();
        human.makeSound();
        System.out.println("Human has eaten: " + human.hasEaten());
        System.out.println("Human has slept: " + human.hasSlept());

        dog.eat();
        dog.sleep();
        dog.makeSound();
        System.out.println("Dog has eaten: " + dog.hasEaten());
        System.out.println("Dog has slept: " + dog.hasSlept());

        cat.eat();
        cat.sleep();
        cat.makeSound();
        System.out.println("Cat has eaten: " + cat.hasEaten());
        System.out.println("Cat has slept: " + cat.hasSlept());

        bird.eat();
        bird.sleep();
        bird.makeSound();
        System.out.println("Bird has eaten: " + bird.hasEaten());
        System.out.println("Bird has slept: " + bird.hasSlept());
    }
}   
