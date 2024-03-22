package PoyFinal.Menu;

import PoyFinal.Users.UserManager;
import PoyFinal.utils.InputHandler;

public class Menu {
    private int option;
    private UserManager userManager = new UserManager();
    private InputHandler inputHandler = new InputHandler();

    public void printOptions() {
        inputHandler.printOptions();
    }

    public void scannerOptions() {
        this.option = inputHandler.getOption();
    }

    public void menuLoop() {
        while(this.option != 3){
            printOptions();
            scannerOptions();
            switch (this.option) {
                case 1:
                    userManager.registerClient();
                    break;
                case 2:
                    userManager.loginClient();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    this.option = 3;
                    break;
                default:
                    break;
            }
        }
        
    }

}