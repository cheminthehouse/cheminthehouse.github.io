import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Integer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Countdown {
    private Timer timer;
    private int timeLeft;
    private JLabel time;
    private JLabel pairs;
    private JFrame gameFrame;
    private int totalTime;

    public Countdown(int tl, JLabel t, JLabel p, JFrame f, int tt) {
        timeLeft = tl;
        time = t;
        pairs = p;
        gameFrame = f;
        totalTime = tt;
        time.setText(String.valueOf(timeLeft));

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(timeLeft > 0 && Integer.parseInt(pairs.getText().substring(0, 1)) < 8) {
                    timeLeft--;
                    time.setText(String.valueOf(timeLeft));
                } else {
                    // Timer stops if it reaches 0 or player finds all matches
                    timer.stop();
                    gameFrame.dispose();

                    if(timeLeft <= 0) {
                        // Game over pop-up
                        new Popup(false);
                    } else {
                        // Success pop-up
                        new Popup(true);
                    }
                }
            }
        });
    }
    
    public void start() {
        timer.start();
    }

    public void restart() {
        timeLeft = totalTime;
        time.setText(String.valueOf(timeLeft));
        timer.restart();
    }

    public void stop() {
        timer.stop();
    }

    public int getTotalTime() {
        return totalTime;
    }
}