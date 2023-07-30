package chapter07.working_with_enums;

public enum CoffeeSize {
    SHORT, TALL, GRANDE;

    private CoffeeSize() {
        System.out.println("constructor-invoked");
    }
    // All enum constructors are implicitly private, with the modifier being optional.
    // public CoffeeSize() {} // Modifier 'public' not allowed here
}
