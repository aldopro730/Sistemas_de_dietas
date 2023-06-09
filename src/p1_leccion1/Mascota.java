/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_leccion1;

import java.util.Date;

/**
 *
 * @author ALEXANDRA
 */
public class Mascota {
    int cod;
    String nomComun;
    String nomPropio;
    int edad;
    String color;
    String porcionAlim;
    Date fechaReg;

    public Mascota() {
    }

    public Mascota(int cod, String nomComun, String nomPropio, int edad, String color, String porcionAlim, Date fechaReg) {
        this.cod = cod;
        this.nomComun = nomComun;
        this.nomPropio = nomPropio;
        this.edad = edad;
        this.color = color;
        this.porcionAlim = porcionAlim;
        this.fechaReg = fechaReg;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNomComun() {
        return nomComun;
    }

    public void setNomComun(String nomComun) {
        this.nomComun = nomComun;
    }

    public String getNomPropio() {
        return nomPropio;
    }

    public void setNomPropio(String nomPropio) {
        this.nomPropio = nomPropio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPorcionAlim() {
        return porcionAlim;
    }

    public void setPorcionAlim(String porcionAlim) {
        this.porcionAlim = porcionAlim;
    } 

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }
    
}
