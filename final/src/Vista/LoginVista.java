package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controlador.UsuarioControlador;

public class LoginVista extends JFrame {
    private JTextField txtCorreoElectronico;
    private JPasswordField txtContraseña;
    private JButton btnLogin;

    public LoginVista() {
        setTitle("Inicio de Sesión");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblCorreoElectronico = new JLabel("Correo Electrónico:");
        lblCorreoElectronico.setBounds(10, 30, 150, 25);
        add(lblCorreoElectronico);

        txtCorreoElectronico = new JTextField();
        txtCorreoElectronico.setBounds(150, 30, 130, 25);
        add(txtCorreoElectronico);

        JLabel lblContraseña = new JLabel("Contraseña:");
        lblContraseña.setBounds(10, 70, 150, 25);
        add(lblContraseña);

        txtContraseña = new JPasswordField();
        txtContraseña.setBounds(150, 70, 130, 25);
        add(txtContraseña);

        btnLogin = new JButton("Iniciar Sesión");
        btnLogin.setBounds(80, 110, 120, 30);
        add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String correoElectronico = txtCorreoElectronico.getText();
                String contraseña = new String(txtContraseña.getPassword());

                if (UsuarioControlador.validarCredenciales(correoElectronico, contraseña)) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
                    // Redirigir al menú principal
                    new PrincipalVista().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                }
            }
        });
    }
}
