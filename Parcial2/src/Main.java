import Modelo.Usuario;

import java.util.ArrayList;

import javax.swing.SwingUtilities;

import Controlador.ControladorInicioSesion;
import Otros.UserManager;
import Vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null);
            }
        });
    }
}
