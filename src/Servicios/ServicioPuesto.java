
package Servicios;

import Pojos.CPuesto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Consultas;


public class ServicioPuesto {
    public ArrayList<CPuesto> SelectPuesto(){
        Consultas consulta = new Consultas();
            ArrayList<CPuesto> puesto = new ArrayList<>();//Objeto "pojo",lista de tipo CNombre
            try {                                               
                ResultSet result = consulta.ObtenerTabla("dtpuesto");
                while(result.next()){
                    CPuesto cPuesto = new CPuesto();
                    cPuesto.setCvPuesto(result.getInt("CvPuesto"));
                    cPuesto.setDsPuesto(result.getString("DsPuesto"));
                    puesto.add(cPuesto);                                        
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return puesto;
        }
    
}
