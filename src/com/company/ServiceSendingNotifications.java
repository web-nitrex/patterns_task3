package com.company;

public class ServiceSendingNotifications {
    Command sendSMS;
    Command sendEmail;
    Command sendSMSAndEmail;

    public ServiceSendingNotifications(Command sendSMS, Command sendEmail, Command sendSMSAndEmail) {
        this.sendSMS = sendSMS;
        this.sendEmail = sendEmail;
        this.sendSMSAndEmail = sendSMSAndEmail;
    }

    public void sendSMS()
    {
        sendSMS.execute();
    }

    public void sendEmail()
    {
        sendEmail.execute();
    }

    public void sendSMSAndEmail()
    {
        sendSMSAndEmail.execute();
    }

}
