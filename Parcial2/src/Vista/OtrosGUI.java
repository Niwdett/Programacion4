package proyecto.controlador;

import proyecto.modelo.Usuario;
import proyecto.vista.VentanaInicioSesion;

public class ControladorInicioSesion {
    
    public static boolean iniciarSesion(String correo, String contraseña) {
        Usuario usuario = buscarUsuario(correo, contraseña);
        if (usuario != null) {
            // Aquí podrías establecer una sesión de usuario si lo deseas
            return true;
        } else {
            return false;
        }
    }
    
    private static Usuario buscarUsuario(String correo, String contraseña) {
        // Implementa la lógica para buscar al usuario en la base de datos o en la lista de usuarios registrados
        // Por ahora, simplemente devolvemos un usuario de prueba si el correo y la contraseña coinciden
        if (correo.equals("usuario@example.com") && contraseña.equals("contraseña123")) {
            return new Usuario("Usuario", "Apellido", "usuario@example.com", "contraseña123");
        } else {
            return null;
        }
    }
}
