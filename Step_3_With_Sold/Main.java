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
        System.out.println("1. Send SMS message");
        System.out.println("2. Send Email message");
        System.out.println("3. Send Telegram message");
        System.out.println("0. Exit");
    }
    
    private void handleUserChoice(int choice) {
        MessageType type = switch (choice) {
            case 1 -> MessageType.SMS;
            case 2 -> MessageType.EMAIL;
            case 3 -> MessageType.TELEGRAM;
            default -> throw new IllegalArgumentException("Invalid choice");
        };

        Message message = messageFactory.createMessage(type);
        fillMessageDetails(message, type);
        sendMessage(message, type);
    }
    
    private void fillMessageDetails(Message message, MessageType type) {
        // TODO
    }
    
    private void sendMessage(Message message, MessageType type) {
        // TODO
    }
}
