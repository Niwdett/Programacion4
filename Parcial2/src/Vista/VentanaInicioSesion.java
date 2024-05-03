package vista;

import javax.swing.*;
import controlador.ControladorInicioSesion;

public class VentanaInicioSesion {
    private JFrame ventana;
    private JTextField correoField;
    private JPasswordField contraseñaField;

    public VentanaInicioSesion() {
        ventana = new JFrame("Inicio de sesión");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        ventana.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel correoLabel = new JLabel("Correo electrónico:");
        correoLabel.setBounds(10, 20, 120, 20);
        panel.add(correoLabel);

        correoField = new JTextField();
        correoField.setBounds(130, 20, 150, 20);
        panel.add(correoField);

        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setBounds(10, 50, 120, 20);
        panel.add(contraseñaLabel);

        contraseñaField = new JPasswordField();
        contraseñaField.setBounds(130, 50, 150, 20);
        panel.add(contraseñaField);

        JButton loginButton = new JButton("Iniciar sesión");
        loginButton.setBounds(100, 90, 120, 30);
        panel.add(loginButton);

        loginButton.addActionListener(e -> {
            String correo = correoField.getText();
            String contraseña = new String(contraseñaField.getPassword());

            // Validación de campos vacíos
            if (correo.isEmpty() || contraseña.isEmpty()) {
                JOptionPane.showMessageDialog(ventana, "Por favor, complete todos los campos.");
            } else {
                ControladorInicioSesion.iniciarSesion(correo, contraseña);
            }
        });
    }

    public void mostrar() {
        ventana.setVisible(true);
    }
}
