package PoyFinal.utils;

import java.util.Scanner;

public class InputHandler {
    private Scanner scanner = new Scanner(System.in);

    public void printOptions() {
        System.out.println("Ingresa una Opcion: ");
        System.out.println("1. Registrarse Como cliente ");
        System.out.println("2. Iniciar Sesion ");
        System.out.println("3. Salir ");
    }

    public int getOption(){
        try {
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            if (option > 3) {
                throw new Exception("El número ingresado es mayor a 3.");
            }
            return option;
        } catch (Exception e) {
            System.out.println("Por favor, ingresa un número válido.");
            return this.getOption();
        }
    }

    public String getInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
}