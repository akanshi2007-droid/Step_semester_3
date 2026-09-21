package feature_session_7.assignment_problems;
import java.util.Arrays;
public class Assignment2 {
    private String[] songs;
    private int songCount;
    public Assignment2(int maxSize) {
        songs = new String[maxSize];
        songCount = 0;
    }
    public void addSong(String song) {
        if (songCount < songs.length) {
            songs[songCount] = song;
            songCount++;
        }
    }
    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }
    public int getSongCount() {
        return songCount;
    }
    public static void main(String[] args) {
        Assignment2 p = new Assignment2(10);
        p.addSong("Song A");
        p.addSong("Song B");
        String[] copy = p.getSongs();
        System.out.println(Arrays.toString(copy));
        System.out.println(p.getSongCount());
        copy[0] = "Hacked";
        System.out.println(Arrays.toString(p.getSongs()));
    }
}