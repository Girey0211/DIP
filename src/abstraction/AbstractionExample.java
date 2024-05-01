package abstraction;

public class AbstractionExample {
    public static void main(String[] args) {

        Playable[] playableList = { new MP3Player(), new Jukebox() };

        for(Playable playable : playableList) {
            playable.play();
        }
    }
}
