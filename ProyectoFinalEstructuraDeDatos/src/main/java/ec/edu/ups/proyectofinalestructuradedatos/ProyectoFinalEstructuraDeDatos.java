/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.proyectofinalestructuradedatos;

import Controlador.Controlador;
import ec.edu.ups.proyectofinalestructuradedatos.Modelo.ArbolContactos;
import ec.edu.ups.proyectofinalestructuradedatos.Vista.Vista;


/**
 *
 * @author venot
 */
public class ProyectoFinalEstructuraDeDatos {

    public static void main(String[] args) {
        Vista vista = new Vista();
        ArbolContactos arbolContactos = new ArbolContactos();
        Controlador controlador = new Controlador(vista, arbolContactos);
        controlador.menu();
        
    }
}
