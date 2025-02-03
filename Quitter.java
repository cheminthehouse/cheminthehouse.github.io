import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quitter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        // Program stops
        System.exit(0);
    }
}