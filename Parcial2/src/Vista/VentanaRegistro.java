package Vista;

import javax.swing.*;

import Controlador.ControladorRegistro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistro extends JFrame {

    private JTextField tipoIdentificacionField, documentoIdentificacionField, nombresField, apellidosField,
            correoElectronicoField, direccionResidenciaField, ciudadResidenciaField, telefonoContactoField,
            contraseñaField, confirmarContraseñaField;

    public VentanaRegistro() {
        setTitle("Registro de Usuario");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        // Crear paneles
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(13, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Crear campos de texto para el registro
        tipoIdentificacionField = new JTextField(20);
        documentoIdentificacionField = new JTextField(20);
        nombresField = new JTextField(20);
        apellidosField = new JTextField(20);
        correoElectronicoField = new JTextField(20);
        direccionResidenciaField = new JTextField(20);
        ciudadResidenciaField = new JTextField(20);
        telefonoContactoField = new JTextField(20);
        contraseñaField = new JPasswordField(20);
        confirmarContraseñaField = new JPasswordField(20);

        // Agregar campos de texto al panel principal
        mainPanel.add(new JLabel("Tipo de Identificación:"));
        mainPanel.add(tipoIdentificacionField);
        mainPanel.add(new JLabel("Documento de Identificación:"));
        mainPanel.add(documentoIdentificacionField);
        mainPanel.add(new JLabel("Nombre:"));
        mainPanel.add(nombresField);
        mainPanel.add(new JLabel("Apellido:"));
        mainPanel.add(apellidosField);
        mainPanel.add(new JLabel("Correo:"));
        mainPanel.add(correoElectronicoField);
        mainPanel.add(new JLabel("Dirección de Residencia:"));
        mainPanel.add(direccionResidenciaField);
        mainPanel.add(new JLabel("Ciudad de Residencia:"));
        mainPanel.add(ciudadResidenciaField);
        mainPanel.add(new JLabel("Teléfono:"));
        mainPanel.add(telefonoContactoField);
        mainPanel.add(new JLabel("Contraseña:"));
        mainPanel.add(contraseñaField);
        mainPanel.add(new JLabel("Confirmar Contraseña:"));
        mainPanel.add(confirmarContraseñaField);

        // Agregar botón de registro
        JButton btnRegistrarUsuario = new JButton("Registrar Usuario");
        btnRegistrarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarUsuario();
            }
        });
        mainPanel.add(btnRegistrarUsuario);

        // Agregar panel principal al JFrame
        add(mainPanel);

        pack(); // Ajustar el tamaño del JFrame
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true);
    }

    private void registrarUsuario() {
        // Obtener los datos del formulario
        String tipoIdentificacion = tipoIdentificacionField.getText();
        String documentoIdentificacion = documentoIdentificacionField.getText();
        String nombres = nombresField.getText();
        String apellidos = apellidosField.getText();
        String correoElectronico = correoElectronicoField.getText();
        String direccionResidencia = direccionResidenciaField.getText();
        String ciudadResidencia = ciudadResidenciaField.getText();
        String telefonoContacto = telefonoContactoField.getText();
        String contraseña = new String(((JPasswordField) contraseñaField).getPassword());
        String confirmarContraseña = new String(((JPasswordField) confirmarContraseñaField).getPassword());

        // Validar que las contraseñas coincidan
        if (!contraseña.equals(confirmarContraseña)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden. Por favor, inténtelo de nuevo.");
            return;
        }

        // Llamar al controlador para registrar al usuario
        ControladorRegistro.registrarUsuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos,
                correoElectronico, direccionResidencia, ciudadResidencia, telefonoContacto, contraseña);

        // Mostrar un mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Usuario registrado satisfactoriamente");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistro();
            }
        });
    }

    public void mostrar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }

}
