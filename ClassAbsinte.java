interface Vehiculo {
    void encender();
}

abstract class Automovil implements Vehiculo {
    protected String marca;
    protected int año;

    public Automovil(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void encender() {
        System.out.println("El automóvil ha sido encendido");
    }
}

class Sedan extends Automovil {
    protected int puertas;

    public Sedan(String marca, int año, int puertas) {
        super(marca, año);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "marca='" + marca + '\'' +
                ", año=" + año +
                ", puertas=" + puertas +
                '}';
    }
}

class Prueba {
    public static void main(String[] args) {
        Sedan s = new Sedan("Toyota", 2020, 4);
        s.encender();
        System.out.println(s.toString());
    }
}
