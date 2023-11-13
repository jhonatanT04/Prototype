/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.lucerojm.tacurijf.prototype.Modelo;

/**
 *
 * @author venot
 */
public abstract class Personaje implements CloneablePersonaje{
    protected String nombre;
    protected String habilidad;
    protected String equipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Personaje(String nombre, String habilidad, String equipo) {
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.equipo = equipo;
    }
    
    
    
    @Override
    public abstract CloneablePersonaje clonar();
}
