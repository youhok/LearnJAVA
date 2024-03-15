import java.util.Timer;
import java.util.TimerTask;

public class songtest {
     private static Timer timer;
        private static int currentLineIndex;
    public static void main(String[] args) {
       
        String[] lyrics = {
            "I wanna be your vacuum cleaner",
            "Breathing in your dust",
            "I wanna be your ford cortina",
            "I will never Rust",
            "If you like your coffee hot",
            "let me be your coffee pot",
            "You call the shots, babe",
            "I just wanna be yours",
            "Secrets I have held in my heart",
            "Are harder to hide than I thought",
            "Maybe I just wanna be yours",
            "I wanna be yours",
            "I wanna Be yours, wanna be yours",
            "Wanna be your, wanna be yours"
    };

    currentLineIndex = 0;
    timer = new Timer();

    scheduleNextLyric(lyrics);

    System.out.println("Song started...");
    }
    private static void scheduleNextLyric(String[] lyrics) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (currentLineIndex < lyrics.length) {
                    displayLyrics(lyrics[currentLineIndex]);
                    currentLineIndex++;
                    scheduleNextLyric(lyrics);
                } else {
                    timer.cancel();
                    System.out.println("");
                }
            }
        }, 3200);
    }

    private static void displayLyrics(String lyrics) {
        System.out.println("Song Lyrics: " + lyrics);
    }
}
