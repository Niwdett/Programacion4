package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controlador.UsuarioControlador;

public class RegistroVista extends JFrame {
    private JTextField txtTipoIdentificacion, txtDocumentoIdentificacion, txtNombres, txtApellidos, txtCorreoElectronico, txtDireccionResidencia, txtCiudadResidencia, txtTelefonoContacto;
    private JPasswordField txtContraseña, txtConfirmarContraseña;
    private JButton btnRegistrar;

    public RegistroVista() {
        setTitle("Registro de Usuario");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblTipoIdentificacion = new JLabel("Tipo de Identificación:");
        lblTipoIdentificacion.setBounds(10, 10, 150, 25);
        add(lblTipoIdentificacion);

        txtTipoIdentificacion = new JTextField();
        txtTipoIdentificacion.setBounds(160, 10, 200, 25);
        add(txtTipoIdentificacion);

        JLabel lblDocumentoIdentificacion = new JLabel("Documento de Identificación:");
        lblDocumentoIdentificacion.setBounds(10, 40, 200, 25);
        add(lblDocumentoIdentificacion);

        txtDocumentoIdentificacion = new JTextField();
        txtDocumentoIdentificacion.setBounds(210, 40, 150, 25);
        add(txtDocumentoIdentificacion);

        JLabel lblNombres = new JLabel("Nombres:");
        lblNombres.setBounds(10, 70, 150, 25);
        add(lblNombres);

        txtNombres = new JTextField();
        txtNombres.setBounds(160, 70, 200, 25);
        add(txtNombres);

        JLabel lblApellidos = new JLabel("Apellidos:");
        lblApellidos.setBounds(10, 100, 150, 25);
        add(lblApellidos);

        txtApellidos = new JTextField();
        txtApellidos.setBounds(160, 100, 200, 25);
        add(txtApellidos);

        JLabel lblCorreoElectronico = new JLabel("Correo Electrónico:");
        lblCorreoElectronico.setBounds(10, 130, 150, 25);
        add(lblCorreoElectronico);

        txtCorreoElectronico = new JTextField();
        txtCorreoElectronico.setBounds(160, 130, 200, 25);
        add(txtCorreoElectronico);

        JLabel lblDireccionResidencia = new JLabel("Dirección de Residencia:");
        lblDireccionResidencia.setBounds(10, 160, 150, 25);
        add(lblDireccionResidencia);

        txtDireccionResidencia = new JTextField();
        txtDireccionResidencia.setBounds(160, 160, 200, 25);
        add(txtDireccionResidencia);

        JLabel lblCiudadResidencia = new JLabel("Ciudad de Residencia:");
        lblCiudadResidencia.setBounds(10, 190, 150, 25);
        add(lblCiudadResidencia);

        txtCiudadResidencia = new JTextField();
        txtCiudadResidencia.setBounds(160, 190, 200, 25);
        add(txtCiudadResidencia);

        JLabel lblTelefonoContacto = new JLabel("Teléfono de Contacto:");
        lblTelefonoContacto.setBounds(10, 220, 150, 25);
        add(lblTelefonoContacto);

        txtTelefonoContacto = new JTextField();
        txtTelefonoContacto.setBounds(160, 220, 200, 25);
        add(txtTelefonoContacto);

        JLabel lblContraseña = new JLabel("Contraseña:");
        lblContraseña.setBounds(10, 250, 150, 25);
        add(lblContraseña);

        txtContraseña = new JPasswordField();
        txtContraseña.setBounds(160, 250, 200, 25);
        add(txtContraseña);

        JLabel lblConfirmarContraseña = new JLabel("Confirmar Contraseña:");
        lblConfirmarContraseña.setBounds(10, 280, 150, 25);
        add(lblConfirmarContraseña);

        txtConfirmarContraseña = new JPasswordField();
        txtConfirmarContraseña.setBounds(160, 280, 200, 25);
        add(txtConfirmarContraseña);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(150, 320, 100, 30);
        add(btnRegistrar);

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoIdentificacion = txtTipoIdentificacion.getText();
                String documentoIdentificacion = txtDocumentoIdentificacion.getText();
                String nombres = txtNombres.getText();
                String apellidos = txtApellidos.getText();
                String correoElectronico = txtCorreoElectronico.getText();
                String direccionResidencia = txtDireccionResidencia.getText();
                String ciudadResidencia = txtCiudadResidencia.getText();
                String telefonoContacto = txtTelefonoContacto.getText();
                String contraseña = new String(txtContraseña.getPassword());
                String confirmarContraseña = new String(txtConfirmarContraseña.getPassword());

                if (contraseña.equals(confirmarContraseña)) {
                    UsuarioControlador.registrarUsuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos, correoElectronico, direccionResidencia, ciudadResidencia, telefonoContacto, contraseña);
                    JOptionPane.showMessageDialog(null, "Usuario registrado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                }
            }
        });
    }
}
