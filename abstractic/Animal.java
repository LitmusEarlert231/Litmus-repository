package abstractic;

interface Animal {
  public void getSonido();
}

abstract class Mamifero implements Animal {
  protected String nombre;

  public Mamifero(String nombre) {
    this.nombre = nombre;
  }

  public abstract void movimiento();
}

class Perro extends Mamifero {
  public Perro(String nombre) {
    super(nombre);
  }

  @Override
  public void getSonido() {
    System.out.println(nombre + " ladrar");
  }

  @Override
  public void movimiento() {
    System.out.println(nombre + " correr");
  }
}

class Gato extends Mamifero {
  public Gato(String nombre) {
    super(nombre);
  }

  @Override
  public void getSonido() {
    System.out.println(nombre + " maullido");
  }

  @Override
  public void movimiento() {
    System.out.println(nombre + " caminar");
  }
}
