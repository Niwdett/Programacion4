package Vista;

import javax.swing.*;
import Controlador.HabitacionControlador;

public class AgregarHabitacionVista extends JFrame {
    private JTextField txtTipo, txtCapacidad, txtPrecio, txtComodidades;
    private JButton btnAgregar, btnVolver;

    public AgregarHabitacionVista() {
        setTitle("Agregar Habitación");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblTipo = new JLabel("Tipo de Habitación:");
        lblTipo.setBounds(10, 30, 150, 25);
        add(lblTipo);

        txtTipo = new JTextField();
        txtTipo.setBounds(150, 30, 200, 25);
        add(txtTipo);

        JLabel lblCapacidad = new JLabel("Capacidad:");
        lblCapacidad.setBounds(10, 70, 150, 25);
        add(lblCapacidad);

        txtCapacidad = new JTextField();
        txtCapacidad.setBounds(150, 70, 200, 25);
        add(txtCapacidad);

        JLabel lblPrecio = new JLabel("Precio por Noche:");
        lblPrecio.setBounds(10, 110, 150, 25);
        add(lblPrecio);

        txtPrecio = new JTextField();
        txtPrecio.setBounds(150, 110, 200, 25);
        add(txtPrecio);

        JLabel lblComodidades = new JLabel("Comodidades:");
        lblComodidades.setBounds(10, 150, 150, 25);
        add(lblComodidades);

        txtComodidades = new JTextField();
        txtComodidades.setBounds(150, 150, 200, 25);
        add(txtComodidades);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(50, 200, 100, 30);
        add(btnAgregar);

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(200, 200, 100, 30);
        add(btnVolver);

        btnAgregar.addActionListener(e -> {
            String tipo = txtTipo.getText();
            int capacidad = Integer.parseInt(txtCapacidad.getText());
            double precio = Double.parseDouble(txtPrecio.getText());
            String comodidades = txtComodidades.getText();

            HabitacionControlador.agregarHabitacion(tipo, capacidad, precio, comodidades);
            JOptionPane.showMessageDialog(null, "Habitación agregada con éxito");
        });

        btnVolver.addActionListener(e -> {
            new AdministrarHabitacionesVista().setVisible(true);
            dispose();
        });
    }
}
