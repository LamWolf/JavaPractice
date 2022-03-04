package com.example.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Client3 {
    private MessageService service;

    public Client3(){
        System.out.println("Calling the Client3's constructor");
    }

    @Autowired(required = false)
    @Qualifier("SMSService")
    public void setService(MessageService service){
        System.out.println("Calling setService() of Client3");
        this.service = service;
    }

    public void processMessage(String msg, String rec){
        this.service.sendMessage(msg, rec);
    }
}
