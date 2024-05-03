package Vista;

import javax.swing.*;

public class VentanaPrincipal {
    private JFrame ventana;

    public VentanaPrincipal() {
        inicializarVentana();
        inicializarComponentes();
    }

    private void inicializarVentana() {
        ventana = new JFrame("MyHotel - Menú Principal");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
    }

    private void inicializarComponentes() {
        JPanel panel = new JPanel();
        ventana.getContentPane().add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Se utiliza BoxLayout en el eje Y

        JLabel tituloLabel = new JLabel("Menú Principal");
        tituloLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT); // Centrar el título horizontalmente
        panel.add(tituloLabel);

        JButton registrarUsuarioButton = new JButton("Registrar Usuario");
        configurarBoton(registrarUsuarioButton);
        panel.add(registrarUsuarioButton);

        JButton iniciarSesionButton = new JButton("Iniciar Sesión");
        configurarBoton(iniciarSesionButton);
        panel.add(iniciarSesionButton);
    }

    private void configurarBoton(JButton boton) {
        boton.setAlignmentX(JButton.CENTER_ALIGNMENT); // Centrar el botón horizontalmente
        boton.addActionListener(e -> realizarAccion(boton.getText()));
    }

    private void realizarAccion(String accion) {
        switch (accion) {
            case "Registrar Usuario":
                // Aquí implementarías la lógica para mostrar la ventana de registro de usuario
                JOptionPane.showMessageDialog(ventana, "Mostrar ventana de registro de usuario");
                break;
            case "Iniciar Sesión":
                // Aquí implementarías la lógica para mostrar la ventana de inicio de sesión
                JOptionPane.showMessageDialog(ventana, "Mostrar ventana de inicio de sesión");
                break;
        }
    }

    public void mostrar() {
        ventana.setVisible(true);
    }
}
