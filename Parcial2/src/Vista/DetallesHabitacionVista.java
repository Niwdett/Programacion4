package Vista;

import javax.swing.*;

import Controlador.ControladorRegistro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistro extends JFrame {
    private ControladorRegistro controladorRegistro;

    public VentanaRegistro(ControladorRegistro controladorRegistro) {
        this.controladorRegistro = controladorRegistro;
        componentesRegistro();
    }

    private JTextField txtTipoIdentificacion, txtDocumentoIdentificacion, txtNombre, txtApellido,
                txtCorreo, txtDireccionResidencia, txtCiudadResidencia, txtTelefono, txtContrasena,
                txtConfirmarContrasena;

    public void componentesRegistro() {
        setTitle("Registro de Usuario");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        // Crear paneles
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(13, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Crear campos de texto para el registro
        txtTipoIdentificacion = new JTextField(20);
        txtDocumentoIdentificacion = new JTextField(20);
        txtNombre = new JTextField(20);
        txtApellido = new JTextField(20);
        txtCorreo = new JTextField(20);
        txtDireccionResidencia = new JTextField(20);
        txtCiudadResidencia = new JTextField(20);
        txtTelefono = new JTextField(20);
        txtContrasena = new JPasswordField(20);
        txtConfirmarContrasena = new JPasswordField(20);

        // Agregar campos de texto al panel principal
        mainPanel.add(new JLabel("Tipo de Identificación:"));
        mainPanel.add(txtTipoIdentificacion);
        mainPanel.add(new JLabel("Documento de Identificación:"));
        mainPanel.add(txtDocumentoIdentificacion);
        mainPanel.add(new JLabel("Nombre:"));
        mainPanel.add(txtNombre);
        mainPanel.add(new JLabel("Apellido:"));
        mainPanel.add(txtApellido);
        mainPanel.add(new JLabel("Correo:"));
        mainPanel.add(txtCorreo);
        mainPanel.add(new JLabel("Dirección de Residencia:"));
        mainPanel.add(txtDireccionResidencia);
        mainPanel.add(new JLabel("Ciudad de Residencia:"));
        mainPanel.add(txtCiudadResidencia);
        mainPanel.add(new JLabel("Teléfono:"));
        mainPanel.add(txtTelefono);
        mainPanel.add(new JLabel("Contraseña:"));
        mainPanel.add(txtContrasena);
        mainPanel.add(new JLabel("Confirmar Contraseña:"));
        mainPanel.add(txtConfirmarContrasena);

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
        String tipoIdentificacion = txtTipoIdentificacion.getText();
        String documentoIdentificacion = txtDocumentoIdentificacion.getText();
        String nombres = txtNombre.getText();
        String apellidos = txtApellido.getText();
        String correoElectronico = txtCorreo.getText();
        String direccionResidencia = txtDireccionResidencia.getText();
        String ciudadResidencia = txtCiudadResidencia.getText();
        String telefonoContacto = txtTelefono.getText();
        String contraseña = new String(((JPasswordField) txtContrasena).getPassword());
        String confirmarContraseña = new String(((JPasswordField) txtConfirmarContrasena).getPassword());

        // Validar que las contraseñas coincidan
        if (!contraseña.equals(confirmarContraseña)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden. Por favor, inténtelo de nuevo.");
            return;
        }

        // Llamar al controlador para registrar al usuario
        controladorRegistro.registrarUsuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos,
                correoElectronico, direccionResidencia, ciudadResidencia, telefonoContacto, contraseña);

        // Mostrar un mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Usuario registrado satisfactoriamente");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Crear una instancia del controlador
                ControladorRegistro controladorRegistro = new ControladorRegistro(null);

                // Crear una instancia de la ventana de registro y pasar el controlador como parámetro
                new VentanaRegistro(controladorRegistro);
            }
        });
    }
}
