package Vista;

import javax.swing.*;
import Controlador.ReservaControlador;

public class RealizarReservaVista extends JFrame {
    private JTextField txtNombre, txtFechaLlegada, txtFechaSalida, txtNumeroHuespedes;
    private JButton btnReservar, btnVolver;

    public RealizarReservaVista() {
        setTitle("Realizar Reserva");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(10, 30, 150, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(150, 30, 200, 25);
        add(txtNombre);

        JLabel lblFechaLlegada = new JLabel("Fecha de Llegada:");
        lblFechaLlegada.setBounds(10, 70, 150, 25);
        add(lblFechaLlegada);

        txtFechaLlegada = new JTextField();
        txtFechaLlegada.setBounds(150, 70, 200, 25);
        add(txtFechaLlegada);

        JLabel lblFechaSalida = new JLabel("Fecha de Salida:");
        lblFechaSalida.setBounds(10, 110, 150, 25);
        add(lblFechaSalida);

        txtFechaSalida = new JTextField();
        txtFechaSalida.setBounds(150, 110, 200, 25);
        add(txtFechaSalida);

        JLabel lblNumeroHuespedes = new JLabel("Número de Huéspedes:");
        lblNumeroHuespedes.setBounds(10, 150, 150, 25);
        add(lblNumeroHuespedes);

        txtNumeroHuespedes = new JTextField();
        txtNumeroHuespedes.setBounds(150, 150, 200, 25);
        add(txtNumeroHuespedes);

        btnReservar = new JButton("Reservar");
        btnReservar.setBounds(50, 200, 100, 30);
        add(btnReservar);

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(200, 200, 100, 30);
        add(btnVolver);

        btnReservar.addActionListener(e -> {
            String nombre = txtNombre.getText();
            String fechaLlegada = txtFechaLlegada.getText();
            String fechaSalida = txtFechaSalida.getText();
            int numeroHuespedes = Integer.parseInt(txtNumeroHuespedes.getText());

            ReservaControlador.realizarReserva(nombre, fechaLlegada, fechaSalida, numeroHuespedes);
            JOptionPane.showMessageDialog(null, "Reserva realizada con éxito");
        });

        btnVolver.addActionListener(e -> {
            new PrincipalVista().setVisible(true);
            dispose();
        });
    }
}
