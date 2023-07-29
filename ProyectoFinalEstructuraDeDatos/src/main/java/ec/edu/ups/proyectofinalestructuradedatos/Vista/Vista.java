/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectofinalestructuradedatos.Vista;

import ec.edu.ups.proyectofinalestructuradedatos.Modelo.ArbolContactos;
import ec.edu.ups.proyectofinalestructuradedatos.Modelo.Contacto;
import java.util.Scanner;

/**
 *
 * @author venot
 */
public class Vista {
    private Scanner teclado;
    private ArbolContactos arbol;
    public Vista() {
        this.teclado = new Scanner(System.in);
    }
    public Contacto registrarContacto (){
        System.out.println("Ingrese el nombre del contacto");
        String nombre = teclado.next();
        System.out.println("Ingrese el numero");
        String numero = teclado.next();
        
        return new Contacto(nombre, numero);
    }
    public void imprimirContacto(Contacto contacto){
        System.out.println(contacto);
    }
    public String buscarNombre(){
        System.out.println("Ingrese el nombre a buscar");
        String nom = teclado.next();
        return nom;
    }
    public int mostrarMenu(){
        System.out.println("\n------- MENU--------");
        System.out.println("1. Agregar Contacto");
        System.out.println("2. Buscar Contacto");
        System.out.println("3. Eliminar Contacto");
        System.out.println("4. Agregar Correo");
        System.out.println("5. Agregar Red Social");
        System.out.println("6. Imprimir Preorder");
        System.out.println("7. Imprimir Inorder");
        System.out.println("8. Imprimir Postorder");
        System.out.println("9. Imprimir Achura");
        System.out.println("10. Obtener Número de Contactos");
        System.out.println("11. Obtener Número de Niveles");
        System.out.println("0. Salir");
        System.out.print("Ingrese opción:");
        int opc = teclado.nextInt();
        return opc;
    }
    public void mostrarContactoBusqueda(Contacto contacto){
        System.out.println("Contacto encontrador : \n"+contacto);
    }
    public int deseaIngresarContacto(String nom){
        System.out.println("Ingrese \n1.Si desea ingresar un nuevo con "+nom+" \n0.No desea ingresar un nuevo contacto");
        int opc = teclado.nextInt();
        return opc;
    }
    public Contacto registrarEnBuscar(String nom){
        System.out.println("El contacto tiene el nombre de : "+ nom+"\nIngrese el numero del nuevo contacto :");
        String num = teclado.next();
        return new Contacto(nom, num);
    }
    public String eliminarNom(){
        System.out.println("Ingrese el nombre de la persona que quiere eliminar :");
        String nom = teclado.next();
        return nom;
    }
    public void elimarExisto(){
        System.out.println("Se a eliminado existosamente");
    }
    public void contactoNoExsite(){
        System.out.println("El contacto no existe");
    }
    public void altura(int num){
        System.out.println("La altura del arbol es de "+ num);
    }
    public void inorden(){
        System.out.println("La impresion en Inorden es : ");
    }
    public void postOrden(){
        System.out.println("La impresion en postOrden");
    }
    public void niveles(){
        System.out.println("Recorrido por niveles : ");
    }
    public void numeroContactos(int num ){
        System.out.println("El numero de contatos es  : "+ num);
    }
    public void preorden(){
        
    }
}
