package Vista;

import javax.swing.*;
import Controlador.ReservaControlador;
import Modelo.Reserva;

public class CancelarReservaVista extends JFrame {
    private JButton btnCancelar, btnVolver;

    public CancelarReservaVista(Reserva reserva) {
        setTitle("Cancelar Reserva");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblConfirmacion = new JLabel("¿Está seguro de que desea cancelar la reserva?");
        lblConfirmacion.setBounds(10, 30, 300, 25);
        add(lblConfirmacion);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(50, 100, 100, 30);
        add(btnCancelar);

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(200, 100, 100, 30);
        add(btnVolver);

        btnCancelar.addActionListener(e -> {
            ReservaControlador.cancelarReserva(reserva);
            JOptionPane.showMessageDialog(null, "Reserva cancelada con éxito");
            new PrincipalVista().setVisible(true);
            dispose();
        });

        btnVolver.addActionListener(e -> {
            new PrincipalVista().setVisible(true);
            dispose();
        });
    }
}
