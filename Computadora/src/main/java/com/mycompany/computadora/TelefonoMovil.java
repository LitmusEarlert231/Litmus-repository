
package com.mycompany.computadora;

public class TelefonoMovil extends Computadora {
    private String sistemaOperativo;
    private int capacidadAlmacenamiento;
    private static int contador = 0;

    public TelefonoMovil(String marca, String noSerie, int RAM, String sistemaOperativo, int capacidadAlmacenamiento) {
        super(marca, noSerie, RAM);
        this.sistemaOperativo = sistemaOperativo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        contador++;
    }

    public void leerInformacion() {
        super.leerInformacion();
        System.out.println("Sistema operativo: " + sistemaOperativo);
        System.out.println("Capacidad de almacenamiento: " + capacidadAlmacenamiento + "GB");
    }

    public static void main(String[] args) {
        TelefonoMovil telefono1 = new TelefonoMovil("Apple", "11111", 4, "iOS", 128);
        telefono1.leerInformacion();

        TelefonoMovil telefono2 = new TelefonoMovil("Samsung", "22222", 6, "Android", 64);
        telefono2.leerInformacion();

        System.out.println("Número de objetos creados: " + contador);
    }
}

