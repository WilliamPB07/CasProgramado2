/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoprogramado2.CosasNuevas;

import com.mycompany.casoprogramado2.CosasNuevas.Espacios;

/**
 *
 * @author sebas
 */
public class Tablero 
{
    public Tablero(int numeroTablero)
    {
        setNumeroTablero(numeroTablero);
    }
 
    private Espacios espacios[][];
    private int filas;
    private int columnas;
    
    private int numeroTablero;
    
    // Setter
    private void setNumeroTablero(int valor)
    {
        numeroTablero = valor;
    }
    
    // Getter
    public int getNumeroTablero()
    {
        return numeroTablero;
    }
    
    public void crearEspacios(int filas, int columnas)
    {
        this.filas = filas;
        this.columnas = columnas;
        
        // Crea la matriz
        espacios = new Espacios[filas][columnas];
        
        for(int i = 0; i < filas; i++)
        {
            for(int j = 0; j < columnas; j++)
            {
                espacios[i][j] = new Espacios((i + 1) * (j + 1));
            }
        }
    }
    
    public int getCantidadEspacios()
    {
        return filas * columnas;
    }
    
    public int getCantidadEspaciosOcupados()
    {
        int ocupados = 0;
        
        for(int i = 0; i < filas; i++)
        {
            for(int j = 0; j < columnas; j++)
            {

                Espacios espacio = espacios[i][j];
                if (espacio.ocupado())
                {
                    ocupados++; 
                }
            }
        }
        
        return ocupados;
    }
    
}
