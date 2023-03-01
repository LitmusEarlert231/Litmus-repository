package gestionadordeempleados;

import java.util.ArrayList;
import java.util.Collections;

public class Programador extends Employe implements Obteneractidiary{
    private String Herramientas;
    
    public Programador (String nombre, String ApePater, String ApeMater, Integer edad, ArrayList<String> activ, Integer code){
        super (nombre, ApePater, ApeMater, edad, activ, code);
        this.setCodigo(9000);
        
        this.Herramientas = "Eclipse";
        activ.add("Analisis de requerimientos");
        activ.add("Desarrollo de requerimientos");
        activ.add("Presentacion-pruebas unitarias");
    }
    
    public void setTool(String s){
        this.Herramientas = s;
    }
    
    public String getTool(){
        return this.Herramientas;
    }
    
    public String getData(){
        return '\n' + "Datos del empleado: " + '\n' + '\n' + 
                "Area: Desarrollo" + '\n' + 
                "Nombre: " + this.getNombre() + " " + this.getApePater() + " " + this.getApeMater() + '\n' + 
                "Edad: " + this.getEdad() + '\n' + 
                "Herramienta: " + this.getTool() + '\n' + 
                "Codigo: " + this.getCodigo();
    }
    
    @Override
    public void ObtenerActividadesDiarias(){
        ArrayList<String> arr = new ArrayList<>();
        arr = this.getActs();
        Collections.sort(arr, Collections.reverseOrder());
        
        System.out.println('\n' + "Actividades del programador" + '\n');
        for(int i = 0; i< arr.size(); i++){
         String s = arr.get(i);
         char[] c = s.toCharArray();
         StringBuilder test = new StringBuilder();
         
        for(int j = 1; j< c.length-1; j++){
            test.append(c[j]);
        }
        
        System.out.println(i+1 + "- " + test.toString());            
        }
    }
    
}