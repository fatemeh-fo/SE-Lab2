package edu.sharif.selab.services;

import edu.sharif.selab.models.SmsMessage;

public class SmsMessageServiceImpl implements SmsMessageService {
    @Override
    public void sendMessage(SmsMessage message) {
        if(validatePhoneNumber(message.getSourcePhoneNumber()) && 
           validatePhoneNumber(message.getTargetPhoneNumber())) {
            System.out.println("Sending SMS from " + message.getSourcePhoneNumber() + 
                             " to " + message.getTargetPhoneNumber() + 
                             " with content: " + message.getContent());
        } else {
            throw new IllegalArgumentException("Phone Number is Not Correct!");
        }
    }

    private boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.length() == 11 && 
               phoneNumber.chars().allMatch(Character::isDigit);
    }
}

interface SmsMessageService {
    void sendMessage(SmsMessage message);
}