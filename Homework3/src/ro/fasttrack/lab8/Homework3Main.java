package ro.fasttrack.lab8;

public class Homework3Main {
    public static void main(String[] args) {
        Homework3 cat1 = new Cat("Milly");
        Cat cat2 = new Cat("Tom");
        Dog dog1 = new Dog("Rex");
        Homework3 mouse1 = new Mouse("Sisi");
        Homework3 chicken1 = new Chicken("Codruta");
        Duck duck1 = new Duck("Ducky");

        System.out.println(cat1.eat());
        System.out.println(cat2.walk());
        System.out.println(cat1.talk());
        System.out.println(dog1.talk());
        System.out.println(dog1.eat());
        System.out.println(mouse1.talk());
        System.out.println(chicken1.eat());
        System.out.println(chicken1.talk());
        System.out.println(duck1.talk());
    }
}
