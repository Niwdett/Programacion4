package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal(JFrame parent) {
        inicializarVentana();
        inicializarComponentes();
    }

    private void inicializarVentana() {
        setTitle("Bienvenido - My Hotel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 200);
        setResizable(false);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true);
    }

    private void inicializarComponentes() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); // Usar un BoxLayout vertical

        JLabel tituloLabel = new JLabel("Bienvenido a My Hotel");
        tituloLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar horizontalmente
        tituloLabel.setFont(new Font("Arial", Font.PLAIN, 24)); // Cambiar la fuente

        mainPanel.add(tituloLabel);

        getContentPane().add(mainPanel);

        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));

        JButton reservasButton = new JButton("RESERVAS");
        JButton habitacionButton = new JButton("HABITACIONES");
        JButton usuariosButton = new JButton("USUARIOS");

        reservasButton.setPreferredSize(new Dimension(130, 40));
        habitacionButton.setPreferredSize(new Dimension(130, 40));
        usuariosButton.setPreferredSize(new Dimension(130, 40));

        botonesPanel.add(reservasButton);
        botonesPanel.add(habitacionButton);
        botonesPanel.add(usuariosButton);

        mainPanel.add(botonesPanel);

        reservasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí se muestra la ventana de reservas
                new VerReservas();
            }
        });

        habitacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí se muestra la ventana de habitaciones
                new Habitaciones();
            }
        });

        usuariosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí se muestra la ventana de usuarios
                new UsuarioInterfaz();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null);
            }
        });
    }
}
