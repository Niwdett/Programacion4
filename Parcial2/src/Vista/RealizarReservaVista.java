package Vista;

import javax.swing.*;

public class VerReservas extends JFrame{
    
    public VerReservas() {
        
        JFrame ventana = new JFrame("Ver Reservas");
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(300, 300);

        ventana.setLocationRelativeTo(null); 
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new VerReservas();
    }
}
