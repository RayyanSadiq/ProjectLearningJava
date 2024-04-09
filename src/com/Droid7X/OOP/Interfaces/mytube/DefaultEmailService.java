package com.Droid7X.OOP.Interfaces.mytube;

import com.Droid7X.OOP.Interfaces.mytube.Interfaces.EmailService;

public class DefaultEmailService implements EmailService {

    @Override
    public void sendEmail(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
