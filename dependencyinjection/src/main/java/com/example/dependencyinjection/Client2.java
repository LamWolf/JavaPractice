package com.example.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Client2 {
    private MessageService service;

    public Client2(@Qualifier("SMSService") MessageService service){
        this.service = service;
        System.out.println("Calling the Client 2's constructor");
    }

    public void processMessage(String msg, String rec){
        this.service.sendMessage(msg, rec);
    }
}
