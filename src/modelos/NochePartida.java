/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.GrayFilter;
import javax.swing.ImageIcon;

/**
 *
 * @author aries
 */
public class NochePartida extends AmbientePartidaDecorador {

    public NochePartida(Escenario decorado) {
        super(decorado);
    }

    /*@Override
    public void escenarioCambio(Escenario decorado) {
        ImageIcon escenario = new ImageIcon(getClass().getResource(decorado.getRutaImagen()));
        Image normalImage = escenario.getImage();
        Image grayImage = GrayFilter.createDisabledImage(normalImage);
        escenario.setImage(grayImage);
    }
*/
@Override
    public void dibujar(Graphics2D g) {
        //System.out.println("Noche");
        getDecorado().dibujar(g);
    }

    @Override
    public String getRutaImagen() {        
        return getDecorado().getRutaImagen();
    }

    @Override
    public void mover() {
        getDecorado().mover();
    }
}
