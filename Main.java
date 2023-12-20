package Main;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Cat.java
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat quarrels.");
    }
}
// Main.java
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();        
        animal.makeSound();
        cat.makeSound();
    }
}