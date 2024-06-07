package Vista;

import javax.swing.*;
import Controlador.ReservaControlador;
import Modelo.Reserva;

import java.util.List;

public class HistorialReservasVista extends JFrame {
    private JTextArea textArea;
    private JButton btnVolver;

    public HistorialReservasVista() {
        setTitle("Historial de Reservas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        textArea = new JTextArea();
        textArea.setBounds(10, 10, 360, 200);
        add(textArea);

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(150, 220, 100, 30);
        add(btnVolver);

        List<Reserva> historialReservas = ReservaControlador.obtenerHistorialReservas();
        StringBuilder historial = new StringBuilder();
        for (Reserva reserva : historialReservas) {
            historial.append(reserva.toString()).append("\n");
        }
        textArea.setText(historial.toString());

        btnVolver.addActionListener(e -> {
            new PrincipalVista().setVisible(true);
            dispose();
        });
    }
}
