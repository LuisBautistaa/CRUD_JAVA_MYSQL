
package Servicios;

import Pojos.CEdoCivil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Consultas;


public class ServicioEstadoCivil {
     public ArrayList<CEdoCivil> SelectEstadoCivl(){
         Consultas consulta = new Consultas();
            ArrayList<CEdoCivil> estadoCivil = new ArrayList<>();//Objeto "pojo",lista de tipo CNombre
            try {                                                               
                ResultSet result =consulta.ObtenerTabla("dtestadocivil");
                while(result.next()){
                    CEdoCivil cEdoCivil = new CEdoCivil();
                    cEdoCivil.setCvEstadoCivil(result.getInt("CvEstadoCivil"));
                    cEdoCivil.setDsEstadoCivil(result.getString("DsEstadoCivil"));
                    estadoCivil.add(cEdoCivil);                                        
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return estadoCivil;
        }
}
