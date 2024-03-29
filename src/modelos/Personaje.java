package modelos;

import java.awt.Graphics2D;
import java.awt.geom.Area;

/**
 * descripcion
 * @version 13/12/2020/A*@version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public abstract class Personaje {

    private Partida partida;

    public Personaje() {
    }
/**
 * asigna valor a partida
 * @param partida 
 */
    public Personaje(Partida partida) {
        this.partida = partida;
    }
/**
 * dibuja el personaje
 * @param g 
 */
    public abstract void dibujar(Graphics2D g);
/**
 * devuelve rutaImagen
 * @return 
 */
    public abstract String getRutaImagen();
    /**
     * devueve salta
     * @param salta 
     */
    public abstract void setSalta(boolean salta);
    /**
     * retorna yinicial
     * @param yInicial 
     */
    public abstract void setyInicial(int yInicial);
/**
 * mueve al personaje
 */
    public abstract void mover();
/**
 * metodo que valida el salto
 */
    public abstract void saltar();
/**
 * devuelve el area
 * @return 
 */
    public abstract Area getBounds();
}
