/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoprogramado2.CosasNuevas;
/**
 *
 * @author sebas
 */
public class Espacios 
{
    // Constructor quien recibe el número de espacio
    public Espacios(int espacios)
    {
        setNumeroEspacio(espacios);
    }
    
    private int numeroEspacio;
    private Fichas Fichas;

    
    // Encapsulador para Numero de Espacio
    // Setter
    private void setNumeroEspacio(int valor)
    {
        numeroEspacio = valor;
    }
    
    // Getter
    public int getNumeroEspacio()
    {
        return numeroEspacio;
    }
    
    public boolean ColocarFicha(Fichas valor)
    {
        if (Fichas != null)
        {
            return false;
        }
        
        Fichas = valor;
        return true;
    }
    
    public boolean ocupado()
    {
        return (Fichas != null);
    }
    
}
