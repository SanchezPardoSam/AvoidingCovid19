/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author aries
 */
public class PartidaMemento {
    private Partida estado;

    public PartidaMemento(Partida estado) {
        this.estado = estado;
    }
    
    public Partida getEstadoGuardado() {
        return estado;
    }
}