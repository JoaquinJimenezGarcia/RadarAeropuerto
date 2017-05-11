package me.jojigarcia.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
        Collections.sort(aviones, Avion.comparadorPorDistancia);

        Iterator<Avion> itAvion = aviones.iterator();
        while (itAvion.hasNext()){
           Avion avion = itAvion.next();


        //for (Avion avion: aviones){
            System.out.println(avion);

            /* Si necesito recorrer una colección y eliminar elementos de la misma
               no me sirve for each. (No puede hacer esas dos cosas a la vez).
            if (avion.getDistancia() == 0.0){
                aviones.remove(avion);
            }*/

            if (avion.getDistancia() == 0.0){
                itAvion.remove();
            }
        }
    }

    public int longitud(){
        return aviones.size();
    }
}
