package brocodeconstructors;

public class Human {
    String name;
    int age;
    double weight;
    Human(String name, int age, double weight) {

        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    void eat() {
        System.out.println(this.name + " is eating");
    }
    void birthday() {
        System.out.println(this.name + " is " + this.age + " today so they get a free cake");
    }
    void workout() {
        System.out.println(this.name + " turned " + this.age + " years old and the free cake made " + this.name +
                " feel like they weigh more than " + this.weight);
    }
}
