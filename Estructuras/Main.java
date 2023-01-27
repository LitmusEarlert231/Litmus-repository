public class Main {
    public static void main(String[] args) {
        System.out.println("Estructura de control FOR:");
        printNumbersUsingFor();
        System.out.println("\nEstructura de control WHILE:");
        printNumbersUsingWhile();
        System.out.println("\nEstructura de control DO WHILE:");
        printNumbersUsingDoWhile();
    }

    public static void printNumbersUsingFor() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + "-");
        }
    }

    public static void printNumbersUsingWhile() {
        int i = 2;
        while (i <= 100) {
            System.out.print(i + "-");
            i += 2;
        }
    }

    public static void printNumbersUsingDoWhile() {
        int i = 2;
        do {
            System.out.print(i + "-");
            i += 2;
        } while (i <= 100);
    }
}
