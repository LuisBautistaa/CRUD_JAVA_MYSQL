
package Servicios;

import Pojos.CEstado;
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
public class ServicioEstado {
    public ArrayList<CEstado> SelectEstado(){
        Consultas consulta = new Consultas();
            ArrayList<CEstado> estado = new ArrayList<>();//Objeto "pojo",lista de tipo CNombre
            try {                                               
                ResultSet result = consulta.ObtenerTabla("dtestado");
                while(result.next()){
                    CEstado cEstado = new CEstado();
                    cEstado.setCvEstado(result.getInt("CvEstado"));
                    cEstado.setDsEstado(result.getString("DsEstado"));
                    estado.add(cEstado);                                        
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return estado;
        }
}
