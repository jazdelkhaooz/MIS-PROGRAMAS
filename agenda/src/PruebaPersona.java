/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xavier
 */
public class PruebaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona unaPersona = new Persona("Javier","Zaragocin","0990355481"); // indica lo que nos guardamos lo que el operador new devuelve en la variable
        // de tipo referencia a Persona que llamamos unaPersona
        System.out.println("Muestra información accediendo directamente a los campos.");
        System.out.println("Nombre:" + unaPersona.nombre);//con esto accedemos directamente a los atributos de la clase
        System.out.println("Apellido:" + unaPersona.apellido);
        System.out.println("Telefono:" + unaPersona.telefono);
        
        System.out.println("Muestra información llamando a los métodos de una clase");
        System.out.println("Nombre:" + unaPersona.getNombre());//accedemos a la mismo información haciendo uso de los metodos definidos en la clase
        System.out.println("Apellido:" + unaPersona.getApellido()); //System.out.println es para mostrar información en forma de texto por consola 
        System.out.println("Telefono:" + unaPersona.getTelefono());
    }
    
}
