package GUI;

import java.sql.*;


public class C_Carrera {
    
    private Carreras ventanaCarreras;
    private int CodigoCarrera;
    private String Nombre;
    private String Localidad;
    private String Provincia;
    private Date Fecha;
    private Time Hora;

    public int getCodigoCarrera() {
        return CodigoCarrera;
    }

    public void setCodigoCarrera(int CodigoCarrera) {
        this.CodigoCarrera = CodigoCarrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time Hora) {
        this.Hora = Hora;
    }

    public void mostrarInforCarrera() {

    }

    public void anyadirDatosCarrera() {
        // TODO - implement C_Carrera.anyadirDatosCarrera
        throw new UnsupportedOperationException();
    }

    public void eliminalDatosCarrera() {
        // TODO - implement C_Carrera.eliminalDatosCarrera
        throw new UnsupportedOperationException();
    }
    
}
