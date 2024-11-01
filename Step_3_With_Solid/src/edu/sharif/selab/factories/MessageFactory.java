package edu.sharif.selab.factories;

import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.TelegramMessage;
import edu.sharif.selab.enums.MessageType;

public class MessageFactory {
    public Message createMessage(MessageType type) {
        return switch (type) {
            case SMS -> new SmsMessage();
            case EMAIL -> new EmailMessage();
            case TELEGRAM -> new TelegramMessage();
        };
    }
}