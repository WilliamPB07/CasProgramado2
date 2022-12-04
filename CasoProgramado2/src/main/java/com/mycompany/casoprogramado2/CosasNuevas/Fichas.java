/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoprogramado2.CosasNuevas;

/**
 *
 * @author sebas
 */
public class Fichas 
{
    public Fichas(TipoFichas tipoFichas)
    {
        setTipoFichas(tipoFichas);
    }
    public String FichaJugador1;
    public String FichaJugador2;
    
    private TipoFichas tipoFichas;

    
    private void setTipoFichas(TipoFichas valor)
    {
        tipoFichas = valor;
    }
    
    // Getter
    public TipoFichas getTipoFichas()
    {
        return tipoFichas;
    } 
   
}
