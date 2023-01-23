package Ejerjava;

import java.util.ArrayList;
import java.util.Scanner;

class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double estatura;

    public Persona(String nombre, String apellido, int edad, double estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + " metros");
    }

    public class RegistroPersonas {
        public static void main(String[] args) {
            ArrayList<Persona> personas = new ArrayList<Persona>();
            Scanner scanner = new Scanner(System.in);
            String nombre, apellido;
            int edad;
            double estatura;
            int numPersonas;

            System.out.println("¿Cuantas personas quiere registrar? ");
            numPersonas = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numPersonas; i++) {
                System.out.println("Ingresa el nombre de la persona " + (i + 1) + ": ");
                nombre = scanner.nextLine();
                System.out.println("Ingresa el apellido de la persona " + (i + 1) + ": ");
                apellido = scanner.nextLine();
                System.out.println("Ingresa la edad de la persona " + (i + 1) + ": ");
                edad = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingresa la estatura de la persona " + (i + 1) + ": ");
                estatura = scanner.nextDouble();
                scanner.nextLine();

                Persona persona = new Persona(nombre, apellido, edad, estatura);
                personas.add(persona);
                System.out.println("Persona registrada con éxito.\n");
            }

            System.out.println("Registro de personas: ");
            for (Persona persona : personas) {
                persona.imprimirInfo();
                System.out.println();
            }
        }
    }

}
