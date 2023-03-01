package gestionadordeempleados;

import java.util.ArrayList;

public class Gestionadordeempleados {

    public static void main(String[] args) {
        ArrayList<String> ActD = new ArrayList<String>();
        ArrayList<String> ActD2 = new ArrayList<String>();
        
        ArrayList<String> ActP = new ArrayList<String>();
        
        Diseñador d1 = new Diseñador("Andres", "Garcia", "Martinez", 25, ActD, null);
        Diseñador d2 = new Diseñador("Jorge", "Perez", "Lopez", 27, ActD2, null);
        
        Programador p1 = new Programador("Martin", "Morales", "Colin", 29, ActP, null);
        
        System.out.println(d1.getData());
        d1.ObtenerActividadesDiarias();
        
        System.out.println(d2.getData());
        d2.ObtenerActividadesDiarias();
        
        System.out.println(p1.getData());
        p1.ObtenerActividadesDiarias();
    }   
}