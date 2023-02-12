package brocodemethodoverriding;

public class Main {
    public static void main(String[] args) {
        //  method overriding - Declaring a method in subclass,
        //  which is already in parent class
        //  done so that a child class can give its own implementation
        Animal animal = new Animal();
        animal.speak();
        Dog dog = new Dog();
        dog.speak();
    }
}
