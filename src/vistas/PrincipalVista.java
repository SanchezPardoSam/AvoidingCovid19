package vistas;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import ui.MiBoton;
import ui.Paleta;
import ui.MiBotonIcono;

/**
 * Representa la vista del menú Principal.
 *
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado,
 * @author Gonzales Cubas,
 * @author Ugaz Arenas.
 */
public class PrincipalVista extends JFrame {

    public JLabel nombreEtiqueta;
    public JButton playBoton;
    public JButton comenzarBoton;
    public JButton escenariosBoton;
    public JButton personajesBoton;
    public JButton rankingBoton;
    public JButton ayudaBoton;
    public JButton infoBoton;
    public JButton ajustesBoton;
    public JButton salirBoton;

    public JPanel encabezadoPanel;
    public JPanel principalPanel;
    public JPanel accionesPanel;
    public JPanel opcionesPanel;
    public JPanel barraAccionesPanel;
    public JPanel generalPanel;

    /**
     * Constructor
     */
    public PrincipalVista() {
        setMinimumSize(new Dimension(1024, 576));
        inicializarComponentes();
    }

    /**
     * Inicializa todos los componentes
     */
    public void inicializarComponentes() {
        // Crear los botones
        nombreEtiqueta = new JLabel("Avoiding COVID 19");
        Font font = new Font("Arial", Font.BOLD, 72);
        nombreEtiqueta.setFont(font);
        nombreEtiqueta.setForeground(Paleta.getPlano());

        playBoton = new MiBotonIcono();
        playBoton.setIcon(new ImageIcon(getClass().getResource("/assets/jugar.png")));

        playBoton.setBackground(Paleta.getFondoSuperficie());

        comenzarBoton = new MiBoton();
        comenzarBoton.setText("COMENZAR");
        comenzarBoton.setIcon(new ImageIcon(getClass().getResource("/assets/comenzar.png")));
        comenzarBoton.setForeground(Paleta.getPlanoPrimario());
        comenzarBoton.setBackground(Paleta.getFondoPrimario());

        escenariosBoton = new MiBoton();
        escenariosBoton.setText("ESCENARIOS");
        escenariosBoton.setIcon(new ImageIcon(getClass().getResource("/assets/escenario.png")));
        escenariosBoton.setForeground(Paleta.getPlanoSecundario());
        escenariosBoton.setBackground(Paleta.getFondoSecundario());

        personajesBoton = new MiBoton();
        personajesBoton.setText("PERSONAJES");
        personajesBoton.setIcon(new ImageIcon(getClass().getResource("/assets/personaje.png")));
        personajesBoton.setForeground(Paleta.getPlanoSecundario());
        personajesBoton.setBackground(Paleta.getFondoSecundario());

        rankingBoton = new MiBotonIcono();
        rankingBoton.setIcon(new ImageIcon(getClass().getResource("/assets/ranking.png")));
        rankingBoton.setForeground(Paleta.getPlanoSecundario());
        rankingBoton.setBackground(Paleta.getFondoSecundario());

        ayudaBoton = new MiBotonIcono();
        ayudaBoton.setIcon(new ImageIcon(getClass().getResource("/assets/ayuda.png")));
        ayudaBoton.setForeground(Paleta.getPlanoSecundario());
        ayudaBoton.setBackground(Paleta.getFondoSecundario());

        infoBoton = new MiBotonIcono();
        infoBoton.setIcon(new ImageIcon(getClass().getResource("/assets/info.png")));
        infoBoton.setForeground(Paleta.getPlanoSecundario());
        infoBoton.setBackground(Paleta.getFondoSecundario());

        ajustesBoton = new MiBotonIcono();
        ajustesBoton.setIcon(new ImageIcon(getClass().getResource("/assets/ajustes.png")));
        ajustesBoton.setForeground(Paleta.getPlanoSecundario());
        ajustesBoton.setBackground(Paleta.getFondoSecundario());

        salirBoton = new MiBotonIcono();
        salirBoton.setIcon(new ImageIcon(getClass().getResource("/assets/salir.png")));
        salirBoton.setForeground(Paleta.getPlanoSecundario());
        salirBoton.setBackground(Paleta.getFondoSecundario());

        // Establecer acciones de comando a los botones
        playBoton.setActionCommand("play");
        comenzarBoton.setActionCommand("comenzar");
        escenariosBoton.setActionCommand("escenarios");
        personajesBoton.setActionCommand("personajes");
        rankingBoton.setActionCommand("ranking");
        ayudaBoton.setActionCommand("ayuda");
        infoBoton.setActionCommand("info");
        ajustesBoton.setActionCommand("ajustes");
        salirBoton.setActionCommand("salir");

        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(1, 1));
        contenedor.setBackground(Paleta.getFondo());

        generalPanel = new JPanel();
        generalPanel.setLayout(new GridBagLayout());
        generalPanel.setOpaque(false);

        crearEncabezadoPanel();
        crearPrincipalPanel();
        crearBarraAccionesPanel();

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0;
        generalPanel.add(encabezadoPanel, gbc);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        generalPanel.add(principalPanel, gbc);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 0;
        generalPanel.add(barraAccionesPanel, gbc);

        contenedor.add(generalPanel);

    }

    /**
     * Crea el panel para el encabezado
     */
    public void crearEncabezadoPanel() {
        encabezadoPanel = new JPanel();
        encabezadoPanel.setBorder(new EmptyBorder(32, 0, 0, 0));
        encabezadoPanel.setOpaque(false);

        encabezadoPanel.add(nombreEtiqueta);
    }

    /**
     * Crea el Panel Principal
     */
    public void crearPrincipalPanel() {
        principalPanel = new JPanel();
        principalPanel.setLayout(new BoxLayout(principalPanel, BoxLayout.X_AXIS));
        principalPanel.setOpaque(false);

        principalPanel.add(Box.createHorizontalGlue());
        principalPanel.add(playBoton);
        principalPanel.add(Box.createHorizontalGlue());
    }

    /**
     * Crea el panel para la barra de acciones
     */
    private void crearBarraAccionesPanel() {
        barraAccionesPanel = new JPanel();
        barraAccionesPanel.setLayout(new BoxLayout(barraAccionesPanel, BoxLayout.X_AXIS));
        barraAccionesPanel.setBorder(new EmptyBorder(0, 8, 8, 8));
        barraAccionesPanel.setOpaque(false);

        accionesPanel = new JPanel();
        accionesPanel.setLayout(new BoxLayout(accionesPanel, BoxLayout.X_AXIS));
        accionesPanel.setOpaque(false);

        accionesPanel.add(comenzarBoton);
        accionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        accionesPanel.add(escenariosBoton);
        accionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        accionesPanel.add(personajesBoton);

        opcionesPanel = new JPanel();
        opcionesPanel.setLayout(new BoxLayout(opcionesPanel, BoxLayout.X_AXIS));
        opcionesPanel.setOpaque(false);

        opcionesPanel.add(rankingBoton);
        opcionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        opcionesPanel.add(ayudaBoton);
        opcionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        opcionesPanel.add(infoBoton);
        opcionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        opcionesPanel.add(ajustesBoton);
        opcionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        opcionesPanel.add(salirBoton);

        barraAccionesPanel.add(accionesPanel);
        barraAccionesPanel.add(Box.createHorizontalGlue());
        barraAccionesPanel.add(opcionesPanel);

    }
}
