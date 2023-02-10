package Trabajos10Feb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        e1();
        e2();
        e3();
        e4();
    }

    static void e1() {
        // Ejercicio 1
        double ventaDiaria = 1000.0;
        double porcentajeGanancia = 20.0;
        double gananciaDiaria = Metodos.calcularGananciaDiaria(ventaDiaria, porcentajeGanancia);
        System.out.println("Ejercicio 1");
        System.out.println("Ganancia diaria: $" + gananciaDiaria);
    }

    static void e2() {
        // Ejercicio 2
        int numeroProductos = 15;
        double descuento = Metodos.calcularDescuento(numeroProductos);
        System.out.println("Ejercicio 2");
        System.out.println("Porcentaje de descuento: " + descuento + "%");
    }

    static void e3() {
        // Ejercicio 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 3");
        int menor = Metodos.obtenerMenor(sc);
        System.out.println("El menor de los números introducidos es: " + menor);
        sc.close();
    }

    static void e4() {
        // Ejercicio 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 4");
        double harina = Metodos.calcularHarina(sc);
        System.out.println("La cantidad de harina a utilizar es: " + harina + " kg");
        sc.close();
    }
}