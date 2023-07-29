/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectofinalestructuradedatos.Modelo;

/**
 *
 * @author venot
 */
public class Nodo {
    private Contacto contacto;
    Nodo Izquierdo;
    Nodo Derecho;
    

    public Nodo(Contacto contacto) {
        this.contacto = contacto;
        this.Izquierdo = null;
        this.Derecho = null;
    }

    public Contacto getContacto() {
        return contacto;
    }
    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    public Nodo getIzquierdo() {
        return Izquierdo;
    }
    public void setIzquierdo(Nodo izqNodo) {
        this.Izquierdo = izqNodo;
    }
    public Nodo getDerecho() {
        return Derecho;
    }
    public void setDerecho(Nodo derNodo) {
        this.Derecho = derNodo;
    }
    
}
