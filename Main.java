package avion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
      Avion avion1 = new Avion();
      Avion avion2 = new Avion("Boeing", 300, 900, 13000);
      Avion avion3 = new Avion("Airbus", 500, 800, 14000);
      Avion avion4 = new Avion("Embraer", 600, 1000, 120000);
      List<Avion> lsavion = new ArrayList<Avion>();
      lsavion.add(avion1);
      lsavion.add(avion2);
      lsavion.add(avion3);
      lsavion.add(avion4);
      lsavion.add(new Avion());
        
      for(Avion elemento: lsavion){
            System.out.println(elemento.toString());
        }
    } 
}