package chapter03.applying_switch_statements.expression;

public class ApplyingACaseBlock2 {

    private static void yieldRequired() {

        int fish = 5;
        int length = 12;
        var name = switch (fish) {
            case 1 -> "Goldfish";
            // case 2 -> {} // DOES NOT COMPILE
            // Switch expression rule should produce result in all execution paths
            // case 3 -> {  // DOES NOT COMPILE
            //    if (length > 10) yield "Blobfish";
            // }
            default -> "Swordfish";
        };

        System.out.println(name);

    }
}
