package vista;

import javax.swing.*;

public class VentanaPrincipal {
    private JFrame ventana;

    public VentanaPrincipal() {
        ventana = new JFrame("MyHotel - Menú Principal");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        ventana.getContentPane().add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Se utiliza BoxLayout en el eje Y

        JLabel tituloLabel = new JLabel("Menú Principal");
        tituloLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT); // Centrar el título horizontalmente
        panel.add(tituloLabel);

        JButton buscarHabitacionesButton = new JButton("Buscar Habitaciones");
        buscarHabitacionesButton.setAlignmentX(JButton.CENTER_ALIGNMENT); // Centrar el botón horizontalmente
        panel.add(buscarHabitacionesButton);

        JButton realizarReservaButton = new JButton("Realizar Reserva");
        realizarReservaButton.setAlignmentX(JButton.CENTER_ALIGNMENT); // Centrar el botón horizontalmente
        panel.add(realizarReservaButton);

        // Añade más opciones para el usuario aquí

        buscarHabitacionesButton.addActionListener(e -> {
            // Lógica para abrir la ventana de búsqueda de habitaciones
            VentanaBuscarHabitaciones ventanaBuscar = new VentanaBuscarHabitaciones();
            ventanaBuscar.mostrar();
        });

        realizarReservaButton.addActionListener(e -> {
            // Lógica para abrir la ventana de realizar reserva
            VentanaRealizarReserva ventanaReserva = new VentanaRealizarReserva();
            ventanaReserva.mostrar();
        });
    }

    public void mostrar() {
        ventana.setVisible(true);
    }
}
