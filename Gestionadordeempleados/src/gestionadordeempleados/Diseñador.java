package gestionadordeempleados;

import java.util.ArrayList;
import java.util.Collections;

public class Diseñador extends Employe implements Obteneractidiary{
    private String Herramientas;
    
    public Diseñador(String nombre, String ApePater, String ApeMater, Integer edad, ArrayList<String> Activ, Integer code){
        super(nombre, ApePater, ApeMater, edad, Activ, code);
        this.setCodigo(8000);
    
        this.Herramientas="Photoshop";
        Activ.add("Reuniones de avance");
        Activ.add("Elaboracion de diseño para paginas webs");
        Activ.add("Presentacion-ajustes del diseño");
        if (edad<=25) {
            Activ.add("Revision de diseñador SR");
        }else if(edad>25){
        Activ.add("Apoyo a diseñador JR");
        }
    }
    
    public void setTool(String s){
        this.Herramientas=s;
    }
    
    public String getTool(){
        return this.Herramientas;
    }
    
    public String getData(){
        return '\n'+"Datos del empleado: "+'\n'+'\n'+
                "Area: Diseño"+'\n'+
                "Nombre: "+this.getNombre()+" "+this.getApePater()+" "+this.getApeMater()+'\n'+
                "Edad: "+this.getEdad()+'\n'+
                "Tool: "+this.getTool()+'\n'+
                "Codigo: "+this.getCodigo();
    }
    
    @Override
    public void ObtenerActividadesDiarias(){
        ArrayList<String> arr = new ArrayList<>();
        arr = this.getActs();
        Collections.sort(arr);
        
        System.out.println('\n'+"Actividades del diseñador: "+'\n');
        for(int i = 0; i < arr.size(); i++){
            System.out.println(i+1 + "- " + arr.get(i));
        }
        System.out.println('\n');
    }
   } 
