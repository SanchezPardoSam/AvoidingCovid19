/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import controladores.PartidaControlador;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Fernando
 */
public class ContinuarComando implements IComando {

    private PartidaControlador controlador;

    public ContinuarComando(PartidaControlador controlador) {
        this.controlador = controlador;
    }

    @Override
    public void ejecutar() {
        controlador.playerIcon = new ImageIcon(getClass().getResource("/assets/pause.png"));
        controlador.partida.setPausaPartida(false);
        controlador.vista.partidaPanel.updateUI();
        controlador.vista.partidaPanel.player.setIcon(new ImageIcon(controlador.playerIcon.getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));
        controlador.partidaPanel.player.setFocusable(false);
    }
}