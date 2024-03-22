package PoyFinal.Users;

import java.util.ArrayList;
import java.util.List;
import PoyFinal.Users.UserManager;
import PoyFinal.utils.InputHandler;

public class UserManager {
    private List<User> users = new ArrayList<User>();
    private InputHandler inputHandler = new InputHandler();



    public void registerClient() {
        String typeCC = inputHandler.getInput("Ingresa tu tipo de documento: ");
        String cc = inputHandler.getInput("Ingresa tu número de documento: ");
        String name = inputHandler.getInput("Ingresa tu nombre: ");
        String lastName = inputHandler.getInput("Ingresa tu apellido: ");
        String email = inputHandler.getInput("Ingresa tu correo electrónico: ");
        String address = inputHandler.getInput("Ingresa tu dirección: ");
        String city = inputHandler.getInput("Ingresa tu ciudad: ");
        String phone = inputHandler.getInput("Ingresa tu número de teléfono: ");
        String password = inputHandler.getInput("Ingresa tu contraseña: ");
        String password2 = inputHandler.getInput("Confirma tu contraseña: ");
        while (!password.equals(password2)) {
            System.out.println("Las contraseñas no coinciden.");
            password = inputHandler.getInput("Ingresa tu contraseña: ");
            password2 = inputHandler.getInput("Confirma tu contraseña: ");
        }
        this.registerClient(typeCC, cc, name, lastName, email, address, city, phone, password);
    }


    private void registerClient(String typeCC, String cc, String name, String lastName, String email, String address, String city, String phone, String password){
        User newUser = new User(typeCC, cc, name, lastName, email, address, city, phone, password, "Cliente");
        users.add(newUser);
        System.out.println("Cliente registrado exitosamente.");
    }

    public void loginClient() {
        // User newUser = new User("CC", "123456789", "Juan", "Perez", "d.rincon@utp.edu.co", "Calle 123", "Pereira", "1234567", "12345", "Cliente");
        // users.add(newUser);
        final int MAX_ATTEMPTS = 3;
        String email;
        String password;
        boolean emailFound;
        boolean loginSuccess;
        int attempts;

        // Verificar el correo electrónico
        attempts = 0;
        do {
            email = inputHandler.getInput("Ingresa tu correo electrónico: ");
            emailFound = checkEmailExists(email);
            if (!emailFound) {
                System.out.println("Correo electrónico no registrado.");
            }
            attempts++;
        } while (!emailFound && attempts < MAX_ATTEMPTS);

        if (!emailFound) {
            System.out.println("Inicio de sesión fallido después de 3 intentos de ingresar un correo electrónico.");
            return;
        }

        // Verificar la contraseña
        attempts = 0;
        do {
            password = inputHandler.getInput("Ingresa tu contraseña: ");
            loginSuccess = this.loginClient(email, password);
            if (!loginSuccess) {
                System.out.println("Contraseña incorrecta.");
            }
            attempts++;
        } while (!loginSuccess && attempts < MAX_ATTEMPTS);

        if (loginSuccess) {
            System.out.println("Inicio de sesión exitoso.");
        } else {
            System.out.println("Inicio de sesión fallido después de 3 intentos de ingresar una contraseña.");
        }
    }

    private boolean checkEmailExists(String email) {
        for(User user : users) {
            if(user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    private boolean loginClient(String email, String password){
        for(User user : users) {
            if(user.getEmail().equals(email) && user.getPassword().equals(password) && user.getTypeUser().equals("Cliente")) {
                return true;
            }
        }
        return false;
    }
}