package Evaluacionfinal;

import java.util.Random;

public class Producto {
  private String nombre;
  private double precio;
  private int cantidad;
  private String tipo;
  
  public Producto(String nombre) {
    this.nombre = nombre;
    this.precio = Math.round((new Random().nextDouble() * 200 + 300) * 100.0) / 100.0;
    this.cantidad = new Random().nextInt(6) + 10;
    this.tipo = asignarTipo();
  }
  
  private String asignarTipo() {
  }
  
  public void venderProducto() {
    if (this.cantidad > 0) {
      this.cantidad--;
      System.out.println("Producto vendido");
    } else {
      System.out.println("No hay productos disponibles");
    }
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public double getPrecio() {
    return precio;
  }
  
  public int getCantidad() {
    return cantidad;
  }
  
  public String getTipo() {
    return tipo;
  }
}

