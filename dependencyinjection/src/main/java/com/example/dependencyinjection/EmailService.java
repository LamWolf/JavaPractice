package com.example.dependencyinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EmailService")
public class EmailService implements MessageService{
    public EmailService(){
        System.out.println("Creating Email Service");
    }

    public void sendMessage(String msg, String rec) {
        System.out.println("Send Email to "+ rec +" with Message="+msg);
    }
}
