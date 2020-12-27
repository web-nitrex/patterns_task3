package com.company;

public class SendSMSCommand implements Command{
    private Client client;

    public SendSMSCommand(Client client) {
        this.client = client;
    }

    @Override
    public void execute()
    {
        client.acceptSMS("Вам поступила ссылка на скачивание анкеты: sber.com/anketa");
    }
}
