package Otros;

import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private ArrayList<Usuario> usuarios;

    public UserManager() {
        this.usuarios = new ArrayList<>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = (ArrayList<Usuario>) usuarios;
    }

    public Usuario getUsuarioPorCorreo(String correo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreoElectronico().equals(correo)) {
                return usuario;
            }
        }
        return null;
    }

    public void agregarUsuario(String tipoIdentificacion, String documentoIdentificacion, String nombres,
                               String apellidos, String correoElectronico, String direccionResidencia,
                               String ciudadResidencia, String telefonoContacto, String contraseña) {
        Usuario nuevoUsuario = new Usuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos,
                correoElectronico, direccionResidencia, ciudadResidencia, telefonoContacto, contraseña);
        usuarios.add(nuevoUsuario);
    }

    public void agregarAdmin(String tipoIdentificacion, String documentoIdentificacion, String nombres,
                             String apellidos, String correoElectronico, String direccionResidencia,
                             String ciudadResidencia, String telefonoContacto, String contraseña) {
        Usuario nuevoAdmin = new Usuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos,
                correoElectronico, direccionResidencia, ciudadResidencia, telefonoContacto, contraseña);
        usuarios.add(nuevoAdmin);
    }
}
