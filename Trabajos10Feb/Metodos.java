package Trabajos10Feb;

import java.util.Random;
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

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void imprimirResultado(Scanner sc) {
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        if (esPrimo(num)) {
            System.out.println("El número " + num + " es primo");
        } else {
            System.out.println("El número " + num + " no es primo");
        }
    }

    public static void imprimirDiploma(String universidad, String nombreAlumno, int semestre, String carrera, String mensajeEstimulo) {
        System.out.println(mensajeEstimulo);
        System.out.println(universidad + " otorga un reconocimiento al esfuerzo y dedicación al alumno \"" + nombreAlumno + "\" quien cursa el \"" + semestre + " semestre\" de la carrera \"" + carrera + "\"");
    }

    static Random random = new Random();

    public static String[] mensajes = {
        "Continúa a pesar de que todos esperen que abandones. No dejes que se oxide el hierro que hay en ti. Teresa de Calcuta",
        "El genio se hace con un 1% de talento, y un 99% de trabajo.  Albert Einstein",
        "Hay una fuerza motriz más poderosa que el vapor, la electricidad y la energía atómica: la voluntad.  Albert Einstein",
        "Confía en ti mismo sin importar lo que los demás piensen. Arnold Schwarzenegger"
    };

    public static void imprimirDiploma(String nombre, String apellido, double promedio, int semestre, String carrera) {
        int index = random.nextInt(mensajes.length);
        String mensaje = mensajes[index];
        System.out.println("La Universidad Autónoma de México otorga un reconocimiento al esfuerzo y dedicación al alumno "
                + "\"" + nombre + " " + apellido + "\" quien cursa el \"" + semestre + "to semestre\" de la carrera \"" + carrera + "\"");
        System.out.println(mensaje);
    }
}

