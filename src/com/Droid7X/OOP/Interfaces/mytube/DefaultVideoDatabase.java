package com.Droid7X.OOP.Interfaces.mytube;

import com.Droid7X.OOP.Interfaces.mytube.Interfaces.VideoDatabase;

public class DefaultVideoDatabase implements VideoDatabase {

    @Override
    public void store(Video video) {
        System.out.println("Storing video metadata in a SQL database...");
        System.out.println("Title: " + video.getTitle());
        System.out.println("File Name: " + video.getFileName());
        System.out.println("Done!\n");
    }
}
