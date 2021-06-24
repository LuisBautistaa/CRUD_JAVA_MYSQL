
package Servicios;

import Pojos.CApellido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Consultas;


public class ServicioApellido {
    public ArrayList<CApellido> SelectApellido(){
        Consultas consulta = new Consultas();
            ArrayList<CApellido> apellidos = new ArrayList<>();//Objeto "pojo",lista de tipo CNombre
            try {                                                               
                ResultSet result = consulta.ObtenerTabla("capellidos");
                while(result.next()){
                    CApellido cApellido = new CApellido();
                    cApellido.setCvApellido(result.getInt("CvApellido"));
                    cApellido.setDsApellido(result.getString("DsApellido"));
                    apellidos.add(cApellido);                                        
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return apellidos;
        }
    
}
