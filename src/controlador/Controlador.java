package controlador;


import Pojos.CApellido;
import Pojos.CCalle;
import Pojos.CColonia;
import Pojos.CEdoCivil;
import Pojos.CEstado;
import Pojos.CEstudio;
import Pojos.CGenero;
import Pojos.CMunicipio;
import Pojos.CNombre;
import Pojos.CPuesto;
import Pojos.CTipoPersona;
import Pojos.MDatPerso;
import Servicios.ServicioApellido;
import Servicios.ServicioCalle;
import Servicios.ServicioColonia;
import Servicios.ServicioEstado;
import Servicios.ServicioEstadoCivil;
import Servicios.ServicioEstudio;
import Servicios.ServicioGenero;
import Servicios.ServicioMunicipio;
import Servicios.ServicioNombre;
import Servicios.ServicioPuesto;
import Servicios.ServicioTipoPersona;
import java.util.ArrayList;
import javax.swing.JComboBox;
import modelo.Consultas;

public class Controlador  {
    Consultas consulta = new Consultas();
    public Controlador(){
    
    }
    public void PrepararInser(MDatPerso datos){
                
        consulta.insert(datos);         
    }
    public void ObtenerTabla(){
        //consulta.consultar(modelo);//mando a llamar el metodo de mostrar la tabla
    }

    public void llenarCmbPuesto(JComboBox combo){//metodo para llenar el comboBox Nombre con lo que tenga el scrip
        ServicioPuesto servicePuesto = new ServicioPuesto();    
        ArrayList<CPuesto> cPuesto = servicePuesto.SelectPuesto();
        for(CPuesto puesto : cPuesto){//
            combo.addItem(puesto.getDsPuesto());            
        }
    }

    public void llenarCmbNombre(JComboBox combo){//metodo para llenar el comboBox Nombre con lo que tenga el scrip
        ServicioNombre serviceNombre = new ServicioNombre();    
        ArrayList<CNombre> cNombre= serviceNombre.SelectNombre();
        for(CNombre nombre : cNombre){//
            combo.addItem(nombre.getDsNombre());            
        }
//         for (String key : catalogos.keySet()) {
//            Integer value = catalogos.get(key);
//            System.out.println("Key = " + key + ", Value = " + value);
//           }
        //catalogos.forEach((k,v) -> System.out.println("Key" + k + "Value"+ v));
    }
    public void llenarCmbApellidos(JComboBox combo){//metodo para llenar el comboBox Nombre con lo que tenga el scrip
        ServicioApellido serviceApellido = new ServicioApellido();    
        ArrayList<CApellido> cApellido= serviceApellido.SelectApellido();
        for(CApellido apellido : cApellido){//
            combo.addItem(apellido.getDsApellido());            
        }
    }
    public void llenarCmbEdoCivil(JComboBox combo){//metodo para llenar el comboBox Nombre con lo que tenga el scrip
        ServicioEstadoCivil serviceEdoCivil = new ServicioEstadoCivil();    
        ArrayList<CEdoCivil> cEstadoCivil = serviceEdoCivil.SelectEstadoCivl();
        for(CEdoCivil edoCivil : cEstadoCivil){//
            combo.addItem(edoCivil.getDsEstadoCivil());            
        }
    }
    public void llenarCmbGenero(JComboBox combo){//metodo para llenar el comboBox Nombre con lo que tenga el scrip
        ServicioGenero serviceGenero = new ServicioGenero();    
        ArrayList<CGenero> cGenero = serviceGenero.SelectGenero();
        for(CGenero genero : cGenero){//
            combo.addItem(genero.getDsGenero());            
        }
    }
    public void llenarCmbEstudio(JComboBox combo){//metodo para llenar el comboBox Nombre con lo que tenga el scrip
        ServicioEstudio prueba = new ServicioEstudio();    
        ArrayList<CEstudio> cEstudio = prueba.SelectEstudio();
        for(CEstudio estudio : cEstudio){//
            combo.addItem(estudio.getDsEstudio());            
        }
    }
    public void llenarCmbColonia(JComboBox combo){//metodo para llenar el comboBox Nombre con lo que tenga el scrip
        ServicioColonia prueba = new ServicioColonia();    
        ArrayList<CColonia> cColonia = prueba.SelectColonia();
        for(CColonia colonia : cColonia){//
            combo.addItem(colonia.getDsColonia());            
        }
    }
    
    public void llenarCalle(JComboBox combo){
        ServicioCalle serviceCalle = new ServicioCalle();    
        ArrayList<CCalle> calles = serviceCalle.SelectCalle();
        for(CCalle calle : calles){//
            combo.addItem(calle.getDsCalle());            
        }
    }

    public void llenarMunicipio(JComboBox combo){
        ServicioMunicipio serviceMunicipio = new ServicioMunicipio();    
        ArrayList<CMunicipio> municipios = serviceMunicipio.SelectMunicipio();
        for(CMunicipio municipio : municipios){//
            combo.addItem(municipio.getDsMunicipio());            
        }
    }

    public void llenarEstado(JComboBox combo){
        ServicioEstado serviceEstado = new ServicioEstado();    
        ArrayList<CEstado> estados = serviceEstado.SelectEstado();
        for(CEstado estado : estados){//
            combo.addItem(estado.getDsEstado());            
        }
    }
    
    public void llenarTipoPersona(JComboBox combo){
        ServicioTipoPersona serviceTipoPersona = new ServicioTipoPersona();//se crea un objeto de la clase servicioTipoPersona
        ArrayList<CTipoPersona> tipoPersonas = serviceTipoPersona.SelectTipoPersona();
        for(CTipoPersona tipoPersona : tipoPersonas){
            combo.addItem(tipoPersona.getDsPers());            
        }
        }
    
}
