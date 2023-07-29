/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectofinalestructuradedatos.Modelo;


import ec.edu.ups.proyectofinalestructuradedatos.Vista.Vista;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author venot
 */
public class ArbolContactos {
    private Nodo raiz;
    private int numContactos ;
    
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public int getNumContactos() {
        return numContactos;
    }

    public void setNumContactos(int numContactos) {
        this.numContactos = numContactos;
    }
    
    
    
    public ArbolContactos() {
        this.raiz = null;
        this.numContactos =0;
    }

    public void insertar (Contacto contacto){
        
        if (raiz==null) {
            raiz = new Nodo(contacto);
            numContactos+=1;
            return;
        }else{
            insertarRecursivo(raiz,contacto);
            
        }
        
    }

    public void insertarRecursivo (Nodo nodo, Contacto contacto){
        if (contacto.getNombre().compareTo(nodo.getContacto().getNombre())<0) {
            if (nodo.getIzquierdo()== null) {
                numContactos+=1;
                nodo.setIzquierdo(new Nodo(contacto));
            }else{
                insertarRecursivo(nodo.getIzquierdo(), contacto);
            }
        }else if (contacto.getNombre().compareTo(nodo.getContacto().getNombre())>0){
            if (nodo.getDerecho() == null) {
                numContactos+=1;
                nodo.setDerecho(new Nodo(contacto));
            }else{
                insertarRecursivo(nodo.getDerecho(), contacto);
            }
        }
    }
    
    
    public Nodo buscarRecursivo(Nodo nodo, String nombre) {
    if (nodo == null || nodo.getContacto().getNombre().equals(nombre)) {
        return nodo;
    }if (nombre.compareTo(nodo.getContacto().getNombre()) < 0) {
        return buscarRecursivo(nodo.getIzquierdo(), nombre);
    } else {
        return buscarRecursivo(nodo.getDerecho(), nombre);
        }
    }
    public void eliminarContacto(String name){
        raiz = eliminarContactoRec(raiz, name);
    }
   
    public Nodo eliminarContactoRec(Nodo nodo, String nombre) {
        
        if (nodo == null) {
            return nodo;
        }

        if (nombre.compareTo(nodo.getContacto().getNombre()) < 0) {
            nodo.setIzquierdo(eliminarContactoRec(nodo.getIzquierdo(), nombre));
        } else if (nombre.compareTo(nodo.getContacto().getNombre()) > 0) {
            nodo.setDerecho(eliminarContactoRec(nodo.getDerecho(), nombre));
        } else {
            
            if (nodo.getIzquierdo()== null) {
                return nodo.getDerecho();
            } else if (nodo.getDerecho()== null) {
                return nodo.getIzquierdo();
            }
            Nodo sucesor = encontrarMinimo(nodo.getDerecho());
            nodo.setContacto(sucesor.getContacto());
            nodo.setDerecho(eliminarContactoRec(nodo.getDerecho(), sucesor.getContacto().getNombre()));
        }
        numContactos-=1;
        return nodo;
    }
    public Nodo encontrarMinimo(Nodo nodo){
        while (nodo.getIzquierdo()!=null) {            
            nodo = nodo.getIzquierdo();
        }
        return nodo;
    }
    
    public int obtenerAltura(Nodo nodo){
        if (nodo==null) {
            return 0;
        }
        int alturaIzquierda=obtenerAltura(nodo.getIzquierdo());
        int alturaDerecho= obtenerAltura(nodo.getDerecho());
        return Math.max(alturaDerecho,alturaIzquierda)+1;
                
    }
    public void inordeRec(Nodo nodo){
        if (nodo!=null) {
            inordeRec(nodo.getIzquierdo());
            System.out.println(nodo.getContacto().getNombre()+" - ");
            inordeRec(nodo.getDerecho());
        }
    }
    public void recorridoPostOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoPostOrden(nodo.getIzquierdo());
            recorridoPostOrden(nodo.getDerecho());
            System.out.println(nodo.getContacto().getNombre() + " - " + nodo.getContacto().getNombre());
        }
    }
    public void recorridoNiveles() {
        if (raiz == null) {
            return;
        }
        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            Nodo nodoActual = cola.poll();
            System.out.println(nodoActual.getContacto().getNombre());

            if (nodoActual.getIzquierdo() != null) {
                cola.add(nodoActual.getIzquierdo());
            }

            if (nodoActual.getDerecho() != null) {
                cola.add(nodoActual.getDerecho());
            }
        }   
    }   
    public void preordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.getContacto()); 
            preordenRecursivo(nodo.getIzquierdo()); 
            preordenRecursivo(nodo.getDerecho());   
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void printTreeNode(Nodo root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.getContacto().getNombre());
            printTreeNode(root.getIzquierdo(), prefix + (isLeft ? "│   " : "    "), true);
            printTreeNode(root.getDerecho(), prefix + (isLeft ? "│   " : "    "), false);
        }
    }
    

}
