package Vista;

import javax.swing.*;
import Modelo.Habitacion;

public class DetallesHabitacionVista extends JFrame {
    public DetallesHabitacionVista(Habitacion habitacion) {
        setTitle("Detalles de Habitación");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblTipo = new JLabel("Tipo de Habitación: " + habitacion.getTipo());
        lblTipo.setBounds(10, 30, 300, 25);
        add(lblTipo);

        JLabel lblCapacidad = new JLabel("Capacidad: " + habitacion.getCapacidad());
        lblCapacidad.setBounds(10, 70, 300, 25);
        add(lblCapacidad);

        JLabel lblPrecio = new JLabel("Precio por Noche: " + habitacion.getPrecioPorNoche());
        lblPrecio.setBounds(10, 110, 300, 25);
        add(lblPrecio);

        JLabel lblComodidades = new JLabel("Comodidades: " + habitacion.getComodidades());
        lblComodidades.setBounds(10, 150, 300, 25);
        add(lblComodidades);

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(150, 200, 100, 30);
        add(btnVolver);

        btnVolver.addActionListener(e -> {
            new BuscarHabitacionesVista().setVisible(true);
            dispose();
        });
    }
}
