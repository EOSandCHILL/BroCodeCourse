package brocodeconstructors;

public class Main {
    public static void main(String[] args) {

        Human father = new Human("Jerry", 30, 210.55);
        Human mother = new Human("Marissa", 28, 220.20);

        father.eat();
        father.birthday();
        father.workout();

    }
}
