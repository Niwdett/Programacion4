package vista;

import javax.swing.*;
import controlador.ControladorRegistro;

public class VentanaRegistro {
    private JFrame ventana;
    private JTextField tipoIdentificacionField;
    private JTextField documentoIdentificacionField;
    private JTextField nombresField;
    private JTextField apellidosField;
    private JTextField correoElectronicoField;
    private JTextField direccionResidenciaField;
    private JTextField ciudadResidenciaField;
    private JTextField telefonoContactoField;
    private JPasswordField contraseñaField;
    private JPasswordField confirmarContraseñaField;

    public VentanaRegistro() {
        ventana = new JFrame("Registro de usuario");
        ventana.setSize(400, 500);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        ventana.getContentPane().add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Se utiliza BoxLayout en el eje Y

        // Añade aquí la creación y configuración de los componentes de la interfaz gráfica

        JButton registrarButton = new JButton("Registrar");
        registrarButton.setAlignmentX(JButton.CENTER_ALIGNMENT); // Centrar el botón horizontalmente
        panel.add(registrarButton);

        registrarButton.addActionListener(e -> {
            // Obtener los datos del formulario
            String tipoIdentificacion = tipoIdentificacionField.getText();
            String documentoIdentificacion = documentoIdentificacionField.getText();
            String nombres = nombresField.getText();
            String apellidos = apellidosField.getText();
            String correoElectronico = correoElectronicoField.getText();
            String direccionResidencia = direccionResidenciaField.getText();
            String ciudadResidencia = ciudadResidenciaField.getText();
            String telefonoContacto = telefonoContactoField.getText();
            String contraseña = new String(contraseñaField.getPassword());
            String confirmarContraseña = new String(confirmarContraseñaField.getPassword());

            // Validar que las contraseñas coincidan
            if (!contraseña.equals(confirmarContraseña)) {
                JOptionPane.showMessageDialog(ventana, "Las contraseñas no coinciden. Por favor, inténtelo de nuevo.");
                return;
            }

            // Llamar al controlador para registrar al usuario
            ControladorRegistro.registrarUsuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos,
                    correoElectronico, direccionResidencia, ciudadResidencia, telefonoContacto, contraseña);

            // Mostrar un mensaje de confirmación
            JOptionPane.showMessageDialog(ventana, "Usuario registrado satisfactoriamente");
        });
    }

    public void mostrar() {
        ventana.setVisible(true);
    }
}
