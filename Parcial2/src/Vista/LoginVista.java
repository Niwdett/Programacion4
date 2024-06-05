package Vista;

import javax.swing.*;

public class Habitaciones extends JFrame{

    public Habitaciones() {
        
        JFrame ventana = new JFrame("Habitación");
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(300, 300);

        ventana.setLocationRelativeTo(null); 
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new Habitaciones();
    }

}
