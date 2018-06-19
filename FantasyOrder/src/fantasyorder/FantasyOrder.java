package fantasyorder;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class FantasyOrder {
    
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException {
        Frame f = new Frame();
        f.setExtendedState(f.MAXIMIZED_BOTH); 
        f.setVisible(true);
        
    }
    
}
