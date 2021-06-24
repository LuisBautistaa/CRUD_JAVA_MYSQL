
package Servicios;

import Pojos.CGenero;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Consultas;


public class ServicioGenero {
    public ArrayList<CGenero> SelectGenero(){
            Consultas consulta = new Consultas();
            ArrayList<CGenero> genero = new ArrayList<>();//Objeto "pojo",lista de tipo CNombre
            try {                                               
                ResultSet result = consulta.ObtenerTabla("dtgenero");
                while(result.next()){
                    CGenero cGenero = new CGenero();
                    cGenero.setCvGenero(result.getInt("CvGenero"));
                    cGenero.setDsGenero(result.getString("DsGenero"));
                    genero.add(cGenero);                                        
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return genero;
        }
}
