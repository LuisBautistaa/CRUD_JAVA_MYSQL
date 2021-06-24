
package modelo;
import Pojos.MDatPerso;

import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.Validaciones;
import vista.Mtto_DtsPersona;

public class Consultas extends conexion{

        conexion c;        
        public Consultas(){
            c= new conexion();            
        }
        //cuanta si ya hat mas de una curp
        public int count(String curp, int tip) {//cuanta si ya existe una curp en cualquier tipo de persona
		int count = 0;
		try {			
            Statement statement = c.getconexion().createStatement();
            ResultSet result = statement.executeQuery("SELECT COUNT(*) FROM mdatperso WHERE mdatperso.Curp ='"+curp+"' and CvTipPers ='"+tip+"';");
            while(result.next()){
            	count = Integer.parseInt(result.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
		return count;
	}
        
        public void insert(MDatPerso datos){      // depues de apePat -> +","+datos.getCvApeMat()
            try { 
                if(count(datos.getCurp(),datos.getCvTipPers())==0){
                    Validaciones val = new Validaciones();                
                    if(val.validarCURP(datos.getCurp().toUpperCase())){
                        //PreparedStatement pst = c.getconexion().prepareStatement("INSERT INTO mttopersona.mdatperso VALUES ('"+null+"','"+datos.getCvColonia()+"','"+datos.getCvEstudio()+"','"+datos.getCvGenero()+"','"+datos.getCvestado()+"','"+datos.getCvEdoCivil()+"','"+datos.getCvCalle()+"','"+datos.getCvPuesto()+"','"+datos.getCvMunicipio()+"','"+datos.getCvTipPers()+"','"+datos.getCvApePat()+"','"+datos.getCurp()+"','"+datos.getRfc()+"','"+/*new Timestamp(new Date().getTime())*/datos.getFecNac()+"','"+datos.getEdad()+"','"+datos.getTelefono()+"','"+datos.getRazonSocial()+"','"+datos.getPagina()+"','"+ datos.getRedSocial()+"','"+datos.getNumCasa()+"','"+datos.getCodPostal()+"','"+datos.getEmail()+"','"+datos.getCvNombre()+"');");
                        PreparedStatement pst = c.getconexion().prepareStatement("INSERT INTO mttopersona.mdatperso VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
                        pst.setString(1,null);
                        pst.setInt(2,datos.getCvColonia());
                        pst.setInt(3,datos.getCvEstudio());
                        pst.setInt(4,datos.getCvGenero());
                        pst.setInt(5,datos.getCvestado());
                        pst.setInt(6,datos.getCvEdoCivil());
                        pst.setInt(7,datos.getCvCalle());
                        pst.setInt(8,datos.getCvPuesto());
                        pst.setInt(9,datos.getCvMunicipio());
                        pst.setInt(10,datos.getCvTipPers());//si incerta, agregar nueva columna en  la maestra
                        pst.setInt(11,datos.getCvApePat());// y cuando hago el select hago CvAPellido,CvApellido from nomTabal where CvApellido= DsApellido                                                             
                        pst.setString(12,datos.getCurp().toUpperCase());
                        pst.setString(13,datos.getRfc());
                        pst.setString(14,datos.getFecNac());
                        pst.setInt(15,datos.getEdad());
                        pst.setString(16,datos.getTelefono());
                        pst.setString(17,datos.getRazonSocial());
                        pst.setString(18,datos.getPagina());
                        pst.setString(19,datos.getRedSocial());
                        pst.setString(20,datos.getNumCasa());
                        pst.setString(21,datos.getCodPostal());
                        pst.setString(22,datos.getEmail());
                        pst.setInt(23,datos.getCvNombre());
                        pst.setInt(24,datos.getCvApeMat());
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Agredado con exito");
                    }else{
                        JOptionPane.showMessageDialog(null, "Escriba una CURP valida");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "La curp ya existe");   
                }
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error al agregar" + ex.getMessage());
            }
        }
        ///proveedor
        public DefaultTableModel consultar(DefaultTableModel modelo){
                String []datos = new String [13];                                
                                
                try {
                Statement statement = c.getconexion().createStatement();
                ResultSet rs = statement.executeQuery("SELECT mdatperso.CvPerso,tipopersona.DsPers,mdatperso.Curp,mdatperso.RFC,cnombre.DsNombre,capellidos.DsApellido,mdatperso.Telefono,mdatperso.Email,dtpuesto.DsPuesto,RazonSocial,dtgenero.DsGenero,dtgradoestudio.DsEstudio,CONCAT(dtcalle.DsCalle,dtColonia.DsColonia,dtmunicipio.DsMunicipio,dtestado.DsEstado) AS 'Direccion' FROM mdatperso,tipopersona,cnombre,capellidos,dtpuesto,dtgenero,dtgradoestudio,dtcalle,dtcolonia,dtmunicipio,dtestado WHERE mdatperso.CvTipPers = tipopersona.CvPers and mdatperso.CvNombre = cnombre.CvNombre \n" +
                                                       "and mdatperso.CvApePat = capellidos.CvApellido and mdatperso.CvPuesto=dtpuesto.CvPuesto and mdatperso.CvGenero=dtgenero.CvGenero and mdatperso.CvEstudio=dtgradoestudio.CvEstudio and mdatperso.CvCalle=dtcalle.CvCalle \n" +
                                                       "and mdatperso.CvColonia=dtcolonia.CvColonia and mdatperso.CvMunicipio=dtmunicipio.CvMunicipio and mdatperso.CvEstado=dtestado.CvEstado and mdatperso.CvTipPers =3 ORDER BY CvPerso;"); 
                                                                    
                        while(rs.next()){
                            datos[0]=rs.getString("CvPerso");
                            datos[1]=rs.getString("DsPers");
                            datos[2]=rs.getString("Curp");
                            datos[3]=rs.getString("RFC");
                            datos[4]=rs.getString("DsNombre");
                            datos[5]=rs.getString("DsApellido");
                            datos[6]=rs.getString("Telefono");
                            datos[7]=rs.getString("Email");
                            datos[8]=rs.getString("DsPuesto");
                            datos[9]=rs.getString("RazonSocial");
                            datos[10]=rs.getString("DsGenero");
                            datos[11]=rs.getString("DsEstudio");
                            datos[12]=rs.getString("Direccion");                            
                            modelo.addRow(datos);
                        }                           
                    } catch (SQLException ex) {
                        Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                return modelo;   
    }
        ///cliente
        public DefaultTableModel consultar1(DefaultTableModel modelo){//aca se modifica si se quiere agregar un nueva columna
                String []datos = new String [11];                                
                                
                try {
                Statement statement = c.getconexion().createStatement();
                ResultSet rs = statement.executeQuery("SELECT mdatperso.CvPerso,tipopersona.DsPers,mdatperso.Curp,mdatperso.RFC,cnombre.DsNombre,capellidos.DsApellido,mdatperso.Telefono,mdatperso.Email,dtgenero.DsGenero,dtgradoestudio.DsEstudio,CONCAT(dtcalle.DsCalle,dtcolonia.DsColonia,dtmunicipio.DsMunicipio,dtestado.DsEstado) AS 'Direccion' FROM mdatperso,tipopersona,cnombre,capellidos,dtgenero,dtgradoestudio,dtcalle,dtcolonia,dtmunicipio,dtestado WHERE mdatperso.CvTipPers = tipopersona.CvPers and mdatperso.CvNombre = cnombre.CvNombre \n" +
"and mdatperso.CvApePat = capellidos.CvApellido and mdatperso.CvGenero=dtgenero.CvGenero and mdatperso.CvEstudio=dtgradoestudio.CvEstudio and mdatperso.CvCalle=dtcalle.CvCalle \n" +
"and mdatperso.CvColonia=dtcolonia.CvColonia and mdatperso.CvMunicipio=dtmunicipio.CvMunicipio and mdatperso.CvEstado=dtestado.CvEstado and mdatperso.CvTipPers =1 ORDER BY CvPerso;");                
                                                                    
                        while(rs.next()){
                            datos[0]=rs.getString("CvPerso");
                            datos[1]=rs.getString("DsPers");
                            datos[2]=rs.getString("Curp");
                            datos[3]=rs.getString("RFC");
                            datos[4]=rs.getString("DsNombre");
                            datos[5]=rs.getString("DsApellido");
                            datos[6]=rs.getString("Telefono");
                            datos[7]=rs.getString("Email");
                            datos[8]=rs.getString("DsGenero");
                            datos[9]=rs.getString("DsEstudio");
                            datos[10]=rs.getString("Direccion");                                                       
                            modelo.addRow(datos);
                        }                           
                    } catch (SQLException ex) {
                        Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                return modelo;   
    }
        //empleado
        public DefaultTableModel consultar2(DefaultTableModel modelo){
                String []datos = new String [12];                                
                                
                try {
                Statement statement = c.getconexion().createStatement();
                ResultSet rs = statement.executeQuery("SELECT mdatperso.CvPerso,tipopersona.DsPers,mdatperso.Curp,mdatperso.RFC,cnombre.DsNombre,capellidos.DsApellido,mdatperso.Telefono,mdatperso.Email,dtpuesto.DsPuesto,dtgenero.DsGenero,dtgradoestudio.DsEstudio,CONCAT(dtcalle.DsCalle,dtcolonia.DsColonia,\n" +
"dtmunicipio.DsMunicipio,dtestado.DsEstado) AS 'Direccion' FROM mdatperso,tipopersona,cnombre,capellidos,dtpuesto,dtgenero,dtgradoestudio,dtcalle,dtcolonia,dtmunicipio,dtestado WHERE mdatperso.CvTipPers = tipopersona.CvPers and mdatperso.CvNombre = cnombre.CvNombre \n" +
"and mdatperso.CvApePat = capellidos.CvApellido and mdatperso.CvPuesto=dtpuesto.CvPuesto and mdatperso.CvGenero=dtgenero.CvGenero and mdatperso.CvEstudio=dtgradoestudio.CvEstudio and mdatperso.CvCalle=dtcalle.CvCalle \n" +
"and mdatperso.CvColonia=dtcolonia.CvColonia and mdatperso.CvMunicipio=dtmunicipio.CvMunicipio and mdatperso.CvEstado=dtestado.CvEstado and mdatperso.CvTipPers =2 ORDER BY CvPerso;");                
                                                                    
                        while(rs.next()){
                            datos[0]=rs.getString("CvPerso");
                            datos[1]=rs.getString("DsPers");
                            datos[2]=rs.getString("Curp");
                            datos[3]=rs.getString("RFC");
                            datos[4]=rs.getString("DsNombre");
                            datos[5]=rs.getString("DsApellido");//prueba con tipo de usuario en pleado
                            datos[6]=rs.getString("Telefono");
                            datos[7]=rs.getString("Email");
                            datos[8]=rs.getString("DsPuesto");// and mdatperso.CvTipPers =3
                            datos[9]=rs.getString("DsGenero");
                            datos[10]=rs.getString("DsEstudio");
                            datos[11]=rs.getString("Direccion");                                                        
                            modelo.addRow(datos);
                        }                           
                    } catch (SQLException ex) {
                        Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                return modelo;   
    }
     // se le agrego curp ya que para toamr el valor a modificar y si existe no lo modifique
        public void modificar(int pers,String curp,int nom,int apePat, int ApeMat, String Fecha,int civil,int edad, int genero, int puesto, int estudio, String cel, 
                               String correo, String pag, String redS,String rason,int calle, int col,int mun, int estado, String casa, String cod,String cv){
            
            try {
//                if(count(curp,pers)==0){//condicion que verifica si la CURP exciste si no exciste es igual a 0 entonces hara la modificacion
                Statement statement = c.getconexion().createStatement();
                statement.executeUpdate("UPDATE mdatperso SET CvTipPers='"+pers+"',Curp ='"+curp+"', CvNombre='"+nom+"',CvApePat ='"+apePat+"',CvApeMat='"+ApeMat+"',FecNac='"+Fecha+"',CvEstadoCivil='"+civil+"',Edad='"+edad+"',CvGenero='"+genero+"',CvPuesto='"+puesto+"',CvEstudio='"+estudio+"',Telefono='"+cel+"',Email='"+correo+"',Pagina='"+pag+"',RedSoc='"+redS+"',"
                        + "RazonSocial='"+rason+"',CvCalle='"+calle+"',CvColonia='"+col+"',CvMunicipio='"+mun+"',CvEstado='"+estado+"',NumCasa='"+casa+"',CodPos='"+cod+"' WHERE CvPerso='"+cv+"';");
                        JOptionPane.showMessageDialog(null, "MODIFICADO CON EXITO");
                        System.out.println(curp);
//            } 
//            else{
//                    JOptionPane.showMessageDialog(null, "La curp ya existe");   
//                    }
            }
                catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR"+ ex.getMessage());
            }
        }
        
        public void delete(String cv) {
    	try {           
            Statement statement = c.getconexion().createStatement();
            statement.executeUpdate("DELETE FROM mttopersona.mdatperso WHERE CvPerso ='"+cv+"'");
    	}catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public String[]  llenarConsulta(String Cv){//aca se llena para que cuando de click en la tabla aparezca los datos en los campos
            
            String []datos = new String [18]; 
            try {           
            Statement statement = c.getconexion().createStatement();
            ResultSet rs = statement.executeQuery("select capellidos.DsApellido,mdatperso.FecNac,mdatperso.Edad,mdatperso.Telefono,mdatperso.Email,mdatperso.Pagina,"
                    + "mdatperso.RedSoc,mdatperso.NumCasa,mdatperso.CodPos,dtcalle.DsCalle,dtColonia.DsColonia,dtmunicipio.DsMunicipio,dtestado.DsEstado,dtpuesto.DsPuesto,RazonSocial,dtgenero.DsGenero,dtgradoestudio.DsEstudio,dtestadocivil.DsEstadoCivil  from mdatperso,capellidos,dtcalle,dtcolonia,dtmunicipio,"
                    + "dtestado,dtpuesto,dtgenero,dtgradoestudio,dtestadocivil where mdatperso.CvApeMat=cApellidos.CvApellido and mdatperso.CvCalle=dtcalle.CvCalle and mdatperso.CvColonia=dtcolonia.CvColonia and mdatperso.CvMunicipio=dtmunicipio.CvMunicipio and mdatperso.CvEstado=dtestado.CvEstado "
                    + "and mdatperso.CvPuesto=dtpuesto.CvPuesto and mdatperso.CvGenero=dtgenero.CvGenero and mdatperso.CvEstudio=dtgradoestudio.CvEstudio and mdatperso.CvEstadoCivil=dtestadocivil.CvEstadoCivil  and CvPerso='"+Cv+"';");
            while(rs.next()){
                            datos[0]=rs.getString("DsApellido");
                            datos[1]=rs.getString("FecNac");
                            datos[2]=rs.getString("Edad");
                            datos[3]=rs.getString("Telefono");
                            datos[4]=rs.getString("Email");
                            datos[5]=rs.getString("Pagina");
                            datos[6]=rs.getString("RedSoc");
                            datos[7]=rs.getString("NumCasa");
                            datos[8]=rs.getString("CodPos");
                            datos[9]=rs.getString("DsCalle");
                            datos[10]=rs.getString("DsColonia");
                            datos[11]=rs.getString("DsMunicipio");
                            datos[12]=rs.getString("DsEstado");
                            datos[13]=rs.getString("DsPuesto");
                            datos[14]=rs.getString("RazonSocial");
                            datos[15]=rs.getString("DsGenero");
                            datos[16]=rs.getString("DsEstudio");
                            datos[17]=rs.getString("DsEstadoCivil");
                        }                           
    	}catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
            return datos;
        }
        
        public ResultSet ObtenerTabla(String nomTabla){
            try {
                Statement statement = c.getconexion().createStatement();
                ResultSet result = statement.executeQuery("SELECT * FROM "+nomTabla);
                return result;
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }            
            return null; 
        }
}

