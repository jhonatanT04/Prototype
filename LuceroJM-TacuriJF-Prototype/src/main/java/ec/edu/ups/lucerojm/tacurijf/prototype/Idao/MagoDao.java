/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.lucerojm.tacurijf.prototype.Idao;

import ec.edu.ups.lucerojm.tacurijf.prototype.Modelo.Mago;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class MagoDao implements Imago{
    
    private List<Mago> listaMagos;

    public MagoDao() {
        listaMagos = new ArrayList<>();
    }
    
    @Override
    public void create(Mago guerrero) {
        listaMagos.add(guerrero);
    }

    @Override
    public void update(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Mago guerrero) {
        Iterator<Mago> it = listaMagos.iterator();
        while (it.hasNext()) {
            Mago d = it.next();
            if (d.getNombre()== guerrero.getNombre()) {
                it.remove();
                break;
            }
        }
    }
    
}
