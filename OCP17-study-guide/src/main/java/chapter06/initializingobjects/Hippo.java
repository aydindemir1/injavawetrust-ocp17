package chapter06.initializingobjects;

public class Hippo extends Animal {
    public static void main(String[] grass) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }

    static {
        System.out.print("B");
    }
}