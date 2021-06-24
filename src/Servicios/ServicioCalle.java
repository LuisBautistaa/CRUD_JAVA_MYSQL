
package Servicios;

import Pojos.CCalle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Consultas;

/**
 *
 * @author User-PC
 */
public class ServicioCalle {    
     public ArrayList<CCalle> SelectCalle(){
        Consultas consulta = new Consultas();
            ArrayList<CCalle> calle = new ArrayList<>();//Objeto "pojo",lista de tipo CNombre
            try {                                               
                ResultSet result = consulta.ObtenerTabla("dtcalle");
                while(result.next()){
                    CCalle cCalle = new CCalle();
                    cCalle.setCvCalle(result.getInt("CvCalle"));
                    cCalle.setDsCalle(result.getString("DsCalle"));
                    calle.add(cCalle);                                        
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return calle;
        }
}
