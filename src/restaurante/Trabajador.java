/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import java.util.Scanner;

/**
 *
 * @author Jhojan Montaña
 */
public class Trabajador {
    Scanner entrada = new Scanner(System.in);
    private int id; // Identificador principal del trabajador dentro del restaurante
    private String nombre;
    private int pin; // Contraseña de 4 digitos
    
    // Constructor para crear Trabajador
    Trabajador(String nombre, int id, int pin){
        this.id = id;
        this.nombre = nombre;
        this.pin = pin;
        // Aumenta el id cada vez que se crea un nuevo trabajador
        id ++;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getPin() {
        return pin;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void verInfoTrabajador(){
        System.out.println("Nombre:" + getNombre());
        System.out.println("Id:" + getId());
    }
    
    
    
}
