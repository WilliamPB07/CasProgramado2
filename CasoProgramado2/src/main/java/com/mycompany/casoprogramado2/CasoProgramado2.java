/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.casoprogramado2;
import java.util.Scanner;

/**
 *
 * @author wpena
 */
public class CasoProgramado2 {

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        Juego juego = new Juego(entrada);
        juego.ejecutar();
        
    }
}
