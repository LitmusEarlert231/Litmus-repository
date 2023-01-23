package EjerciciosCris;

import java.util.ArrayList;
import java.util.Scanner;

class Alumno {
    private String nombre;
    private String apellido;
    private String matricula;
    private String carrera;

    public Alumno(String nombre, String apellido, String matricula, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }
}

public class RegistroAlumnos {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        Scanner scanner = new Scanner(System.in);
        String nombre, apellido, matricula, carrera;

        while (true) {
            System.out.println("Ingresa el nombre del alumno (o escribe 'salir' para terminar el registro): ");
            nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("Ingresa el apellido del alumno: ");
            apellido = scanner.nextLine();

            System.out.println("Ingresa la matrícula del alumno: ");
            matricula = scanner.nextLine();

            System.out.println("Ingresa la carrera del alumno: ");
            carrera = scanner.nextLine();

            Alumno alumno = new Alumno(nombre, apellido, matricula, carrera);
            alumnos.add(alumno);
            System.out.println("Alumno registrado con éxito.\n");
        }

        System.out.println("Registro de alumnos: ");
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getApellido());
            System.out.println("Matrícula: " + alumno.getMatricula());
            System.out.println("Carrera: " + alumno.getCarrera() + "\n");
        }
    }
}