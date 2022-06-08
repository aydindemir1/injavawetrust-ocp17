package chapter04;

public class StringBuilderConstructors {

    public static void main(String[] args) {

        // There are three ways to construct a StringBuilder:
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
    }
}
