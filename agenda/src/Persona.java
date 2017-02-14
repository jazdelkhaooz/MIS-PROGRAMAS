/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xavier
 */
public class Persona {
    String nombre;
    String apellido;
    String telefono;
    
    Persona (){} // constructor por defecto
    
    Persona (String nombre, String apellido, String telefono){
    this.nombre = nombre;
    this.apellido = apellido;
    this.telefono = telefono;
    }
    
    String getNombre(){
        return nombre;
    }
    String getApellido(){
        return apellido;
    }
    String getTelefono(){
        return telefono;
    }
}
