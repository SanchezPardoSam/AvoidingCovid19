/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

/**
 * Representa una implementación concreta de la clase Personaje.
 *@version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class CivilPersonaje extends Personaje {

    private int tipo;
    private String rutaImagen;

    private int ancho = 70;
    // private int ancho = 112;
    private int alto = 145;
    // private int alto = 110;

    private int xInicial = 50;

    public int yInicial = 370;
    private int xAuxiliar = 0;
    private int yAuxiliar = 0;

    private boolean sube = false;
    private boolean baja = false;
    private boolean salta = false;

    private Area piernaIzquierda;
    private Area piernaDerecha;
    private Area cuerpo;
    private Area personajeArea;
    /**
     * Evalua el movimiento saltar del personaje civil
     * @return  Verifica si salta o no
     */
    public boolean isSalta() {
        return salta;
    }
    /**
     * Establecer el movimiento saltar del personaje civil
     * @param salta Booleano para determinar salto
     */
    @Override
    public void setSalta(boolean salta) {
        this.salta = salta;
    }
    /**
     * Inicializa al personaje civil
     */
    public CivilPersonaje() {
        this.tipo = 1;
        this.rutaImagen = "/assets/personajes/david/normal.png";
    }
    /**
     * Agrega el personaje civil  en la partida
     * @param partida Establece la ruta del personaje
     */
    public CivilPersonaje(Partida partida) {
        super(partida);
        this.tipo = 1;
        this.rutaImagen = "/assets/personajes/david/normal.png";
    }
    /**
     * Retorna la ruta de la imagen del personaje civil
     * @return Obtiene la ruta imagen
     */
    @Override
    public String getRutaImagen() {
        return rutaImagen;
    }
    /**
     * Retorna el eje x inicial del objeto 
     * @return  Obtiene la posicion
     */
    public int getxInicial() {
        return xInicial;
    }
    /**
     * Establece el eje x inicial del objeto
     * @param xInicial Establece la posicion en x
     */
    public void setxInicial(int xInicial) {
        this.xInicial = xInicial;
    }

    public int getyInicial() {
        return yInicial;
    }

    @Override
    public void setyInicial(int yInicial) {
        this.yInicial = yInicial;
    }

    public int getxAuxiliar() {
        return xAuxiliar;
    }

    public void setxAuxiliar(int xAuxiliar) {
        this.xAuxiliar = xAuxiliar;
    }

    public int getyAuxiliar() {
        return yAuxiliar;
    }

    public void setyAuxiliar(int yAuxiliar) {
        this.yAuxiliar = yAuxiliar;
    }

    @Override
    public void dibujar(Graphics2D g) {
        ImageIcon personaje = new ImageIcon(getClass().getResource(this.rutaImagen));
        g.drawImage(personaje.getImage(), xInicial, yInicial, ancho, alto, null);
    }

    @Override
    public void mover() {
        if (xInicial + xAuxiliar > 0 && xInicial + xAuxiliar < 1000 - ancho) {
            xInicial = xInicial + xAuxiliar;
        }

        if (salta) {
            if (yInicial == 370) {
                sube = true;
                yAuxiliar = -2;
                baja = false;
            }

            if (yInicial == 150) {
                baja = true;
                yAuxiliar = 2;
                sube = false;
            }

            if (sube) {
                yInicial = yInicial + yAuxiliar;
            }

            if (baja) {
                yInicial = yInicial + yAuxiliar;

                if (yInicial == 370) {
                    salta = false;
                }
            }
        }
    }

    @Override
    public void saltar() {
        salta = true;
    }

    @Override
    public Area getBounds() {
        Rectangle forma1 = new Rectangle(xInicial, yInicial, 95, 62);
        cuerpo = new Area(forma1);

        Ellipse2D forma2 = new Ellipse2D.Double(xInicial, yInicial + 28, 48, 48);
        piernaDerecha = new Area(forma2);

        Ellipse2D forma3 = new Ellipse2D.Double(xInicial + 73, yInicial + 39, 38, 38);
        piernaIzquierda = new Area(forma3);

        personajeArea = cuerpo;
        personajeArea.add(cuerpo);
        personajeArea.add(personajeArea);
        personajeArea.add(piernaIzquierda);

        return personajeArea;
    }

}
