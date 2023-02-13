package ejerciciotaller;

import java.util.Scanner;

public class GestionTaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = null;
        Auto auto = null;

    while (true) {
        System.out.println("1. Crear cliente");
        System.out.println("2. Asignar auto a cliente");
        System.out.println("3. Mostrar información de cliente");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");

    int opcion = sc.nextInt();
        sc.nextLine();

    switch (opcion) {
        case 1:
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el apellido del cliente: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese el domicilio del cliente: ");
        String domicilio = sc.nextLine();

    cliente = new Cliente(nombre, apellido, domicilio, auto);
        break;
        case 2:
        if (cliente == null) {
        System.out.println("Debe crear primero un cliente");
        break;
    }

    System.out.print("Ingrese el número de serie del auto: ");
    String numeroSerie = sc.nextLine();
    System.out.print("Ingrese el modelo del auto: ");
    String modelo = sc.nextLine();
    System.out.print("Ingrese el color del auto: ");
    String color = sc.nextLine();
    System.out.print("Ingrese las placas del auto: ");
    String placas = sc.nextLine();

    auto = new Auto(numeroSerie, modelo, color, placas);
        cliente.setAuto(auto);
        break;
    case 3:
    if (cliente == null) {
        System.out.println("Debe crear primero un cliente");
        break;
    }

    System.out.println("Nombre: " + cliente.nombre);
    System.out.println("Apellido Paterno: " + cliente.apellido);
    System.out.println("Domicilio: " + cliente.domicilio);
    System.out.println("Auto: ");
    System.out.println("\tNúmero de serie: " + cliente.getAuto().serie);
    System.out.println("\tModelo: " + cliente.getAuto().modelo);
    System.out.println("\tColor: " + cliente.getAuto().color);
    System.out.println("\tPlacas: " + cliente.getAuto().placas);
    break;
}
        }
    }
}
