
package Servicios;

import Pojos.CNombre;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Consultas;


public class ServicioNombre {
     public ArrayList<CNombre> SelectNombre(){
         Consultas consulta = new Consultas();//estancia "objeto" de la clase consulta, para que llame el metedo de obtener tabala
            ArrayList<CNombre> nombres = new ArrayList<>();//Objeto "pojo",lista de tipo CNombre
            try {                                                               
                ResultSet result = consulta.ObtenerTabla("cnombre");
                while(result.next()){
                    CNombre cNombre=new CNombre();
                    cNombre.setCvNombre(result.getInt("CvNombre"));
                    cNombre.setDsNombre(result.getString("DsNombre"));
                    nombres.add(cNombre);                                        
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return nombres;
        }
    
}
