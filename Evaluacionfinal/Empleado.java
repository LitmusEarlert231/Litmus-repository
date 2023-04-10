package Evaluacionfinal;

public class Empleado {
    private String nombreCompleto;
    private int edad;
    private int antiguedad;
    private TipoEmpleado tipo;

    public Empleado(String nombreCompleto, int edad, int antiguedad, TipoEmpleado tipo) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.tipo = tipo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void recibirPago(double monto) {
        System.out.println(nombreCompleto + " recibió un pago de " + monto + ".");
    }

    public void realizarActividad(Actividad actividad) {
        switch (tipo) {
            case TIPO1:
                switch (actividad) {
                    case VENDER_PRODUCTOS:
                    case ACOMODAR_PRODUCTOS:
                    case DESCANSAR:
                    case SENTARSE:
                        System.out.println(nombreCompleto + " está realizando la actividad " + actividad + ".");
                        break;
                    default:
                        System.out.println(nombreCompleto + " no puede realizar la actividad " + actividad + ".");
                        break;
                }
                break;
            case TIPO2:
                switch (actividad) {
                    case VENDER_PRODUCTOS:
                    case DESCANSAR:
                    case CORRER:
                        System.out.println(nombreCompleto + " está realizando la actividad " + actividad + ".");
                        break;
                    default:
                        System.out.println(nombreCompleto + " no puede realizar la actividad " + actividad + ".");
                        break;
                }
                break;
            case TIPO3:
                System.out.println(nombreCompleto + " no puede realizar actividades.");
                break;
        }
    }

    public enum TipoEmpleado {
        TIPO1,
        TIPO2,
        TIPO3
    }

    public enum Actividad {
        VENDER_PRODUCTOS,
        ACOMODAR_PRODUCTOS,
        DESCANSAR,
        SENTARSE,
        CORRER
    }
}

