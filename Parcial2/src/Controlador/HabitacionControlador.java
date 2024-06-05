package Controlador;

import Modelo.Usuario;
import java.util.ArrayList;

public class ControladorInicioSesion {
    private ArrayList<Usuario> usuarios;

    public ControladorInicioSesion(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    private boolean loginExitoso = false;

    public boolean iniciarSesion(String correo, String contraseña) {
        if (camposValidos(correo, contraseña)) {
            boolean usuarioEncontrado = false;
            for (Usuario usuario : usuarios) {
                if (usuario.getCorreoElectronico().equals(correo) && usuario.getContraseña().equals(contraseña)) {
                    usuarioEncontrado = true;
                    break;
                }
            }

            if (usuarioEncontrado) {
                loginExitoso = true;
                mostrarMensajeInicioSesionExitoso();
            } else {
                loginExitoso = false;
                mostrarMensajeErrorInicioSesion();
            }
        } else {
            loginExitoso = false;
            mostrarMensajeErrorInicioSesion();
        }
        return loginExitoso;
    }

    private boolean camposValidos(String correo, String contraseña) {
        return !correo.isEmpty() && !contraseña.isEmpty();
    }

    private void mostrarMensajeInicioSesionExitoso() {
        System.out.println("Inicio de sesión exitoso. Bienvenido a MyHotel.");
    }

    public void mostrarMensajeErrorInicioSesion() {
        System.out.println("Error: Correo electrónico o contraseña incorrectos.");
    }
}
