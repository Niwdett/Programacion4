package Vista;

import javax.swing.*;
import Controlador.HabitacionControlador;
import Modelo.Habitacion;

import java.util.List;

public class EliminarHabitacionVista extends JFrame {
    private JComboBox<Habitacion> comboHabitaciones;
    private JButton btnEliminar, btnVolver;

    public EliminarHabitacionVista() {
        setTitle("Eliminar Habitación");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblHabitacion = new JLabel("Seleccionar Habitación:");
        lblHabitacion.setBounds(10, 30, 150, 25);
        add(lblHabitacion);

        comboHabitaciones = new JComboBox<>();
        comboHabitaciones.setBounds(150, 30, 200, 25);
        add(comboHabitaciones);

        List<Habitacion> habitaciones = HabitacionControlador.obtenerHabitaciones();
        for (Habitacion habitacion : habitaciones) {
            comboHabitaciones.addItem(habitacion);
        }

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(50, 100, 100, 30);
        add(btnEliminar);

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(200, 100, 100, 30);
        add(btnVolver);

        btnEliminar.addActionListener(e -> {
            Habitacion habitacion = (Habitacion) comboHabitaciones.getSelectedItem();
            HabitacionControlador.eliminarHabitacion(habitacion);
            JOptionPane.showMessageDialog(null, "Habitación eliminada con éxito");
        });

        btnVolver.addActionListener(e -> {
            new AdministrarHabitacionesVista().setVisible(true);
            dispose();
        });
    }
}
