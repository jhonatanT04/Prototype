/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.cantante.compositor.interfaces.controlador;

import ec.edu.ups.practica.cantante.compositor.interfaces.idao.ICantanteDao;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Cantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Disco;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.VistaCantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.VistaDisco;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorCantante {
    //objetos vist
    private VistaCantante vistaCantante;
    private VistaDisco vistaDisco;
    //objetos modelo
    private Cantante cantante;
    private Disco disco;
    //objetos DAO
    private ICantanteDao cantanteDao;
    

    // constructor

    public ControladorCantante(VistaCantante vistaCantante, VistaDisco vistaDisco, ICantanteDao cantanteDao) {
        this.vistaCantante = vistaCantante;
        this.vistaDisco = vistaDisco;
        this.cantanteDao = cantanteDao;
    }
    

    
    //llama al DAO para guardar un cliente
    public void registrar(Cantante cantante) {
        cantanteDao.create(cantante);
        ///eingresar disco
    }
    
    //llama al DAO para actualizar un cliente
    public void actualizar(Cantante cantante) {
        
        Disco discoss = (Disco) cantante.getDiscos();//JUSTIN GEI SI NO VALE    
        int ed =cantante.getCodigo();
        cantante = vistaCantante.actualizarCantante(ed);
        cantante.agregarDisco(discoss);
        cantanteDao.update(cantante);
        
    }

    //llama al DAO para eliminar un cliente
    public void eliminar(int id) {
        cantanteDao.delete(cantanteDao.read(id));
    }
    
    
    //llama al DAO para obtener un cliente por el id y luego los muestra en la vista
    public Cantante buscarCantante(int id) {
        return cantanteDao.read(id);
    }


    //llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public List<Cantante> verCantantes() {
        return cantanteDao.findAll();
        
    }
    
    public Disco buscarporDisco(String nombre){
        return cantanteDao.buscarPorNombreDeDisco(nombre);
    }
    
    public void eliminarDisco(Cantante cantante,int codigo){
        List<Disco> listaDiscos=cantante.getDiscos();
        for (Disco listaDisco : listaDiscos) {
            if (listaDisco.getCodigo()==codigo) {
                cantante.eliminarDisco(codigo);
                cantanteDao.update(cantante);
            }
        }
    }
    
    public void actualizarDisco(Cantante cantante,Disco disco){
        cantante.actualizarDisco(disco);
        cantanteDao.update(cantante); 
    }
    
}
