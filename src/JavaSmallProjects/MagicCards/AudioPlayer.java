package JavaSmallProjects.MagicCards;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public interface AudioPlayer extends AudioGettable {

    void setFileName(String fileName) throws UnsupportedAudioFileException, IOException, LineUnavailableException;

    void setStatus(boolean status);

    void play();
}
