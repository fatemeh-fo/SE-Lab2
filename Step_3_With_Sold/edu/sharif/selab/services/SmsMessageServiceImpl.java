package edu.sharif.selab.services;

import edu.sharif.selab.models.SmsMessage2;

public class SmsMessageServiceImpl implements SmsMessageService2 {
    @Override
    public void sendMessage(SmsMessage2 message) {
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

interface SmsMessageService2 {
    void sendMessage(SmsMessage2 message);
}