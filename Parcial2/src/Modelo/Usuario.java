package modelo;

public class Usuario {
    private String tipoIdentificacion;
    private String documentoIdentificacion;
    private String nombres;
    private String apellidos;
    private String correoElectronico;
    private String direccionResidencia;
    private String ciudadResidencia;
    private String telefonoContacto;
    private String contraseña;

    public Usuario(String tipoIdentificacion, String documentoIdentificacion, String nombres, String apellidos,
                   String correoElectronico, String direccionResidencia, String ciudadResidencia,
                   String telefonoContacto, String contraseña) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.documentoIdentificacion = documentoIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        
        if (correoElectronicoValido(correoElectronico)) {
            this.correoElectronico = correoElectronico;
        } else {
            throw new IllegalArgumentException("Correo electrónico no válido");
        }
        
        this.direccionResidencia = direccionResidencia;
        this.ciudadResidencia = ciudadResidencia;
        this.telefonoContacto = telefonoContacto;
        this.contraseña = contraseña;
    }

    private boolean correoElectronicoValido(String correoElectronico) {
        return correoElectronico.contains("@");
    }

    // Métodos getters y setters
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(String documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronicoValido(correoElectronico)) {
            this.correoElectronico = correoElectronico;
        } else {
            throw new IllegalArgumentException("Correo electrónico no válido");
        }
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
