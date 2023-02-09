package com.mycompany.computadora;

public class Portatil extends Computadora {
    private double peso;
    private int bateria;

    public Portatil(String marca, String noSerie, int RAM, double peso, int bateria) {
        super(marca, noSerie, RAM);
        this.peso = peso;
        this.bateria = bateria;
    }

    public void leerInformacion() {
        super.leerInformacion();
        System.out.println("Peso: " + peso + " lbs");
        System.out.println("Duración de la batería: " + bateria + " horas");
    }

    public static void main(String[] args) {
        Portatil portatil1 = new Portatil("Apple", "98765", 8, 2.5, 10);
        portatil1.leerInformacion();

        Portatil portatil2 = new Portatil("Acer", "87654", 4, 3.0, 8);
        portatil2.leerInformacion();
    }
}

