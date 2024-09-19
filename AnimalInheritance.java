// Base class
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class Dog
class Dog extends Animal {
    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof!");
    }
}

// Derived class Cat
class Cat extends Animal {
    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow!");
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call their respective makeSound methods
        System.out.println("Dog sound:");
        myDog.makeSound();  // Outputs: Dog barks: Woof!

        System.out.println("Cat sound:");
        myCat.makeSound();  // Outputs: Cat meows: Meow!
    }
}