import java.util.Scanner;

import edu.sharif.selab.factories.MessageFactory;
import edu.sharif.selab.factories.MessageServiceFactory;

public class Main {
    public static void main(String[] args) {
        MessengerUI ui = new MessengerUI();
        ui.start();
    }
}

class MessengerUI {
    private final Scanner scanner;
    private final MessageFactory messageFactory;
    private final MessageServiceFactory serviceFactory;

    public MessengerUI() {
        this.scanner = new Scanner(System.in);
        this.messageFactory = new MessageFactory();
        this.serviceFactory = new MessageServiceFactory();
    }

    public void start() {        
        System.out.println("Welcome to SE Lab Messenger.");
    
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            
            if (choice == 0) break;
            
            try {
                handleUserChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
    private void displayMenu() {
        // TODO
    }
    
    private void handleUserChoice(int choice) {
        // TODO
    }
    
    private void fillMessageDetails(Message message, MessageType type) {
        // TODO
    }
    
    private void sendMessage(Message message, MessageType type) {
        // TODO
    }
}
