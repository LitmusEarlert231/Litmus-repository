package tiposcomputadora;

public class Computadora {
    private String marca;
    private String noSerie;
    private int RAM;
    private static int contador = 0;

    public Computadora (String marca, String noSerie, int RAM){
    this.marca = marca;
    this.noSerie = noSerie;
    this.RAM = RAM;
    contador++;
    } 
    
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("No. de serie: " + noSerie);
        System.out.println("RAM: " + RAM);
    }
    
    public static int getContador(){
        return contador;
    }
}
