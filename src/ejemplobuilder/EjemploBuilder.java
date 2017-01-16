/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobuilder;

import Modelo.builder.Cafeteria;
import Modelo.builder.cafeAmericanoBuilder;
import Modelo.builder.cafeCapuccionoBuilder;
import javax.swing.JOptionPane;
import modelo1.cafe;

/**
 *
 * @author juan
 */
public class EjemploBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Cafeteria  cafeteria = new  Cafeteria();
     cafeteria.setBuilder(new cafeAmericanoBuilder());
     cafeteria.servirTazaCafe();
     cafe taza = cafeteria.getTazaCafe();
     JOptionPane.showMessageDialog(null, taza);
     
   cafeteria.setBuilder(new cafeCapuccionoBuilder());
      cafeteria.servirTazaCafe();
      taza = cafeteria.getTazaCafe();
      JOptionPane.showConfirmDialog(null, taza);
    }

    private static void cafeCapuccionoBuilder() {
        
    }

   
    
}
