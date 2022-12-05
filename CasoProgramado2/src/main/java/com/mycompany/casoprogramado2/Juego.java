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
    public String opcion;
    public boolean verificador1 = false;
    public boolean verificador2 = false;
    String X = "X";
    String O = "O";
    String Jugador1;
    String Jugador2;
    String auxiliarJugador = "";
    int posicionColumna = 0;
    public Juego(Scanner entrada)
    {
        this.entrada = entrada;
    }
    Jugador jugador1, jugador2;
    public void ejecutar()
    {
       
        
        System.out.println("""
                           Bienvenidos al juego 4 en linea.
                           Reglas:
                           el primero en formar un linea de 4 fichas del mismo color ya sea recta o diagonal gana.
                           Se juega eligiendo la columna en la que se quiere que se meta la ficha y esta caera a la casilla mas baja disponible.
                           """);
       
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
                jugador2.setNombre(nombre2);
         
        Tablero tablerO = new Tablero(); 
        tablerO.espacioColumnas = tablero[1].length;
        tablerO.espacioFilas = tablero.length;
        
        //Llena el tablero de espacios vacios para que no se imprima el null        
        for (int i = 0; i <= tablerO.espacioColumnas - 1; i++) {
            for (int j = 0; j <= tablerO.espacioFilas - 1; j++) {
                tablero[i][j] = " ";
            }
        }
        
        while(!juegoTerminado)
        {
            
            //El turno del jugador1
            while(!verificador1){
            
            tablerO.dibujoTablero(tablero);
            System.out.println("Turno#" + turno);
            
            
                System.out.println(nombre1 + " digite el número de columna en el que quiere poner la ficha.");   
                posicionColumna = entrada.nextInt() -1;
                if (posicionColumna > tablerO.espacioColumnas - 1 || posicionColumna < 0 )
                {
                    System.out.println("Debe ingresar un numero entre el 1 al " + tablerO.espacioColumnas);
                }
                else
                {
                    int contador = 1;
                            for (int i = tablerO.espacioColumnas - 1; i > -1; i = i - 1) 
                            {
                                if (!verificador2) 
                                {
                                    //Al cumplirse esta condicion se termina el turno del jugador1
                                    if (tablero[i][posicionColumna] != X && tablero[i][posicionColumna] != O) {
                                        tablero[i][posicionColumna] = "X";
                                        verificador2 = true;
                                        verificador1 = true;
                                        turno++;
                                    } else {
                                        contador += 1;
                                    }
                                }
                                if (contador == tablerO.espacioFilas + 1) 
                                {
                                    System.out.println("Esta columna esta completa, escoja otra");
                                }
                            }
                }
                
            }
            verificador1 = false;
            verificador2 = false;
            auxiliarJugador = Jugador2;
            auxiliarJugador = X;
            tablerO.verificadorGanador(Jugador2, X);
            
            if (!juegoTerminado == false)
            {
                while(!verificador1){
            tablerO.dibujoTablero(tablero);
            System.out.println("Turno#" + turno);
            
            
                System.out.println(nombre2 + " digite el número de columna en el que quiere poner la ficha.");   
                posicionColumna = entrada.nextInt();
                if (posicionColumna > tablerO.espacioColumnas - 1 || posicionColumna < 0 )
                {
                    System.out.println("Debe ingresar un numero entre el 1 al " + tablerO.espacioColumnas);
                }
                else
                {
                    int contador = 1;
                            for (int i = tablerO.espacioColumnas - 1; i > -1; i = i - 1) 
                            {
                                if (!verificador2) 
                                {
                                    //Al cumplirse esta condicion se termina el turno del jugador1
                                    if (tablero[i][posicionColumna] != O && tablero[i][posicionColumna] != X) {
                                        tablero[i][posicionColumna] = "O";
                                        verificador2 = true;
                                        verificador1 = true;
                                        turno++;
                                    } else {
                                        contador += 1;
                                    }
                                }
                                if (contador == tablerO.espacioFilas + 1) 
                                {
                                    System.out.println("Esta columna esta completa, escoja otra");
                                }
                            }
                }
                
            }
            verificador1 = false;
            verificador2 = false;
            auxiliarJugador = Jugador2;
            auxiliarJugador = O;
            tablerO.verificadorGanador(Jugador2, O);
            }
            
            if (turno == (tablerO.espacioColumnas * tablerO.espacioFilas) +1) 
            {
                juegoTerminado = true;
                tablerO.dibujoTablero(tablero);
                System.out.println("""
                                   Empate!!
                                   El tablerO se lleno sin que hubiera ganador!!""");
            }
            
           
                        
        }
    }
    
    
    
    
}




