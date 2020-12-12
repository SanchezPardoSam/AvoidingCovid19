/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;

/**
 *
 * @author aries
 */
public abstract class Escenario {

    private Partida partida;
    
    public Escenario() {
    }
    
    public Escenario(Partida partida) {
        this.partida = partida;
    }
    
    public Partida getPartida() {
        return this.partida;
    }
    
    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    
    public abstract void dibujar(Graphics2D g);
    public abstract String getRutaImagen();   
    
    public abstract void mover() ;
}
