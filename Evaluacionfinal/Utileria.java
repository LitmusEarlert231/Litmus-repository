package Evaluacionfinal;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.List;

class Utileria {
    private static int contador = 0;

    public static int getContador() {
        return contador;
    }

    public static Producto obtenerProductoMayorPrecio(List<Producto> productos) {
        return productos.stream().max(Comparator.comparing(Producto::getPrecio)).get();
    }

    public static Producto obtenerProductoMayorCantidad(List<Producto> productos) {
        return productos.stream().max(Comparator.comparing(Producto::getCantidad)).get();
    }

    public static int obtenerCostoTotal(List<Producto> productos) {
        return productos.stream().mapToInt(p -> p.getPrecio() * p.getCantidad()).sum();
    }

    public static void imprimirProductos(List<Producto> productos) {
        Producto mayorPrecio = obtenerProductoMayorPrecio(productos);
        Producto mayorCantidad = obtenerProductoMayorCantidad(productos);
        int costoTotal = obtenerCostoTotal(productos);
        System.out.println("Producto con mayor precio: " + mayorPrecio.getNombre() + " con un precio de " + mayorPrecio.getPrecio());
        System.out.println("Producto con mayor cantidad: " + mayorCantidad.getNombre() + " con una cantidad de " + mayorCantidad.getCantidad());
        System.out.println("Productos sin disponibilidad: ");
        productos.stream().filter(p -> p.getCantidad() == 0).forEach(p -> System.out.println("- " + p.getNombre()));
        System.out.println("Costo total de los productos: " + costoTotal);
    }

    public static void eliminarEmpleadosTipo3(List<Empleado> empleados, String nombreEmpleado) {
        empleados.removeIf(e -> e.getTipo() == 3);
        System.out.println("El empleado " + nombreEmpleado + " ha eliminado a los empleados de tipo 3.");
    }

    public static String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    public static String convertirAMinusculasInverso(String cadena) {
        return new StringBuilder(cadena.toLowerCase()).reverse().toString();
    }

    public static void imprimirHoraActual() {
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual.toString());
        contador++;
    }
}