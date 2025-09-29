package designpatterns.ex1.structural;

// Target interface
interface MediaPlayer {
    void play(String filename);
}

// Adaptee class
class AdvancedPlayer {
    public void playMp4(String filename) {
        System.out.println("Playing MP4: " + filename);
    }
}

// Adapter class
class Mp4Adapter implements MediaPlayer {
    private AdvancedPlayer player;
    public Mp4Adapter(AdvancedPlayer p) { player = p; }
    public void play(String filename) { player.playMp4(filename); }
}

// Client
public class AdapterAudioPlayerDemo {
    public static void main(String[] args) {
        MediaPlayer player = new Mp4Adapter(new AdvancedPlayer());
        player.play("song.mp4");
    }
}
