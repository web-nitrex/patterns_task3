package com.company;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        ServiceSendingNotifications service = new ServiceSendingNotifications(
                new SendSMSCommand(client),
                new SendEmailCommand(client),
                new SendSMSAndEmailCommand(client));

        service.sendSMS();
        System.out.println("-----------------------------------------------------------");
        service.sendEmail();
        System.out.println("-----------------------------------------------------------");
        service.sendSMSAndEmail();


    }
}
