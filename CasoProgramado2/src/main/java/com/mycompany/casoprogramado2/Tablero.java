/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoprogramado2;


/**
 *
 * @author wpena
 */
public class Tablero{
    
    public  String[][] tablero = new String[7][7];
    public  int espacioColumnas;
    public  int espacioFilas;
    public  boolean terminaJuego = false;
    
    public void dibujoTablero(String[][] tabla) 
    {
        System.out.print("          ");
        for (int i = 1; i < espacioColumnas + 1; i += 1) {
            System.out.print(i + "   ");
        }
        System.out.println("");
        System.out.print("         ");
        for (int i = 0; i < espacioColumnas; i += 1) {
            System.out.print("____");
        }
        System.out.println("");
        for (int i = 0; i < espacioFilas; i++) {
            System.out.print("       ");
            for (int j = 0; j < espacioFilas; j++) {
                System.out.print(" | " + tabla[i][j]);
            }
            System.out.println(" |");
            if (i < espacioFilas - 1) {
                System.out.print("        |");
                for (int p = 1; p < espacioColumnas - 1; p += 1) {
                    System.out.print("–––––––");
                }
                System.out.println("|");
            }
        }
        System.out.print("         ");
        for (int i = 1; i < espacioColumnas + 1; i += 1) {
            System.out.print("¯¯¯¯");
        }
        System.out.println("");
    }
     
 
    public  void verificadorGanador(String auxiliarJugador, String auxilarCaracter) 
     {
        //Lee la linea horizontal en busca del ganador
        for (int i = 1; i < espacioFilas; i += 1) {
            for (int j = 0; j < espacioColumnas - 3; j += 1) {
                if (tablero[i][j].equals(auxilarCaracter) && tablero[i][j + 1].equals(auxilarCaracter) && tablero[i][j + 2].equals(auxilarCaracter) && tablero[i][j + 3].equals(auxilarCaracter)) {
                    terminaJuego = true;
                    dibujoTablero(tablero);
                    System.out.println("HA GANADO: " + auxiliarJugador + " CONECTO 4 HORIZONTALMENTE!!!");
                }
            }
        }
 
        //Lee la linea vertical en busca del ganador
        for (int i = 0; i < espacioFilas; i += 1) {
            for (int j = 0; j < espacioColumnas - 3; j += 1) {
                if (tablero[j][i].equals(auxilarCaracter) && tablero[j + 1][i].equals(auxilarCaracter) && tablero[j + 2][i].equals(auxilarCaracter) && tablero[j + 3][i].equals(auxilarCaracter)) {
                    terminaJuego = true;
                    dibujoTablero(tablero);
                    System.out.println("HA GANADO: " + auxiliarJugador + " CONECTO 4 VERTICALMENTE!!!");
                }
            }
        }
 
        //Leen la linea diagonal (ambos lados) en busca del ganador
        for (int i = 0; i < espacioColumnas - 4 + 1; i += 1) {
            for (int j = 0; j < espacioFilas - 4 + 1; j += 1) {
                if (tablero[j][i].equals(auxilarCaracter) && tablero[j + 1][i + 1].equals(auxilarCaracter) && tablero[j + 2][i + 2].equals(auxilarCaracter) && tablero[j + 3][i + 3].equals(auxilarCaracter)) {
                    terminaJuego = true;
                    dibujoTablero(tablero);
                    System.out.println("HA GANADO: " + auxiliarJugador + " CONECTO 4 DIAGONALMENTE!!!");
                }
            }
        }
        for (int i = espacioColumnas; i > 3; i -= 1) {
            for (int j = 0; j < espacioFilas - 3; j += 1) {
                if (tablero[j][i - 1].equals(auxilarCaracter) && tablero[j + 1][i - 2].equals(auxilarCaracter) && tablero[j + 2][i - 3].equals(auxilarCaracter) && tablero[j + 3][i - 4].equals(auxilarCaracter)) {
                    terminaJuego = true;
                    dibujoTablero(tablero);
                    System.out.println("HA GANADO: " + auxiliarJugador + " CONECTO 4 DIAGONALMENTE!!!");
                }
            }
        }
    }

}
