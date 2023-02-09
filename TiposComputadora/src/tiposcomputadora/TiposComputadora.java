package tiposcomputadora;

public class TiposComputadora {

    public static void main(String[] args) {
        Portatil portatil1 = new Portatil("Samsung", 8, 5);
        portatil1.mostrarInfo();
        System.out.println("");

        Portatil portatil2 = new Portatil("Dell", "1480", 4, 3);
        portatil2.mostrarInfo();
        System.out.println("");

        Portatil portatil3 = new Portatil("Asus", "3200", 16, 4, 3000);
        portatil2.mostrarInfo();
        System.out.println("");

        CompuEscritorio escritorio1 = new CompuEscritorio("Lenovo", "4030", 16, "Intel");
        escritorio1.mostrarInfo();
        System.out.println("");

        CompuEscritorio escritorio2 = new CompuEscritorio("HP", "2030", 32, 450);
        escritorio2.mostrarInfo();
        System.out.println("");

        System.out.println("Objetos creados al momento: " + Computadora.getContador());
    }
    
}
