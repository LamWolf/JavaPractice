package com.example.dependencyinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SMSService")
public class SMSService implements MessageService{
    public SMSService(){
        System.out.println("Creating SMS Service");
    }
    public void sendMessage(String msg, String rec){
        System.out.println("Send SMS Message to "+rec+" with Message="+msg);
    }
}
