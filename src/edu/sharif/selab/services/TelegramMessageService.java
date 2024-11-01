package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;

public class TelegramMessageService implements MessageService  {
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        //Empty Body
    }
    
    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        //Empty Body
    }
}
