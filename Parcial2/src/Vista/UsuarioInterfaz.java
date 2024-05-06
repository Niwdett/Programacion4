package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Controlador.ControladorInicioSesion;
import Controlador.ControladorRegistro;

public class UsuarioInterfaz extends JFrame {

    public UsuarioInterfaz(ControladorInicioSesion controladorInicioSesion, ControladorRegistro controladorRegistro) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JButton btnRegistrar = new JButton("Registrar");
        JButton btnIniciarSesion = new JButton("Iniciar Sesión");

        btnRegistrar.addActionListener(e -> {
            new VentanaRegistro(controladorRegistro).setVisible(true);

        });

        btnIniciarSesion.addActionListener(e -> {
            // Mostrar la ventana de inicio de sesión del primer código
            new VentanaInicioSesion(controladorInicioSesion).setVisible(true);
        });

        panel.add(btnRegistrar);
        panel.add(btnIniciarSesion);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Crear una instancia de ControladorInicioSesion con los argumentos necesarios
        ControladorInicioSesion controlador = new ControladorInicioSesion(null);
        ControladorRegistro controladorRegistro = new ControladorRegistro(null);
        // Crear la interfaz de usuario con el controlador
        new UsuarioInterfaz(controlador, controladorRegistro);
    }
}
