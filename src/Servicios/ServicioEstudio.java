
package Servicios;

import Pojos.CEstudio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Consultas;


public class ServicioEstudio {
    public ArrayList<CEstudio> SelectEstudio(){
        Consultas consulta = new Consultas();
            ArrayList<CEstudio> estudio = new ArrayList<>();//Objeto "pojo",lista de tipo CNombre
            try {                                               
                ResultSet result = consulta.ObtenerTabla("dtgradoestudio");
                while(result.next()){
                    CEstudio cEstudio = new CEstudio();
                    cEstudio.setCvEstudio(result.getInt("CvEstudio"));
                    cEstudio.setDsEstudio(result.getString("DsEstudio"));
                    estudio.add(cEstudio);                                        
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return estudio;
        }
}
