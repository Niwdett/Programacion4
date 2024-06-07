package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controlador.HabitacionControlador;

public class BuscarHabitacionesVista extends JFrame {
    private JTextField txtFechaEntrada, txtFechaSalida, txtNumeroHuespedes, txtTipoHabitacion;
    private JButton btnBuscar, btnVolver;

    public BuscarHabitacionesVista() {
        setTitle("Buscar Habitaciones");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblFechaEntrada = new JLabel("Fecha de Entrada:");
        lblFechaEntrada.setBounds(10, 30, 150, 25);
        add(lblFechaEntrada);

        txtFechaEntrada = new JTextField();
        txtFechaEntrada.setBounds(150, 30, 200, 25);
        add(txtFechaEntrada);

        JLabel lblFechaSalida = new JLabel("Fecha de Salida:");
        lblFechaSalida.setBounds(10, 70, 150, 25);
        add(lblFechaSalida);

        txtFechaSalida = new JTextField();
        txtFechaSalida.setBounds(150, 70, 200, 25);
        add(txtFechaSalida);

        JLabel lblNumeroHuespedes = new JLabel("Número de Huéspedes:");
        lblNumeroHuespedes.setBounds(10, 110, 150, 25);
        add(lblNumeroHuespedes);

        txtNumeroHuespedes = new JTextField();
        txtNumeroHuespedes.setBounds(150, 110, 200, 25);
        add(txtNumeroHuespedes);

        JLabel lblTipoHabitacion = new JLabel("Tipo de Habitación:");
        lblTipoHabitacion.setBounds(10, 150, 150, 25);
        add(lblTipoHabitacion);

        txtTipoHabitacion = new JTextField();
        txtTipoHabitacion.setBounds(150, 150, 200, 25);
        add(txtTipoHabitacion);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(50, 200, 100, 30);
        add(btnBuscar);

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(200, 200, 100, 30);
        add(btnVolver);

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fechaEntrada = txtFechaEntrada.getText();
                String fechaSalida = txtFechaSalida.getText();
                int numeroHuespedes = Integer.parseInt(txtNumeroHuespedes.getText());
                String tipoHabitacion = txtTipoHabitacion.getText();

                HabitacionControlador.buscarHabitaciones(fechaEntrada, fechaSalida, numeroHuespedes, tipoHabitacion);
            }
        });

        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PrincipalVista().setVisible(true);
                dispose();
            }
        });
    }
}
