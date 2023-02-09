package com.mycompany.computadora;

public class Escritorio extends Computadora {
    private int tamaño;

    public Escritorio(String marca, String noSerie, int RAM) {
        super(marca, noSerie, RAM);
    }

    public Escritorio(String marca, String noSerie, int RAM, int tamaño) {
        super(marca, noSerie, RAM);
        this.tamaño = tamaño;
    }

    public static void main(String[] args) {
        Escritorio escritorio1 = new Escritorio("Dell", "23456", 8);
        escritorio1.leerInformacion();

        Escritorio escritorio2 = new Escritorio("HP", "34567", 16, 24);
        escritorio2.leerInformacion();
        System.out.println("Tamaño: " + escritorio2.tamaño + " pulgadas");
    }
}
