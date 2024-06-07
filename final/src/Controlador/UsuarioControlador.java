package Controlador;

import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioControlador {
    private static List<Usuario> listaUsuarios = new ArrayList<>();

    public static void registrarUsuario(String tipoIdentificacion, String documentoIdentificacion, String nombres, String apellidos, String correoElectronico, String direccionResidencia, String ciudadResidencia, String telefonoContacto, String contraseña) {
        Usuario usuario = new Usuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos, correoElectronico, direccionResidencia, ciudadResidencia, telefonoContacto, contraseña);
        listaUsuarios.add(usuario);
    }

    public static boolean validarCredenciales(String correoElectronico, String contraseña) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCorreoElectronico().equals(correoElectronico) && usuario.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void registrarUsuario(Usuario admin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarUsuario'");
    }
}
