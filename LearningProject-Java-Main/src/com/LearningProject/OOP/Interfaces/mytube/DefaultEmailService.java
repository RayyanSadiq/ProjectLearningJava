package com.LearningProject.OOP.Interfaces.mytube;

import com.LearningProject.OOP.Interfaces.mytube.Interfaces.EmailService;

public class DefaultEmailService implements EmailService {

    @Override
    public void sendEmail(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
