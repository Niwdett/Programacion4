import Vista.PrincipalVista;
import Controlador.HabitacionControlador;
import Controlador.UsuarioControlador;
import Modelo.Usuario;

public class Main {
    public static void main(String[] args) {
        // Inicia la interfaz de usuario en el hilo de despacho de eventos de Swing,
        // lo cual es la práctica recomendada para evitar problemas de hilos.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                inicializarDatos();
                mostrarMenuPrincipal();
            }
        });
    }

    private static void inicializarDatos() {
        // Agrega habitaciones de prueba al sistema
        HabitacionControlador.agregarHabitacion("Sencilla", 1, 50.0, "Cama, Baño, TV");
        HabitacionControlador.agregarHabitacion("Doble", 2, 75.0, "Cama Doble, Baño, TV, Escritorio");
        HabitacionControlador.agregarHabitacion("Suite", 4, 150.0, "Cama King, Baño, TV, Escritorio, Sala");

        // Agrega un usuario administrador de prueba
        Usuario admin = new Usuario("Cédula", "12345678", "Admin", "Admin", 
                                    "admin@example.com", "Calle 123", 
                                    "Ciudad", "123456789", "admin123");
        UsuarioControlador.registrarUsuario(admin);
    }

    private static void mostrarMenuPrincipal() {
        // Crea la ventana del menú principal y la hace visible
        PrincipalVista principalVista = new PrincipalVista();
        principalVista.setVisible(true);
    }
}
