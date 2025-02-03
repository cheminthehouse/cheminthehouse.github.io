import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Integer;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.Timer;

public class CardFlipper implements ActionListener {
    private Card card;
    private JLabel pairs;
    private ArrayList<Card> deck;
    
    public CardFlipper(Card c, JLabel p, ArrayList<Card> d) {
        card = c;
        pairs = p;
        deck = d;
    }

    public int getUpturnedNum() {
        // Find number of cards in current turn
        int upturned = 0;
        for(Card c : deck) {
            if(c.isCurrentTurn()) {
                upturned++;
            }
        }
        return upturned;
    }

    public ArrayList<Card> getUpturnedCards() {
        // Get references to cards in current turn
        ArrayList<Card> upturned = new ArrayList<Card>();
        for(Card c : deck) {
            if(c.isCurrentTurn()) {
                upturned.add(c);
            }
        }
        return upturned;
    }
    
    public void actionPerformed(ActionEvent event) {
        String description = card.getDescription();

        if(description.substring(0, 5).equals("back-")) { // Nothing happens if upturned card is clicked
            String face = description.substring(5);
            card.set(face, face);

            if(getUpturnedNum() == 0) {
                card.setCurrentTurn(true);
            } else {
                ArrayList<Card> currentTurn = getUpturnedCards();
                String card1 = currentTurn.get(0).getDescription();
                String card2 = card.getDescription();

                if(card1 != card2 && card1.charAt(0) == card2.charAt(0)) {
                    // Cards stay up if they are two separate matching cards
                    pairs.setText(String.valueOf(Integer.parseInt(pairs.getText().substring(0, 1)) + 1) + "/" + String.valueOf(deck.size() / 2));
                } else if(card1 != card2) { // Nothing happens if same card clicked twice
                    // Cards flip face down after 1.5 sec if mismatched
                    Timer timer = new Timer(1500, new ActionListener() {
                        public void actionPerformed(ActionEvent event) {
                            currentTurn.get(0).set("back.png", "back-" + card1);
                            card.set("back.png", "back-" + card2);
                        }
                    });

                    timer.setRepeats(false);
                    timer.start();
                }

                // Cards are no longer part of current turn regardless of whether match is made
                currentTurn.get(0).setCurrentTurn(false);
                card.setCurrentTurn(false);
            }
        }
    }
}