package edu.sharif.selab.factories;

import edu.sharif.selab.services.SmsMessageServiceImpl;
import edu.sharif.selab.services.EmailMessageServiceImpl;
import edu.sharif.selab.services.TelegramMessageServiceImpl;
import edu.sharif.selab.enums.MessageType;

public class MessageServiceFactory {
    public Object createService(MessageType type) {
        return switch (type) {
            case SMS -> new SmsMessageServiceImpl();
            case EMAIL -> new EmailMessageServiceImpl();
            case TELEGRAM -> new TelegramMessageServiceImpl();
        };
    }
}
