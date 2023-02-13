package ejerciciotaller;

public class Cliente {
    String nombre;
    String apellido;
    String domicilio;
    private Auto auto;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    public Cliente(String nombre, String apellido, String domicilio, Auto auto){
    this.nombre = nombre;
    this.apellido = apellido;
    this.domicilio = domicilio;
    this.auto = auto;
    }
   

}
