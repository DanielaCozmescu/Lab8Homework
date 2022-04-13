package ro.fasttrack.lab8;

public class Homework2Main {
    public static void main(String[] args) {
        ING client1 = new ING(21);
        Homework2 client2 = new BT(500);
        Homework2 client3 = new BRD(656);
        System.out.println(client2.deposit());
        System.out.println(client1.withdraw());
        System.out.println(client3.deposit());

    }
}
