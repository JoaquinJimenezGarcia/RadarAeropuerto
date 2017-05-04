package me.jojigarcia.model;

import java.util.Date;

/**
 * Created by joaquinjimenezgarcia on 4/5/17.
 */
public class Avion {
    private String codVuelo;
    private String aerolinea;
    private int velocidad;
    private Date fechaHora;
    private double distancia;

    public Avion() {
        this.codVuelo = "Desconocida";
        this.aerolinea = "Desconocida";
        this.velocidad = 0;
        this.fechaHora = new Date();
        this.distancia = 0;
    }

    public Avion(String codVuelo, String aerolinea, int velocidad, Date fechaHora, double distancia) {
        this.codVuelo = codVuelo;
        this.aerolinea = aerolinea;
        this.velocidad = velocidad;
        this.fechaHora = fechaHora;
        this.distancia = distancia;
    }

    public String getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(String codVuelo) {
        this.codVuelo = codVuelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
