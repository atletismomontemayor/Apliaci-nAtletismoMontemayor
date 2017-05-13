/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Time;

/**
 *
 * @author Jesús
 */
public class C_MCarreras {
    private String carrerasRealizadas;
    private String mejorPuesto;
    private Time mejorTiempo;

    public String getCarrerasRealizadas() {
        return carrerasRealizadas;
    }

    public String getMejorPuesto() {
        return mejorPuesto;
    }

    public Time getMejorTiempo() {
        return mejorTiempo;
    }

    public void setCarrerasRealizadas(String carrerasRealizadas) {
        this.carrerasRealizadas = carrerasRealizadas;
    }

    public void setMejorPuesto(String mejorPuesto) {
        this.mejorPuesto = mejorPuesto;
    }

    public void setMejorTiempo(Time mejorTiempo) {
        this.mejorTiempo = mejorTiempo;
    }
    
    
    
}
