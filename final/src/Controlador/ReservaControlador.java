package Controlador;

import Modelo.Reserva;
import java.util.ArrayList;
import java.util.List;

public class ReservaControlador {
    private static List<Reserva> listaReservas = new ArrayList<>();

    public static void realizarReserva(Reserva reserva) {
        listaReservas.add(reserva);
    }

    public static List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public static void realizarReserva(String nombre, String fechaLlegada, String fechaSalida, int numeroHuespedes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarReserva'");
    }

    public static void cancelarReserva(Reserva reserva) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelarReserva'");
    }

    public static List<Reserva> obtenerHistorialReservas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerHistorialReservas'");
    }

    public static void modificarReserva(Reserva reserva, String fechaLlegada, String fechaSalida, int numeroHuespedes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarReserva'");
    }
}
