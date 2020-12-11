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
public class Nivel2 extends Partida {

    @Override
    public void inicializar() {
        Perfil perfil = Perfil.gePerfil();
        setEscenario(new EscenarioCreador().crearTipo(perfil.getEscenarioId()));
        setPersonaje(new PersonajeCreador().crear(perfil.getPersonajeId()));
    }

    @Override
    public void jugar() {
    }

    @Override
    public boolean juegoFinalizado() {
        return true;
    }

    @Override
    public void resultado() {
    }

}
