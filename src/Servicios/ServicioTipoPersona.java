
package Servicios;

import Pojos.CTipoPersona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Consultas;

public class ServicioTipoPersona {
    public ArrayList<CTipoPersona> SelectTipoPersona(){//creo un objeto de tipo ArrayList
        Consultas consulta = new Consultas();// se crea un obejto de tipo consulta
        ArrayList<CTipoPersona> tipoPersona = new ArrayList();// se crea el arrayList con el nombre de tipoPersona
        try {                        
            ResultSet result = consulta.ObtenerTabla("tipopersona");// le mando el nombre de la table mediante el objeto consulta
            while(result.next()){//ira obteniendo el valor 
                CTipoPersona cTipoPersona = new CTipoPersona();//se crea un objeto de tipo CTipoPersona
                cTipoPersona.setCvPers(result.getInt("CvPers"));// e ira guardando en cTipoPersona el valor
                cTipoPersona.setDsPers(result.getString("DsPers"));
                tipoPersona.add(cTipoPersona);// y al final lo agrefo a mi arrayList lamado tipoPersona
            }
                } catch (SQLException ex) {
            Logger.getLogger(ServicioTipoPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tipoPersona;
    }
}
