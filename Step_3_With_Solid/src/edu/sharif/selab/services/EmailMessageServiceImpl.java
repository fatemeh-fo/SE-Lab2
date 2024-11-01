package edu.sharif.selab.services;

import java.util.regex.Pattern;

import edu.sharif.selab.models.EmailMessage;

public class EmailMessageServiceImpl implements EmailMessageService2 {
    @Override
    public void sendMessage(EmailMessage message) {
        if(validateEmailAddress(message.getSourceEmailAddress()) && 
           validateEmailAddress(message.getTargetEmailAddress())) {
            System.out.println("Sending email from " + message.getSourceEmailAddress() + 
                             " to " + message.getTargetEmailAddress() + 
                             " with content: " + message.getContent());
        } else {
            throw new IllegalArgumentException("Email Address is Not Correct!");
        }
    }

    private boolean validateEmailAddress(String email) {
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }
}

interface EmailMessageService2 {
    void sendMessage(EmailMessage message);
}