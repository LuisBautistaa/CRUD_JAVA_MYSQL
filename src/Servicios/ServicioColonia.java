
package Servicios;

import Pojos.CColonia;
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
public class ServicioColonia {
    public ArrayList<CColonia> SelectColonia(){
        Consultas consulta = new Consultas();
            ArrayList<CColonia> colonia = new ArrayList<>();//Objeto "pojo",lista de tipo CNombre
            try {                                               
                ResultSet result = consulta.ObtenerTabla("dtcolonia");
                while(result.next()){
                    CColonia cColonia = new CColonia();
                    cColonia.setCvColonia(result.getInt("CvColonia"));
                    cColonia.setDsColonia(result.getString("DsColonia"));
                    colonia.add(cColonia);                                        
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return colonia;
        }
}
