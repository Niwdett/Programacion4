package Vista;

import javax.swing.*;

public class PrincipalVista extends JFrame {
    private JButton btnBuscarHabitaciones, btnHistorialReservas, btnAdministrarHabitaciones, btnSalir;

    public PrincipalVista() {
        setTitle("Menú Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        btnBuscarHabitaciones = new JButton("Buscar Habitaciones");
        btnBuscarHabitaciones.setBounds(100, 30, 200, 30);
        add(btnBuscarHabitaciones);

        btnHistorialReservas = new JButton("Historial de Reservas");
        btnHistorialReservas.setBounds(100, 70, 200, 30);
        add(btnHistorialReservas);

        btnAdministrarHabitaciones = new JButton("Administrar Habitaciones");
        btnAdministrarHabitaciones.setBounds(100, 110, 200, 30);
        add(btnAdministrarHabitaciones);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(100, 150, 200, 30);
        add(btnSalir);

        btnBuscarHabitaciones.addActionListener(e -> {
            new BuscarHabitacionesVista().setVisible(true);
            dispose();
        });

        btnHistorialReservas.addActionListener(e -> {
            new HistorialReservasVista().setVisible(true);
            dispose();
        });

        btnAdministrarHabitaciones.addActionListener(e -> {
            new AdministrarHabitacionesVista().setVisible(true);
            dispose();
        });

        btnSalir.addActionListener(e -> System.exit(0));
    }
}
