import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Popup {
    boolean won;

    public Popup(boolean w) {
        won = w;
        // Initial setup
        JFrame popupFrame = new JFrame(won ? "Success" : "Game Over");
        popupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(0, 1, 20, 20));
        
        JLabel timesUp = (new Txt(won ? "You Won!" : "Time's Up!", Optional.empty())).get();
        panel.add(timesUp);

        // Control buttons
        JButton restart = (new Btn("restart.png", 200, 80, Optional.empty(), Optional.of(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                popupFrame.dispose();
                new ChemInTheHouse();
            }
        }))).get();
        panel.add(restart);

        JButton quit = (new Btn("quit.png", 200, 80, Optional.empty(), Optional.of(new Quitter()))).get();
        panel.add(quit);

        // Final setup
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        popupFrame.add(panel);
        popupFrame.pack();
        popupFrame.setLocationRelativeTo(null);
        popupFrame.setVisible(true);
    }
}