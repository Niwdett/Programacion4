package Modelo;

public class Habitacion {
    private String tipo;
    private int capacidad;
    private double precioPorNoche;
    private String comodidades;

    public Habitacion(String tipo, int capacidad, double precioPorNoche, String comodidades) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.precioPorNoche = precioPorNoche;
        this.comodidades = comodidades;
    }

    public Habitacion(int i, String string, int j, double d, String string2) {
        //TODO Auto-generated constructor stub
    }

    // Getters y setters para cada campo
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public double getPrecioPorNoche() { return precioPorNoche; }
    public void setPrecioPorNoche(double precioPorNoche) { this.precioPorNoche = precioPorNoche; }

    public String getComodidades() { return comodidades; }
    public void setComodidades(String comodidades) { this.comodidades = comodidades; }
}
