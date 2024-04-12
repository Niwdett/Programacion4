import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ProyectoFinal extends JFrame {
    private static ArrayList<String[]> usuarios = new ArrayList<>();
    private static final int MAX_INTENTOS = 3;

    private static final int TIPO_IDENTIFICACION = 0;
    private static final int DOCUMENTO_IDENTIFICACION = 1;
    private static final int NOMBRES = 2;
    private static final int APELLIDOS = 3;
    private static final int CORREO_ELECTRONICO = 4;
    private static final int DIRECCION_RESIDENCIA = 5;
    private static final int CIUDAD_RESIDENCIA = 6;
    private static final int TELEFONO_CONTACTO = 7;
    private static final int CONTRASEÑA = 8;
    private static final int CONFIRMAR_CONTRASEÑA = 9;

    public ProyectoFinal() {
        super("MyHotel");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        JButton loginButton = new JButton("Iniciar sesión");
        loginButton.setBounds(50, 30, 150, 30);
        panel.add(loginButton);

        JButton registerButton = new JButton("Registrar usuario");
        registerButton.setBounds(50, 80, 150, 30);
        panel.add(registerButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarInterfazLogin();
            }
        });

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarInterfazRegistro();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ProyectoFinal().setVisible(true);
            }
        });
    }

    public static void mostrarInterfazLogin() {
        JFrame loginFrame = new JFrame("Inicio de sesión");
        loginFrame.setSize(300, 200);
        loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        loginFrame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel correoLabel = new JLabel("Correo electrónico:");
        correoLabel.setBounds(10, 20, 120, 20);
        panel.add(correoLabel);

        JTextField correoField = new JTextField(20);
        correoField.setBounds(130, 20, 150, 20);
        panel.add(correoField);

        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setBounds(10, 50, 120, 20);
        panel.add(contraseñaLabel);

        JPasswordField contraseñaField = new JPasswordField(20);
        contraseñaField.setBounds(130, 50, 150, 20);
        panel.add(contraseñaField);

        JButton loginButton = new JButton("Iniciar sesión");
        loginButton.setBounds(100, 90, 120, 30);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String correo = correoField.getText();
                String contraseña = new String(contraseñaField.getPassword());
                iniciarSesion(correo, contraseña);
                loginFrame.dispose();
            }
        });

        loginFrame.setVisible(true);
    }


    public static void mostrarInterfazRegistro() {
        JFrame registroFrame = new JFrame("Registro de usuario");
        registroFrame.setSize(400, 500);
        registroFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        registroFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        registroFrame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel tipoIdentificacionLabel = new JLabel("Tipo de identificación:");
        tipoIdentificacionLabel.setBounds(10, 20, 150, 20);
        panel.add(tipoIdentificacionLabel);

        JTextField tipoIdentificacionField = new JTextField(20);
        tipoIdentificacionField.setBounds(170, 20, 200, 20);
        panel.add(tipoIdentificacionField);

        JLabel documentoIdentificacionLabel = new JLabel("Documento de identificación:");
        documentoIdentificacionLabel.setBounds(10, 50, 150, 20);
        panel.add(documentoIdentificacionLabel);

        JTextField documentoIdentificacionField = new JTextField(20);
        documentoIdentificacionField.setBounds(170, 50, 200, 20);
        panel.add(documentoIdentificacionField);

        JLabel nombresLabel = new JLabel("Nombres:");
        nombresLabel.setBounds(10, 80, 150, 20);
        panel.add(nombresLabel);

        JTextField nombresField = new JTextField(20);
        nombresField.setBounds(170, 80, 200, 20);
        panel.add(nombresField);

        JLabel apellidosLabel = new JLabel("Apellidos:");
        apellidosLabel.setBounds(10, 110, 150, 20);
        panel.add(apellidosLabel);

        JTextField apellidosField = new JTextField(20);
        apellidosField.setBounds(170, 110, 200, 20);
        panel.add(apellidosField);

        JLabel correoElectronicoLabel = new JLabel("Correo electrónico:");
        correoElectronicoLabel.setBounds(10, 140, 150, 20);
        panel.add(correoElectronicoLabel);

        JTextField correoElectronicoField = new JTextField(20);
        correoElectronicoField.setBounds(170, 140, 200, 20);
        panel.add(correoElectronicoField);

        JLabel direccionResidenciaLabel = new JLabel("Dirección de residencia:");
        direccionResidenciaLabel.setBounds(10, 170, 150, 20);
        panel.add(direccionResidenciaLabel);

        JTextField direccionResidenciaField = new JTextField(20);
        direccionResidenciaField.setBounds(170, 170, 200, 20);
        panel.add(direccionResidenciaField);

        JLabel ciudadResidenciaLabel = new JLabel("Ciudad de residencia:");
        ciudadResidenciaLabel.setBounds(10, 200, 150, 20);
        panel.add(ciudadResidenciaLabel);

        JTextField ciudadResidenciaField = new JTextField(20);
        ciudadResidenciaField.setBounds(170, 200, 200, 20);
        panel.add(ciudadResidenciaField);

        JLabel telefonoContactoLabel = new JLabel("Teléfono de contacto:");
        telefonoContactoLabel.setBounds(10, 230, 150, 20);
        panel.add(telefonoContactoLabel);

        JTextField telefonoContactoField = new JTextField(20);
        telefonoContactoField.setBounds(170, 230, 200, 20);
        panel.add(telefonoContactoField);

        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setBounds(10, 260, 150, 20);
        panel.add(contraseñaLabel);

        JPasswordField contraseñaField = new JPasswordField(20);
        contraseñaField.setBounds(170, 260, 200, 20);
        panel.add(contraseñaField);

        JLabel confirmarContraseñaLabel = new JLabel("Confirmar Contraseña:");
        confirmarContraseñaLabel.setBounds(10, 290, 150, 20);
        panel.add(confirmarContraseñaLabel);

        JPasswordField confirmarContraseñaField = new JPasswordField(20);
        confirmarContraseñaField.setBounds(170, 290, 200, 20);
        panel.add(confirmarContraseñaField);

        JButton registrarButton = new JButton("Registrar");
        registrarButton.setBounds(150, 330, 100, 30);
        panel.add(registrarButton);

        registrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tipoIdentificacion = tipoIdentificacionField.getText();
                String documentoIdentificacion = documentoIdentificacionField.getText();
                String nombres = nombresField.getText();
                String apellidos = apellidosField.getText();
                String correoElectronico = correoElectronicoField.getText();
                String direccionResidencia = direccionResidenciaField.getText();
                String ciudadResidencia = ciudadResidenciaField.getText();
                String telefonoContacto = telefonoContactoField.getText();
                String contraseña = new String(contraseñaField.getPassword());

                int intentos = 0;
                String confirmarContraseña;
                do {
                    if (intentos > 0) {
                        JOptionPane.showMessageDialog(registroFrame, "Las contraseñas no coinciden. Por favor, inténtelo de nuevo.");
                    }
                    confirmarContraseña = new String(confirmarContraseñaField.getPassword());
                    intentos++;
                    if (intentos >= MAX_INTENTOS) {
                        JOptionPane.showMessageDialog(registroFrame, "Intentos límite superados. Volviendo al menú principal.");
                        registroFrame.dispose();
                        return;
                    }
                } while (!contraseña.equals(confirmarContraseña));

                registrarUsuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos,
                        correoElectronico, direccionResidencia, ciudadResidencia, telefonoContacto,
                        contraseña);
                JOptionPane.showMessageDialog(registroFrame, "Usuario registrado satisfactoriamente");
                registroFrame.dispose();
            }
        });

        registroFrame.setVisible(true);
    }
    public static void iniciarSesion(String correo, String contraseña) {
        boolean usuarioEncontrado = false;
        for (String[] usuario : usuarios) {
            if (usuario[CORREO_ELECTRONICO].equals(correo) && usuario[CONTRASEÑA].equals(contraseña)) {
                usuarioEncontrado = true;
                break;
            }
        }

        if (usuarioEncontrado) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. Bienvenido a MyHotel.");
        } else {
            JOptionPane.showMessageDialog(null, "Error: Correo electrónico o contraseña incorrectos.");
        }
    }

    public static void registrarUsuario(String tipoIdentificacion, String documentoIdentificacion,
                                        String nombres, String apellidos, String correoElectronico,
                                        String direccionResidencia, String ciudadResidencia,
                                        String telefonoContacto, String contraseña) {
        String[] usuario = {tipoIdentificacion, documentoIdentificacion, nombres, apellidos,
                correoElectronico, direccionResidencia, ciudadResidencia,
                telefonoContacto, contraseña};
        usuarios.add(usuario);
    }
}
