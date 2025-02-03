import java.awt.event.ActionListener;
import java.util.Optional;
import javax.swing.JButton;

public class Card {
    private boolean currentTurn;
    private String description;
    private Btn card;

    public Card(String d) {
        // Create card facing down
        currentTurn = false;
        description = "back-" + d;
        card = new Btn("back.png", 130, 130, Optional.of(description), Optional.empty());
    }

    public boolean isCurrentTurn() {
        return currentTurn;
    }

    public String getDescription() {
        return description;
    }

    public JButton getBtn() {
        return card.get();
    }

    public void setCurrentTurn(boolean ct) {
        currentTurn = ct;
    }

    public void set(String img, String d) {
        description = d;
        card.set(img, 130, 130, description);
    }

    public void addActionListener(ActionListener listen) {
        card.get().addActionListener(listen);
    }
}