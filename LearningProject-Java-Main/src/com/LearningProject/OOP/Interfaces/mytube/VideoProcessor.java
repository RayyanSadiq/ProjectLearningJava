package com.LearningProject.OOP.Interfaces.mytube;

import com.LearningProject.OOP.Interfaces.mytube.Interfaces.VideoEncoder;

public class VideoProcessor {

    private VideoEncoder encoder;

    private DefaultVideoDatabase database;

    private  DefaultEmailService emailService;

    public VideoProcessor(VideoEncoder encoder, DefaultVideoDatabase database, DefaultEmailService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

