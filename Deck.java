import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Deck {
    private ArrayList<Card> deck;
    private JPanel cards;
    private JLabel pairs;

    public Deck() {
        deck = new ArrayList<Card>();
        cards = null;
        pairs = null;
    }

    public Deck(JPanel c, JLabel p) {
        deck = new ArrayList<Card>();
        cards = c;
        pairs = p;
        shuffle(cards, pairs);
    }

    public int size() {
        return deck.size();
    }

    public void shuffle(JPanel cards, JLabel pairs) {
        // Remove any previous cards
        cards.removeAll();
        ArrayList<String> faces = new ArrayList<String>(Arrays.asList("1-bakingSoda.png", "1-NaHCO3.png", "2-toothpaste.png", "2-NaF.png", "3-tableSugar.png", "3-C12H22O11.png", "4-nailPolishRemover.png", "4-C3H6O.png", "5-antifreeze.png", "5-C2H6O2.png", "6-marble.png", "6-CaCO3.png", "7-sodas.png", "7-H3PO4.png", "8-drainCleaners.png", "8-H2SO4.png")); // Image file names
        
        // Populate cards panel
        while(!faces.isEmpty()) {
            int random = (int)(Math.random() * faces.size());
            Card card = new Card(faces.remove(random));
            card.addActionListener(new CardFlipper(card, pairs, deck));
            cards.add(card.getBtn());
            deck.add(card);
        }
        cards.revalidate();
        cards.repaint();
    }
}