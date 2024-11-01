package edu.sharif.selab.services;

import edu.sharif.selab.models.TelegramMessage;

public class TelegramMessageServiceImpl implements TelegramMessageService {
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

interface TelegramMessageService {
    void sendMessage(TelegramMessage message);
}