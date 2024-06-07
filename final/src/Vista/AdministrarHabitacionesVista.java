package Vista;

import Controlador.HabitacionControlador;
import Modelo.Habitacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class AdministrarHabitacionesVista extends JFrame {
    private JList<Habitacion> listHabitaciones;
    private JButton btnEditar, btnEliminar, btnAgregar, btnVolver;

    public AdministrarHabitacionesVista() {
        setTitle("Administrar Habitaciones");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        listHabitaciones = new JList<>();
        DefaultListModel<Habitacion> model = new DefaultListModel<>();
        List<Habitacion> habitaciones = HabitacionControlador.obtenerHabitaciones();
        habitaciones.forEach(model::addElement);
        listHabitaciones.setModel(model);
        listHabitaciones.setBounds(10, 10, 280, 250);
        add(listHabitaciones);

        btnEditar = new JButton("Editar");
        btnEditar.setBounds(300, 10, 180, 30);
        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Habitacion seleccionada = listHabitaciones.getSelectedValue();
                if (seleccionada != null) {
                    new EditarHabitacionVista(seleccionada).setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una habitación para editar.");
                }
            }
        });
        add(btnEditar);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(300, 50, 180, 30);
        btnAgregar.addActionListener(e -> {
            new AgregarHabitacionVista().setVisible(true);
            dispose();
        });
        add(btnAgregar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(300, 90, 180, 30);
        btnEliminar.addActionListener(e -> {
            Habitacion seleccionada = listHabitaciones.getSelectedValue();
            if (seleccionada != null) {
                HabitacionControlador.eliminarHabitacion(seleccionada);
                model.removeElement(seleccionada);
                JOptionPane.showMessageDialog(null, "Habitación eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una habitación para eliminar.");
            }
        });
        add(btnEliminar);

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(300, 130, 180, 30);
        btnVolver.addActionListener(e -> {
            new PrincipalVista().setVisible(true);
            dispose();
        });
        add(btnVolver);
    }
}
