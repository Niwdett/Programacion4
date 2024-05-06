package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controlador.ControladorInicioSesion;


// Interfaz gráfica para el inicio de sesión
public class VentanaInicioSesion extends JFrame {

    private static ControladorInicioSesion controladorInicioSesion;

    // Constructor de la interfaz
    public VentanaInicioSesion(ControladorInicioSesion controladorInicioSesion) {
        VentanaInicioSesion.controladorInicioSesion = controladorInicioSesion;
        crearComponentes();
    }

    public VentanaInicioSesion(Object controladorInicioSesion2) {
        //TODO Auto-generated constructor stub
    }

    // Componentes de la interfaz
    private JTextField txtCorreo;
    private JPasswordField txtContrasena;

    // Método para crear los componentes de la interfaz
    public void crearComponentes() {
        setTitle("My Hotel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Crear panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Componentes de correo y contraseña
        JLabel lblCorreo = new JLabel("Correo:");
        txtCorreo = new JTextField(20);
        JLabel lblContrasena = new JLabel("Contraseña:");
        txtContrasena = new JPasswordField(20);

        // Botón de iniciar sesión
        JButton btnIniciarSesion = new JButton("Iniciar Sesión");

        // Agregar ActionListener al botón de iniciar sesión
        btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarSesion();
            }
        });

        // Panel para el botón de iniciar sesión
        JPanel botonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        botonPanel.add(btnIniciarSesion);

        // Agregar componentes al panel principal
        mainPanel.add(lblCorreo);
        mainPanel.add(txtCorreo);
        mainPanel.add(lblContrasena);
        mainPanel.add(txtContrasena);
        mainPanel.add(botonPanel);

        // Agregar panel principal al JFrame
        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Método para iniciar sesión
    private void iniciarSesion() {
        String correo = txtCorreo.getText();
        String contrasena = new String(txtContrasena.getPassword());
        boolean loginExitoso = controladorInicioSesion.iniciarSesion(correo, contrasena);
        if (loginExitoso) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. Bienvenido a MyHotel.");
            dispose(); // Cerrar la ventana de inicio de sesión
            // Aquí puedes abrir la siguiente interfaz después de un inicio de sesión exitoso
        } else {
            JOptionPane.showMessageDialog(null, "Error: Correo electrónico o contraseña incorrectos.");
        }
    }

    // Método main para probar la interfaz
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicioSesion(controladorInicioSesion);
            }
        });
    }
}