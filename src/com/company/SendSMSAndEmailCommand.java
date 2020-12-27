package com.company;

public class SendSMSAndEmailCommand implements Command{
    private Client client;

    public SendSMSAndEmailCommand(Client client) {
        this.client = client;
    }

    @Override
    public void execute()
    {
        client.acceptSMS("Вам поступила ссылка на скачивание анкеты: sber.com/anketa");
        client.acceptSMS("Вам пришел e-mail!");
        client.acceptEmail("Вам поступила ссылка на скачивание анкеты: sber.com/anketa");
    }
}
