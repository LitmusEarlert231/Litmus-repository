package com.mycompany.computadora;

public class Computadora {
    private String marca;
    private String noSerie;
    private int RAM;

    public Computadora(String marca, String noSerie, int RAM) {
        this.marca = marca;
        this.noSerie = noSerie;
        this.RAM = RAM;
    }

    public void leerInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("No. de serie: " + noSerie);
        System.out.println("RAM: " + RAM + "GB");
    }

    public static void main(String[] args) {
        Computadora computadora1 = new Computadora("Dell", "12345", 8);
        computadora1.leerInformacion();

        Computadora computadora2 = new Computadora("HP", "67890", 16);
        computadora2.leerInformacion();
    }
}

