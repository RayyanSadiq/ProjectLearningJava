package com.LearningProject.OOP.Interfaces.mytube;

import com.LearningProject.OOP.Interfaces.mytube.Interfaces.VideoEncoder;

public class DefaultVideoEncoder implements VideoEncoder {

    @Override
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
