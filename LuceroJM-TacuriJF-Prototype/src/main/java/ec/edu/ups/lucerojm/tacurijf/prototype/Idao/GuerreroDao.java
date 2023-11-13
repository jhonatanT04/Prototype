/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.lucerojm.tacurijf.prototype.Idao;

import ec.edu.ups.lucerojm.tacurijf.prototype.Modelo.Guerrero;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class GuerreroDao implements Igerrero{
    private List<Guerrero> listaGuerreros;

    public GuerreroDao() {
        listaGuerreros = new ArrayList<>();
    }
    
    @Override
    public void create(Guerrero guerrero) {
        listaGuerreros.add(guerrero);
    }

    @Override
    public void update(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Guerrero guerrero) {
        Iterator<Guerrero> it = listaGuerreros.iterator();
        while (it.hasNext()) {
            Guerrero d = it.next();
            if (d.getNombre() == guerrero.getNombre()) {
                it.remove();
                break;
            }
        }
    }
    
}
