/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import ec.edu.ups.proyectofinalestructuradedatos.Modelo.ArbolContactos;
import ec.edu.ups.proyectofinalestructuradedatos.Modelo.Contacto;
import ec.edu.ups.proyectofinalestructuradedatos.Modelo.Nodo;
import ec.edu.ups.proyectofinalestructuradedatos.Vista.Vista;


/**
 *
 * @author venot
 */
public class Controlador {
    private Vista vista;
    private ArbolContactos arbolContactos;
    private Contacto contacto;

    public Controlador(Vista vista, ArbolContactos arbolContactos) {
        this.vista = vista;
        this.arbolContactos = arbolContactos;
    }
    
    private void agregarContacto(){
        contacto = vista.registrarContacto();
        arbolContactos.insertar(contacto);
    }
    private void buscarPorNombre(){
        String nombre = vista.buscarNombre();
        Nodo contacto = arbolContactos.buscarRecursivo(arbolContactos.getRaiz(), nombre);
        if (contacto!=null) {
            vista.mostrarContactoBusqueda(contacto.getContacto());
        }else{
            int opc = vista.deseaIngresarContacto(nombre);
            if (opc==1) {
                Contacto con = vista.registrarEnBuscar(nombre);
                arbolContactos.insertar(con);
            }
        }
    }
    private void eliminarContacto(){
        String nomElimi = vista.eliminarNom();
        if (arbolContactos.buscarRecursivo(arbolContactos.getRaiz(), nomElimi)!= null) {
            arbolContactos.eliminarContacto(nomElimi);
            vista.elimarExisto();
        }else{
            vista.contactoNoExsite();
        }
    }
    private void obtenerAltura(){
        int alt = arbolContactos.obtenerAltura(arbolContactos.getRaiz());
        vista.altura(alt);
    }
    
    private void inorden(){
        vista.inorden();
        arbolContactos.inordeRec(arbolContactos.getRaiz());
    }
    private void postOrden(){
        vista.postOrden();
        arbolContactos.recorridoPostOrden(arbolContactos.getRaiz());
    }
    private void niveles(){
        vista.niveles();
        arbolContactos.recorridoNiveles();
    }
    private void numContactos(){
        vista.numeroContactos(arbolContactos.getNumContactos());
    }
    private void preorden(){
        vista.preorden();
        arbolContactos.preordenRecursivo(arbolContactos.getRaiz());
    }
    public void menu(){
        int opcion=0;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    this.agregarContacto();
                    break;
                case 2:
                    this.buscarPorNombre();
                    break;
                case 3:
                    this.eliminarContacto();
                case 4:
                    // Agregar Correo
                    // Pedir nombre y correo, agregar el correo al contacto correspondiente
                    break;
                case 5:
                    // Agregar Red Social
                    // Pedir nombre, red social y URL, agregar la red social al contacto correspondiente
                    break;
                case 6:
                    this.preorden();
                    break;
                case 7:
                    this.inorden();
                    break;
                case 8:
                    this.postOrden();
                    break;
                case 9:
                    this.niveles();
                    break;
                case 10:
                    this.numContactos();
                    break;
                case 11:
                    this.obtenerAltura();
                    break;
                case 12:
                    arbolContactos.printTreeNode(arbolContactos.getRaiz(), "", true);
                    break;
                case 0:
                    System.out.println("Finalizado");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 0);
    }
}
