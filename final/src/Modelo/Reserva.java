package Modelo;

import java.util.Date;

public class Reserva {
    private Usuario usuario;
    private Habitacion habitacion;
    private Date fechaEntrada;
    private Date fechaSalida;
    private int numeroHuespedes;

    public Reserva(Usuario usuario, Habitacion habitacion, Date fechaEntrada, Date fechaSalida, int numeroHuespedes) {
        this.usuario = usuario;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroHuespedes = numeroHuespedes;
    }

    // Getters y setters para cada campo
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public Habitacion getHabitacion() { return habitacion; }
    public void setHabitacion(Habitacion habitacion) { this.habitacion = habitacion; }

    public Date getFechaEntrada() { return fechaEntrada; }
    public void setFechaEntrada(Date fechaEntrada) { this.fechaEntrada = fechaEntrada; }

    public Date getFechaSalida() { return fechaSalida; }
    public void setFechaSalida(Date fechaSalida) { this.fechaSalida = fechaSalida; }

    public int getNumeroHuespedes() { return numeroHuespedes; }
    public void setNumeroHuespedes(int numeroHuespedes) { this.numeroHuespedes = numeroHuespedes; }

    public String getFechaLlegada() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFechaLlegada'");
    }
}
