public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Aquí creas una instancia de tu ventana principal o de inicio de sesión
                // dependiendo de la lógica de tu aplicación.
                // Por ejemplo:
                VentanaInicioSesion ventanaInicioSesion = new VentanaInicioSesion();
                ventanaInicioSesion.mostrar();
            }
        });
    }
}
