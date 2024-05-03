package Controlador;

import Modelo.Usuario;
import Vista.VentanaInicioSesion;

import java.util.ArrayList;

public class ControladorInicioSesion {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void mostrarVentanaInicioSesion() {
        VentanaInicioSesion ventanaInicioSesion = new VentanaInicioSesion();
        ventanaInicioSesion.mostrar();
    }

    public static void iniciarSesion(String correo, String contraseña) {
        if (camposValidos(correo, contraseña)) {
            boolean usuarioEncontrado = false;
            for (Usuario usuario : usuarios) {
                if (usuario.getCorreoElectronico().equals(correo) && usuario.getContraseña().equals(contraseña)) {
                    usuarioEncontrado = true;
                    break;
                }
            }

            if (usuarioEncontrado) {
                mostrarMensajeInicioSesionExitoso(); // Mensaje específico para inicio de sesión exitoso
            } else {
                mostrarMensajeErrorInicioSesion(); // Mensaje específico para error en inicio de sesión
            }
        } else {
            mostrarMensajeErrorInicioSesion(); // Mensaje genérico para campos vacíos
        }
    }

    private static boolean camposValidos(String correo, String contraseña) {
        // Validación de campos no vacíos
        return !correo.isEmpty() && !contraseña.isEmpty();
    }

    private static void mostrarMensajeInicioSesionExitoso() {
        // Mensaje específico para inicio de sesión exitoso
        System.out.println("Inicio de sesión exitoso. Bienvenido a MyHotel.");
    }

    private static void mostrarMensajeErrorInicioSesion() {
        // Mensaje específico para error en inicio de sesión
        System.out.println("Error: Correo electrónico o contraseña incorrectos.");
    }
}
