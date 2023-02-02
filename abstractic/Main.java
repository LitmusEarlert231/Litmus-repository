package abstractic;

public class Main {
  public static void main(String[] args) {
    Perro perro = new Perro("Tobi");
    perro.getSonido();
    perro.movimiento();

    Gato gato = new Gato("Rubik");
    gato.getSonido();
    gato.movimiento();
  }
}
