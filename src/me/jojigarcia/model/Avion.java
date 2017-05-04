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
        this.setCodVuelo(codVuelo);
        this.setAerolinea(aerolinea);
        this.setVelocidad(velocidad);
        this.setFechaHora();
        this.setDistancia(distancia);
    }

    public String getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(String codVuelo) {
        if (codVuelo.equals("")){
            this.codVuelo = "Desconocido";
        }else {
            this.codVuelo = codVuelo;
        }
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        if (aerolinea.equals("")){
            this.aerolinea = "Desconocido";
        }else {
            this.aerolinea = aerolinea;
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad < 0){
            this.velocidad = 100;
        }else {
            this.velocidad = velocidad;
        }
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora() {
        this.fechaHora = new Date();
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        if (distancia<0){
            this.distancia = 100;
        }else {
            this.distancia = distancia;
        }
    }

    @Override
    public String toString() {
        return "Avion{" +
                "codVuelo='" + codVuelo + '\'' +
                ", aerolinea='" + aerolinea + '\'' +
                ", velocidad=" + velocidad + " km/h" +
                ", fechaHora=" + fechaHora +
                ", distancia=" + distancia + " km" +
                '}';
    }
}
