/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoprogramado2;

import java.util.Scanner;

/**
 * @author Sebastian SP 
 * @author William PB
 */
public class Juego {
    
    Scanner entrada;
    public int opcion;
    public Juego(Scanner entrada)
    {
        this.entrada = entrada;
    }
    
    public void ejecutar()
    {
       
        
        System.out.println("Bienvenidos al juego 4 en linea."
                + "Reglas:"
                + "el primero en formar un linea de 4 fichas del mismo color ya sea recta o diagonal gana."
                + "Se juega eligiendo la columna en la que se quiere que se meta la ficha y esta caera a la casilla mas baja disponible."
                + "Por favor digite 1 para comenzar el juego.");
        opcion = entrada.nextInt();
        while   (opcion != 1)
        {
            if (opcion == 1)
            {
                juego();
            }
            else{
                System.out.println("Por favor digite 1 para poder empezar el juego");
            }
        }
  
    }
             
    public void elecciondeJugador()
    {
        
    }
    public void juego()
    {
        
    }
    
    
    
    
}
