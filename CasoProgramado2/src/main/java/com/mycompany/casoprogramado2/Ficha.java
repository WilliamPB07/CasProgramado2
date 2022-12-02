/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoprogramado2;

/**
 *
 * @author wpena
 */
public abstract class Ficha 
{
    String nombre;
    int numeroJugador;
    Colorficha colorFicha;

    public Ficha(String nombre, int numeroJugador, Colorficha colorFicha) {
        setNombre(nombre);
        setNumeroJugador(numeroJugador);
        setColorFicha(colorFicha);
    }

    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String valor)
    {
        nombre = valor;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    public Colorficha getColorFicha() {
        return colorFicha;
    }

    public void setColorFicha(Colorficha valor) {
        this.colorFicha = valor;
    }
    
    
    
    
    
}
