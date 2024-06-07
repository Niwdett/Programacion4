package Vista;

import javax.swing.*;
import Controlador.ReservaControlador;
import Modelo.Reserva;

public class ModificarReservaVista extends JFrame {
    private JTextField txtFechaLlegada, txtFechaSalida, txtNumeroHuespedes;
    private JButton btnModificar, btnVolver;
    public ModificarReservaVista(Reserva reserva) {
        setTitle("Modificar Reserva");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblFechaLlegada = new JLabel("Fecha de Llegada:");
        lblFechaLlegada.setBounds(10, 30, 150, 25);
        add(lblFechaLlegada);

        txtFechaLlegada = new JTextField(reserva.getFechaLlegada());
        txtFechaLlegada.setBounds(150, 30, 200, 25);
        add(txtFechaLlegada);

        JLabel lblFechaSalida = new JLabel("Fecha de Salida:");
        lblFechaSalida.setBounds(10, 70, 150, 25);
        add(lblFechaSalida);

        txtFechaSalida = new JTextField();
        txtFechaSalida.setBounds(150, 70, 200, 25);
        add(txtFechaSalida);

        JLabel lblNumeroHuespedes = new JLabel("Número de Huéspedes:");
        lblNumeroHuespedes.setBounds(10, 110, 150, 25);
        add(lblNumeroHuespedes);

        txtNumeroHuespedes = new JTextField(String.valueOf(reserva.getNumeroHuespedes()));
        txtNumeroHuespedes.setBounds(150, 110, 200, 25);
        add(txtNumeroHuespedes);

        btnModificar = new JButton("Modificar");
        btnModificar.setBounds(50, 200, 100, 30);
        add(btnModificar);

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(200, 200, 100, 30);
        add(btnVolver);

        btnModificar.addActionListener(e -> {
            String fechaLlegada = txtFechaLlegada.getText();
            String fechaSalida = txtFechaSalida.getText();
            int numeroHuespedes = Integer.parseInt(txtNumeroHuespedes.getText());

            ReservaControlador.modificarReserva(reserva, fechaLlegada, fechaSalida, numeroHuespedes);
            JOptionPane.showMessageDialog(null, "Reserva modificada con éxito");
        });

        btnVolver.addActionListener(e -> {
            new PrincipalVista().setVisible(true);
            dispose();
        });
    }
}
