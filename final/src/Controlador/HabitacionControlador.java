package Controlador;

import Modelo.Habitacion;
import java.util.ArrayList;
import java.util.List;

public class HabitacionControlador {
    private static List<Habitacion> listaHabitaciones = new ArrayList<>();

    public static void agregarHabitacion(String tipo, int capacidad, double precioPorNoche, String comodidades) {
        Habitacion habitacion = new Habitacion(tipo, capacidad, precioPorNoche, comodidades);
        listaHabitaciones.add(habitacion);
    }

    public static List<Habitacion> buscarHabitacionesDisponibles() {
        return listaHabitaciones;
    }

    public static List<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public static void buscarHabitaciones(String fechaEntrada, String fechaSalida, int numeroHuespedes,
            String tipoHabitacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarHabitaciones'");
    }

    public static List<Habitacion> obtenerHabitaciones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerHabitaciones'");
    }

    public static void eliminarHabitacion(Habitacion seleccionada) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarHabitacion'");
    }

    public static void editarHabitacion(Habitacion habitacion, String tipo, int capacidad, double precio,
            String comodidades) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editarHabitacion'");
    }

    public static void agregarHabitacion(Habitacion habitacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarHabitacion'");
    }
}


