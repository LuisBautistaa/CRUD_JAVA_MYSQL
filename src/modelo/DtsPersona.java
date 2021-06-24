
package modelo;

public class DtsPersona {
    private String TipPers;
    private String Nombre;
    private String ApePat;
    private String ApeMat;
    private String Curp;
    private String RFC;
    private String Genero;
    private String FecNac;
    private String Calle;
    private String Colonia;
    private String Municipio;
    private String Estado;
    private int Numero;
    private int CodPos;
    private String Celular;
    private String Puesto;
    private String RazSoc;
    private String EdoCivil;
    private int Edad;
    private String GrdAcad;
    private String Correo;
    private String Pagina;
    private String RedSoc;

//    //metodo constructor para cuando se seleccione cliente
//    public DtsPersona(String TipPers, String Nombre, String ApePat, String ApeMat, String Curp, String RFC, String Genero, String Calle, String Colonia, String Estado, int Numero, String Celular) {
//        this.TipPers = TipPers;
//        this.Nombre = Nombre;
//        this.ApePat = ApePat;
//        this.ApeMat = ApeMat;
//        this.Curp = Curp;
//        this.RFC = RFC;
//        this.Genero = Genero;
//        this.Calle = Calle;
//        this.Colonia = Colonia;
//        this.Estado = Estado;
//        this.Numero = Numero;
//        this.Celular = Celular;
//    }
//    //metodo constructor para cuando se seleccione empleado
//    public DtsPersona(String TipPers, String Nombre, String ApePat, String ApeMat, String Curp, String RFC, String Genero, String FecNac, String Calle, String Colonia, String Municipio, String Estado, int Numero, int CodPos, String Celular, String Puesto) {
//        this.TipPers = TipPers;
//        this.Nombre = Nombre;
//        this.ApePat = ApePat;
//        this.ApeMat = ApeMat;
//        this.Curp = Curp;
//        this.RFC = RFC;
//        this.Genero = Genero;
//        this.FecNac = FecNac;
//        this.Calle = Calle;
//        this.Colonia = Colonia;
//        this.Municipio = Municipio;
//        this.Estado = Estado;
//        this.Numero = Numero;
//        this.CodPos = CodPos;
//        this.Celular = Celular;
//        this.Puesto = Puesto;
//    }
//    //metodo constructor para cuando se seleccione proveedor
//    public DtsPersona(String TipPers, String Nombre, String ApePat, String ApeMat, String Curp, String RFC, String Genero, String FecNac, String Calle, String Colonia, String Municipio, String Estado, int Numero, int CodPos, String Celular, String Puesto,String RazSoc) {
//        this.TipPers = TipPers;
//        this.Nombre = Nombre;
//        this.ApePat = ApePat;
//        this.ApeMat = ApeMat;
//        this.Curp = Curp;
//        this.RFC = RFC;
//        this.Genero = Genero;
//        this.FecNac = FecNac;
//        this.Calle = Calle;
//        this.Colonia = Colonia;
//        this.Municipio = Municipio;
//        this.Estado = Estado;
//        this.Numero = Numero;
//        this.CodPos = CodPos;
//        this.Celular = Celular;
//        this.Puesto = Puesto;
//        this.RazSoc = RazSoc;
//    }
//    
    

    public String getEdoCivil() {
        return EdoCivil;
    }

    public void setEdoCivil(String EdoCivil) {
        this.EdoCivil = EdoCivil;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGrdAcad() {
        return GrdAcad;
    }

    public void setGrdAcad(String GrdAcad) {
        this.GrdAcad = GrdAcad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPagina() {
        return Pagina;
    }

    public void setPagina(String Pagina) {
        this.Pagina = Pagina;
    }

    public String getRedSoc() {
        return RedSoc;
    }

    public void setRedSoc(String RedSoc) {
        this.RedSoc = RedSoc;
    }

    public String getTipPers() {
        return TipPers;
    }

    public void setTipPers(String TipPers) {
        this.TipPers = TipPers;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApePat() {
        return ApePat;
    }

    public void setApePat(String ApePat) {
        this.ApePat = ApePat;
    }

    public String getApeMat() {
        return ApeMat;
    }

    public void setApeMat(String ApeMat) {
        this.ApeMat = ApeMat;
    }

    public String getCurp() {
        return Curp;
    }

    public void setCurp(String Curp) {
        this.Curp = Curp;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getFecNac() {
        return FecNac;
    }

    public void setFecNac(String FecNac) {
        this.FecNac = FecNac;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getCodPos() {
        return CodPos;
    }

    public void setCodPos(int CodPos) {
        this.CodPos = CodPos;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getRazSoc() {
        return RazSoc;
    }

    public void setRazSoc(String RazSoc) {
        this.RazSoc = RazSoc;
    }    
   
}
