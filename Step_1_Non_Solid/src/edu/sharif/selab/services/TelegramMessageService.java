package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

public class TelegramMessageService implements MessageService{
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        //Empty Body
    }
    
    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        //Empty Body
    }

    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        String sourceId = telegramMessage.getSourceId();
        String targetId = telegramMessage.getTargetId();
        String content = telegramMessage.getContent();

        if (validateId(sourceId) && validateId(targetId)) {
            System.out.println("Sending a SMS from " + sourceId + " to " + targetId + " with content : " + content);
        } else {
            throw new IllegalArgumentException("Id is Not Correct!");
        }
    }

    public boolean validateId(String id) {
        if (id.charAt(0) != '@') return false;
        return true;
    }
}
