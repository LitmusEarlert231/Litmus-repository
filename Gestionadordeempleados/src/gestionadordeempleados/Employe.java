
package gestionadordeempleados;

import java.util.ArrayList;

public class Employe {
    private String Nombre;
    private String Apellidopaterno;
    private String Apellidomaterno;
    private Integer Edad;
    private ArrayList<String> actividad;
    private Integer Codigo;
    
    Employe(String nombre, String Apepater, String Apemater, Integer edad, ArrayList<String> activ, Integer code){
        this.Nombre=nombre;
        this.Apellidopaterno=Apepater;
        this.Apellidomaterno=Apemater;
        this.Edad=edad;
        this.actividad=activ;
        this.Codigo=code;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApePater() {
        return this.Apellidopaterno;
    }

    public void setApePater(String apellido) {
        this.Apellidopaterno = apellido;
    }

    public String getApeMater() {
        return this.Apellidomaterno;
    }

    public void setApellidomaterno(String apellido) {
        this.Apellidomaterno = apellido;
    }

    public Integer getEdad() {
        return this.Edad;
    }

    public void setEdad(Integer edad) {
        this.Edad = edad;
    }

    public ArrayList<String> getActs() {
        return this.actividad;
    }

    public void addAct(String acti) {
        this.actividad.add(acti);
    }

    public Integer getCodigo() {
        return this.Codigo;
    }

    public void setCodigo(Integer c) {
        this.Codigo = c;
    }
}