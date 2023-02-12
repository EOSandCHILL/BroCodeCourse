package brocodeoop;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car herCar = new Car();

        System.out.println(myCar.model);
        System.out.println(myCar.model);

        System.out.println(herCar.model);
        System.out.println(herCar.model);

        myCar.drive();
        myCar.brake();

        herCar.drive();
        herCar.brake();

        }
    }