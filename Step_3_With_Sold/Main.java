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
        scanner.nextLine(); // Clear buffer
        
        switch (type) {
            case SMS -> {
                SmsMessage smsMessage = (SmsMessage) message;
                System.out.print("Enter source phone: ");
                smsMessage.setSourcePhoneNumber(scanner.nextLine());
                System.out.print("Enter target phone: ");
                smsMessage.setTargetPhoneNumber(scanner.nextLine());
            }
            case EMAIL -> {
                EmailMessage emailMessage = (EmailMessage) message;
                System.out.print("Enter source email: ");
                emailMessage.setSourceEmailAddress(scanner.nextLine());
                System.out.print("Enter target email: ");
                emailMessage.setTargetEmailAddress(scanner.nextLine());
            }
            case TELEGRAM -> {
                TelegramMessage telegramMessage = (TelegramMessage) message;
                System.out.print("Enter source ID: ");
                telegramMessage.setSourceId(scanner.nextLine());
                System.out.print("Enter target ID: ");
                telegramMessage.setTargetId(scanner.nextLine());
            }
        }
        
        System.out.print("Enter message content: ");
        message.setContent(scanner.nextLine());
    }
    
    private void sendMessage(Message message, MessageType type) {
        switch (type) {
            case SMS -> {
                SmsMessageService service = (SmsMessageService) serviceFactory.createService(type);
                service.sendMessage((SmsMessage) message);
            }
            case EMAIL -> {
                EmailMessageService service = (EmailMessageService) serviceFactory.createService(type);
                service.sendMessage((EmailMessage) message);
            }
            case TELEGRAM -> {
                TelegramMessageService service = (TelegramMessageService) serviceFactory.createService(type);
                service.sendMessage((TelegramMessage) message);
            }
        }
    }
}
