package tiposcomputadora;

public class Portatil extends Computadora {
    private double peso;
    private int bateria;

    public Portatil(String marca, int RAM, double peso) {
        super(marca, "noSerie", RAM);
        this.peso = peso;
    }
    
    public Portatil(String marca, String noSerie, int RAM, double peso) {
        super(marca, noSerie, RAM);
        this.peso = peso;
    }
    
    public Portatil(String marca, String noSerie, int RAM, double peso, int bateria) {
        super(marca, noSerie, RAM);
        this.peso = peso;
        this.bateria = bateria;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Peso: " + peso + " lbs");
        System.out.println("Duración de la batería: " + bateria + " horas");
    }
}
