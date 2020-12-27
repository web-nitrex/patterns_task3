package com.company;

public class Client {
    public void acceptEmail(String msg)
    {
        System.out.println("Принято электронное письмо: "+msg);
    }

    public void acceptSMS(String msg)
    {
        System.out.println("Принято СМС: "+msg);
    }


}
