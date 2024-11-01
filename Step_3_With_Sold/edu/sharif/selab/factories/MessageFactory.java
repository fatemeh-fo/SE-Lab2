package edu.sharif.selab.factories;

import edu.sharif.selab.models.SmsMessage2;
import edu.sharif.selab.models.EmailMessage2;
import edu.sharif.selab.models.TelegramMessage2;
import edu.sharif.selab.enums.MessageType;

public class MessageFactory {
    public Message createMessage(MessageType type) {
        return switch (type) {
            case SMS -> new SmsMessage2();
            case EMAIL -> new EmailMessage2();
            case TELEGRAM -> new TelegramMessage2();
        };
    }
}