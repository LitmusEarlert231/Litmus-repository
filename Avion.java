package avion;

public class Avion {
    private String modelo;
    private int capacidadGasolina;
    private int velocidadMaxima;
    private int altitudMaxima;
    
    public Avion(String modelo, int capacidadGasolina, int velocidadMaxima, int altitudMaxima) {
        this.modelo = modelo;
        this.capacidadGasolina = capacidadGasolina;
        this.velocidadMaxima = velocidadMaxima;
        this.altitudMaxima = altitudMaxima;
    }
    
   public Avion(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidadGasolina;
    }

    public void setCapacidad(int capacidadGasolina) {
        this.capacidadGasolina = capacidadGasolina;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(int altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }
    
    public void despegar(){
        System.out.println("El avion "+this.modelo+" ha despegado");
    }
    public void aterrizar(){
        System.out.println("El avion "+this.modelo+" ha aterrizado");
    }
}