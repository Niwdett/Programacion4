package Controlador;

import Modelo.Usuario;
import Vista.VentanaRegistro;

import java.util.ArrayList;

public class ControladorRegistro {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void mostrarVentanaRegistro() {
        VentanaRegistro ventanaRegistro = new VentanaRegistro();
        ventanaRegistro.mostrar();
    }

    public static void registrarUsuario(String tipoIdentificacion, String documentoIdentificacion,
                                        String nombres, String apellidos, String correoElectronico,
                                        String direccionResidencia, String ciudadResidencia,
                                        String telefonoContacto, String contraseña) {
        if (camposValidos(tipoIdentificacion, documentoIdentificacion, nombres, apellidos, correoElectronico,
                direccionResidencia, ciudadResidencia, telefonoContacto, contraseña)) {
            Usuario nuevoUsuario = new Usuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos,
                    correoElectronico, direccionResidencia, ciudadResidencia, telefonoContacto, contraseña);
            usuarios.add(nuevoUsuario);
            mostrarMensajeRegistroExitoso(nombres); // Mensaje específico con el nombre del usuario registrado
        } else {
            mostrarMensajeErrorRegistro();
        }
    }

    private static boolean camposValidos(String tipoIdentificacion, String documentoIdentificacion,
                                         String nombres, String apellidos, String correoElectronico,
                                         String direccionResidencia, String ciudadResidencia,
                                         String telefonoContacto, String contraseña) {
        // Validación de campos no vacíos y longitud mínima
        return !tipoIdentificacion.isEmpty() && !documentoIdentificacion.isEmpty() &&
                !nombres.isEmpty() && !apellidos.isEmpty() &&
                !correoElectronico.isEmpty() && !direccionResidencia.isEmpty() &&
                !ciudadResidencia.isEmpty() && !telefonoContacto.isEmpty() &&
                !contraseña.isEmpty() && contraseña.length() >= 6; // Suponiendo una longitud mínima de 6 caracteres para la contraseña
    }

    private static void mostrarMensajeRegistroExitoso(String nombreUsuario) {
        // Mensaje específico indicando el registro exitoso y el nombre del usuario registrado
        System.out.println("Usuario " + nombreUsuario + " registrado satisfactoriamente");
    }

    private static void mostrarMensajeErrorRegistro() {
        // Mensaje genérico de error en caso de campos inválidos
        System.out.println("Error: Por favor, complete todos los campos correctamente.");
    }
}
