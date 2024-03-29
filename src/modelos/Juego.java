package modelos;

import controladores.PrincipalControlador;
import java.applet.AudioClip;
import java.net.URL;
import vistas.PrincipalVista;

/**
 * Esta clase se implementa de la clase IJuego para asignar valores
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class Juego implements IJuego {

    private Personaje personaje;
    private Escenario escenario;
    private PersonajeCreadorAbstracto creadorPersonaje;
    private EscenarioCreadorAbstracto creadorEscenario;
    private PrincipalVista vista;
    private PrincipalControlador controlador;

    public boolean juegoFinalizado = false;
    public boolean pierdeVida = false;
    URL urlSonidoSalto, urlSonidoChoque;
    AudioClip sonidoSalto, sonidoChoque;
  /**
     * Constructor de Juego
     */
    public Juego() {
        creadorPersonaje = new PersonajeCreador();
        creadorEscenario = new EscenarioCreador();
    }
    /**
     * Ejecucion del juego
     */
    @Override
    public void ejecutarJuego() {        
        vista = new PrincipalVista();
        controlador = new PrincipalControlador(vista);
    }
    /**
     * Selección del personaje
     * @param pj Tipo de Personaje
     */
    @Override
    public void elegirPersonaje(int pj) {
        personaje = creadorPersonaje.crear(pj);
    }
    /**
     * Selección del Escenario
     * @param esc Tipo de escenario
     */
    @Override
    public void elegirEscenario(int esc) {
        escenario = creadorEscenario.crearTipo(esc);
    }
    /**
     * Muestra el Personaje
     */
    @Override
    public void mostrarPersonaje() {

    }
    /**
     * Muestra el Escenario
     */
    @Override
    public void mostrarEscenario() {

    }
}
