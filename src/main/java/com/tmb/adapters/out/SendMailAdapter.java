package com.tmb.adapters.out;

import com.tmb.adapters.out.client.SendMailClient;
import com.tmb.application.ports.out.ValidateMailOutputPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SendMailAdapter implements ValidateMailOutputPort {

    @Inject
    SendMailClient sendMailClient;

    @Override
    public void sendMailValidation(String mail) {
        String body = "";
        String subject = "Activate your user account!";

        this.sendMailClient.sendMail(mail, body, subject);

    }
}
