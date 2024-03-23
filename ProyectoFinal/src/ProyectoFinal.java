import java.util.ArrayList;
import java.util.Scanner;

public class ProyectoFinal {
    public static Scanner leerDatoTeclado = new Scanner(System.in);
    public static ArrayList<String[]> usuarios = new ArrayList<>();
    public static final int MAX_INTENTOS = 3;

    public static final int TIPO_IDENTIFICACION = 0;
    public static final int DOCUMENTO_IDENTIFICACION = 1;
    public static final int NOMBRES = 2;
    public static final int APELLIDOS = 3;
    public static final int CORREO_ELECTRONICO = 4;
    public static final int DIRECCION_RESIDENCIA = 5;
    public static final int CIUDAD_RESIDENCIA = 6;
    public static final int TELEFONO_CONTACTO = 7;
    public static final int CONTRASEÑA = 8;
    public static final int CONFIRMAR_CONTRASEÑA = 9;

    public static void main(String[] args) {
        mostrarMenuLoginRegistro();
    }

    public static void mostrarMenuLoginRegistro() {
        int opcion;
        do {
            System.out.println("Bienvenido!");
            System.out.println("1. Registrarse como cliente");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            System.out.print("Por favor, seleccione una opción: ");
            opcion = leerDatoTeclado.nextInt();
            leerDatoTeclado.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    solicitarDatosDeRegistro();
                    break;
                case 2:
                    iniciarSesion();
                    break;
                case 3:
                    System.out.println("¡Hasta pronto!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        } while (opcion != 3);
    }

    public static void solicitarDatosDeRegistro() {
        System.out.println("Por favor ingrese los siguientes datos:");
        System.out.print("Tipo de identificación: ");
        String tipoIdentificacion = leerDatoTeclado.nextLine();
        System.out.print("Documento de identificación: ");
        String documentoIdentificacion = leerDatoTeclado.nextLine();
        System.out.print("Nombres: ");
        String nombres = leerDatoTeclado.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = leerDatoTeclado.nextLine();
        System.out.print("Correo electrónico: ");
        String correoElectronico = leerDatoTeclado.nextLine();
        System.out.print("Dirección de residencia: ");
        String direccionResidencia = leerDatoTeclado.nextLine();
        System.out.print("Ciudad de residencia: ");
        String ciudadResidencia = leerDatoTeclado.nextLine();
        System.out.print("Teléfono de contacto: ");
        String telefonoContacto = leerDatoTeclado.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = leerDatoTeclado.nextLine();

        int intentos = 0;
        String confirmarContraseña;
        do {
            if (intentos > 0) {
                System.out.println("Las contraseñas no coinciden. Por favor, inténtelo de nuevo.");
            }
            System.out.print("Confirmar Contraseña: ");
            confirmarContraseña = leerDatoTeclado.nextLine();
            intentos++;
            if (intentos >= MAX_INTENTOS) {
                System.out.println("Intentos límite superados. Volviendo al menú principal.");
                return;
            }
        } while (!contraseña.equals(confirmarContraseña));

        registrarUsuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos,
                correoElectronico, direccionResidencia, ciudadResidencia, telefonoContacto,
                contraseña);
    }


    public static void registrarUsuario(String tipoIdentificacion, String documentoIdentificacion,
                                        String nombres, String apellidos, String correoElectronico,
                                        String direccionResidencia, String ciudadResidencia,
                                        String telefonoContacto, String contraseña) {
        String[] usuario = {tipoIdentificacion, documentoIdentificacion, nombres, apellidos,
                correoElectronico, direccionResidencia, ciudadResidencia,
                telefonoContacto, contraseña};
        usuarios.add(usuario);
        System.out.println("Usuario registrado exitosamente.");
    }

    public static void iniciarSesion() {
        System.out.println("Por favor, ingrese su correo electrónico:");
        String correoElectronico = leerDatoTeclado.nextLine();

        // Buscamos el usuario en la lista de usuarios
        String[] usuario = null;
        for (String[] u : usuarios) {
            if (u[CORREO_ELECTRONICO].equals(correoElectronico)) {
                usuario = u;
                break;
            }
        }

        if (usuario == null) {
            System.out.println("Correo electrónico no registrado.");
            return;
        }

        System.out.println("Por favor, ingrese su contraseña:");
        String contraseña = leerDatoTeclado.nextLine();

        if (usuario[CONTRASEÑA].equals(contraseña)) {
            System.out.println("Usuario logueado correctamente.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
}
	