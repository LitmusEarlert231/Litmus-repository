package tiposcomputadora;

public class CompuEscritorio extends Computadora {
    private String procesador;
    private int capacidad;

    public CompuEscritorio(String marca, String noSerie, int RAM, String procesador) {
        super(marca, noSerie, RAM);
        this.procesador = procesador;
    }
    
    public CompuEscritorio(String marca, String noSerie, int RAM, int capacidad) {
        super(marca, noSerie, RAM);
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Procesador: " + procesador);
        System.out.println("Capacidad: " + capacidad);
    }
}
