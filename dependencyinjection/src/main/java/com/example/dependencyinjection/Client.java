package com.example.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Client {
    @Autowired
    @Qualifier("EmailService")
    private MessageService service;

    public Client() {
        System.out.println("Calling the Client's constructor");;
    }

    public void processMessage(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}
