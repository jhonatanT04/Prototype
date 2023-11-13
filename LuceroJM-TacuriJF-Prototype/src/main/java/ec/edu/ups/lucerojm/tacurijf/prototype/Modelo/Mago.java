/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.lucerojm.tacurijf.prototype.Modelo;

/**
 *
 * @author venot
 */
public class Mago extends Personaje{
    private String encanto;

    public Mago(String encanto, String nombre, String habilidad, String equipo) {
        super(nombre, habilidad, equipo);
        this.encanto = encanto;
    }
    
    @Override
    public CloneablePersonaje clonar() {
        Mago magoClon = new Mago(encanto, nombre, habilidad, equipo);
        return magoClon;
    }
    
}
