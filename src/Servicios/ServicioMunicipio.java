
package Servicios;

import Pojos.CMunicipio;
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
public class ServicioMunicipio {
    public ArrayList<CMunicipio> SelectMunicipio(){
        Consultas consulta = new Consultas();
            ArrayList<CMunicipio> municipio = new ArrayList<>();//Objeto "pojo",lista de tipo CNombre
            try {                                               
                ResultSet result = consulta.ObtenerTabla("dtmunicipio");
                while(result.next()){
                    CMunicipio cMunicipio = new CMunicipio();
                    cMunicipio.setCvMunicipio(result.getInt("CvMunicipio"));
                    cMunicipio.setDsMunicipio(result.getString("DsMunicipio"));
                    municipio.add(cMunicipio);                                        
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return municipio;
        }
}
