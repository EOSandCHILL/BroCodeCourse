package brocodeinheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();

        Bicycle bike = new Bicycle();
        bike.stop();

        System.out.println("The bike has " + bike.pedals + " pedals and " + bike.wheels + " wheels");
    }
}
