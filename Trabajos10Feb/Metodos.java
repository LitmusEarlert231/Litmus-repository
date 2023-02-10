package Trabajos10Feb;

import java.util.Scanner;

class Metodos {
    public static double calcularGananciaDiaria(double ventaDiaria, double porcentajeGanancia) {
        return ventaDiaria * (porcentajeGanancia / 100);
    }

    public static double calcularDescuento(int numeroProductos) {
        double descuento = 0.0;
        if (numeroProductos > 10) {
            descuento = 10.0;
        }
        if (numeroProductos > 20) {
            descuento = 20.0;
        }
        if (numeroProductos > 30) {
            descuento = 30.0;
        }
        return descuento;
    }

    public static int obtenerMenor(Scanner sc) {
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número: ");
            int num = sc.nextInt();
            sc.nextLine();
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public static double calcularHarina(Scanner sc) {
        System.out.print("Introduce el número de pedidos: ");
        double numPedidos = sc.nextDouble();
        sc.nextLine();
        System.out.print("Introduce la cantidad de harina por pedido (en kg): ");
        double harinaPorPedido = sc.nextDouble();
        sc.nextLine();
        return numPedidos * harinaPorPedido;
    }
}
