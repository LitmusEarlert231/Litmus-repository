public class Main {
    public static void main(String[] args) {
        System.out.println("Estructura de control For:");
        ImprimirnumerosFor();
        System.out.println("\nEstructura de control While:");
        ImprimirnumerosWhile();
        System.out.println("\nEstructura de control Do While:");
        ImprimirnumerosdoWhile();
    }

    public static void ImprimirnumerosFor() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + "-");
        }
    }

    public static void ImprimirnumerosWhile() {
        int i = 2;
        while (i <= 100) {
            System.out.print(i + "-");
            i += 2;
        }
    }

    public static void ImprimirnumerosdoWhile() {
        int i = 2;
        do {
            System.out.print(i + "-");
            i += 2;
        } while (i <= 100);
    }
}
