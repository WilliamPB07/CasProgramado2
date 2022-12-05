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
public class Juego extends Tablero {
    
    Scanner entrada;
    public boolean juegoTerminado = false;
    public int turno = 1;
    public int opcion;
    public boolean verificador1 = false;
    public boolean verificador2 = false;
    public Juego(Scanner entrada)
    {
        this.entrada = entrada;
    }
    Jugador jugador1, jugador2;
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
                String nombre1, nombre2;
                
                //Nombre del primer jugador
                jugador1 = new FichaAzul();
                System.out.println("Jugador 1 ingrese su apodo: ");
                nombre1  = entrada.next();
                jugador1.setNombre(nombre1);

                //Nombre del segundo jugador
                jugador2 = new FichaRoja();
                System.out.println("Jugador 2 ingrese su apodo: ");
                nombre2  = entrada.next();
                while(nombre2.equals(nombre1))
                {
                    System.out.println("Este nombre ya lo tiene el jugador1!!");
                    if (nombre2 != nombre1) 
                    {
                        jugador2.setNombre(nombre2);
                    }
                }    
            juego();
            }
            else
            {
                System.out.println("Por favor digite 1 para poder empezar el juego");
            }
            
        }        
      }
             
    public void juego()
    {
        while(!juegoTerminado)
        {
            
            //El turno del jugador1
            while(!verificador1){
            Tablero.dibujoTablero(tablero);
            System.out.println("Turno#" + turno);
            
            
                System.out.println("Digite el número de columna en el que quiere poner la ficha.");   
                int posicionColumna = entrada.nextInt();
                if (posicionColumna > Tablero.espacioColumnas - 1 || posicionColumna < 0 )
                {
                    System.out.println("Debe ingresar un numero entre el 1 al " + Tablero.espacioColumnas);
                }
                else
                {
                    int contador = 1;
                            for (int i = Tablero.espacioColumnas - 1; i > -1; i = i - 1) 
                            {
                                if (!verificador2) 
                                {
                                    //Al cumplirse esta condicion se termina el turno del jugador1
                                    if (tablero[i][Tablero.espacioColumnas] != Colorficha.AZUL && tablero[i][Tablero.espacioColumnas] != Colorficha.ROJO) {
                                        tablero[i][Tablero.espacioColumnas] = Colorficha.AZUL;
                                        verificador2 = true;
                                        verificador1 = true;
                                        turno++;
                                    } else {
                                        contador += 1;
                                    }
                                }
                                if (contador == Tablero.espacioFilas + 1) 
                                {
                                    System.out.println("Esta columna esta completa, escoja otra");
                                }
                            }
                }
                
            }
            verificador1 = false;
            verificador2 = false;
            Tablero.verificadorGanador(jugador1, Colorficha.AZUL);
            
            if (!juegoTerminado == false)
            {
                while(!verificador1){
            Tablero.dibujoTablero(tablero);
            System.out.println("Turno#" + turno);
            
            
                System.out.println("Digite el número de columna en el que quiere poner la ficha.");   
                int posicionColumna = entrada.nextInt();
                if (posicionColumna > Tablero.espacioColumnas - 1 || posicionColumna < 0 )
                {
                    System.out.println("Debe ingresar un numero entre el 1 al " + Tablero.espacioColumnas);
                }
                else
                {
                    int contador = 1;
                            for (int i = Tablero.espacioColumnas - 1; i > -1; i = i - 1) 
                            {
                                if (!verificador2) 
                                {
                                    //Al cumplirse esta condicion se termina el turno del jugador1
                                    if (tablero[i][Tablero.espacioColumnas] != Colorficha.ROJO && tablero[i][Tablero.espacioColumnas] != Colorficha.AZUL) {
                                        tablero[i][Tablero.espacioColumnas] = Colorficha.ROJO;
                                        verificador2 = true;
                                        verificador1 = true;
                                        turno++;
                                    } else {
                                        contador += 1;
                                    }
                                }
                                if (contador == Tablero.espacioFilas + 1) 
                                {
                                    System.out.println("Esta columna esta completa, escoja otra");
                                }
                            }
                }
                
            }
            verificador1 = false;
            verificador2 = false;
            Tablero.verificadorGanador(jugador2, Colorficha.AZUL);
            }
            
            if (turno == (Tablero.espacioColumnas * Tablero.espacioFilas) +1) 
            {
                Tablero.dibujoTablero(tablero);
                System.out.println("Empate!!"
                        + "El tablero se lleno sin que hubiera ganador!!");
            }
            
            
            
            
            
            
                
                        
        }
    }
    
    
    
    
}






















































































































































































































































































































































































































































































































































































































































































































































































































































































//.//troleado




