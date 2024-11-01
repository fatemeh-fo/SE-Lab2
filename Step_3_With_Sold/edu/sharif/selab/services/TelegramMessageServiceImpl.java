package edu.sharif.selab.services;

import edu.sharif.selab.models.TelegramMessage2;

public class TelegramMessageServiceImpl implements TelegramMessageService2 {
    @Override
    public void sendMessage(TelegramMessage message) {
        if(validateId(message.getSourceId()) && validateId(message.getTargetId())) {
            System.out.println("Sending telegram message from " + message.getSourceId() + 
                             " to " + message.getTargetId() + 
                             " with content: " + message.getContent());
        } else {
            throw new IllegalArgumentException("Telegram ID is Not Correct!");
        }
    }

    private boolean validateId(String id) {
        return id != null && id.startsWith("@");
    }
}

interface TelegramMessageService2 {
    void sendMessage(TelegramMessage message);
}