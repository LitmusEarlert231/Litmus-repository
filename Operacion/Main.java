package Operacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        Operaciones operaciones = new Operaciones();
        System.out.println("La suma es: " + operaciones.suma(num1, num2));
        System.out.println("La resta es: " + operaciones.resta(num1, num2));
        System.out.println("La multiplicación es: " + operaciones.multiplicacion(num1, num2));
    }
}
