package me.jojigarcia.model;

import java.util.ArrayList;

/**
 * Created by joaquinjimenezgarcia on 4/5/17.
 */
public class ListaAviones {
    private ArrayList<Avion> aviones;

    public ListaAviones(){
        aviones = new ArrayList<>();
    }

    public void sumarAvion(Avion avion){
        if (avion != null){
            aviones.add(avion);
        }
    }

    public void mostrarAviones(){
        for (Avion avion: aviones){
            System.out.println(aviones.indexOf(avion) + " - " + avion);
        }
    }

    public int longitud(){
        return aviones.size();
    }
}
