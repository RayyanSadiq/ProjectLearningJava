package JavaSmallProjects.MagicCards;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioPlayer {
    Clip clip;

    boolean status;

    AudioInputStream audioInputStream;

    static String fileName;


    // constructor to initialize streams and clip
    public AudioPlayer(String name) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        fileName = name;
        // create AudioInputStream object
        audioInputStream = AudioSystem.getAudioInputStream(new File("src\\JavaSmallProjects\\MagicCards\\Audio\\"+fileName+".wav").getAbsoluteFile());

        // create clip reference
        clip = AudioSystem.getClip();

        // open audioInputStream to the clip
        clip.open(audioInputStream);
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void play() {
        clip.start();
    }

}
