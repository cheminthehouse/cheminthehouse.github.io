import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChemInTheHouse {
    public JLabel time;
    public Countdown timer;
    public Deck deck;
    public ChemInTheHouse() {
        // Initial setup
        int totalTime = 180; // Time in seconds
        deck = new Deck();
        GridBagConstraints c = new GridBagConstraints();
        JFrame frame = new JFrame("Chem in the House");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel board = new JPanel(new GridBagLayout());
        JPanel boardControls = new JPanel(new GridLayout(0, 1, 20, 20));
        JPanel cards = new JPanel(new GridLayout(0, 4, 20, 20)); // Expandable rows for more cards
        JPanel pairsPanel = new JPanel(new GridLayout(2, 1, 0, 10));
        JPanel timePanel = new JPanel(new GridLayout(2, 1, 0, 10));

        // Pairs found
        JLabel pairsLabel = (new Txt("Pairs Found:", Optional.empty())).get();
        pairsPanel.add(pairsLabel);

        JLabel pairs = (new Txt("0/" + String.valueOf(deck.size() / 2), Optional.empty())).get();
        pairsPanel.add(pairs);
        boardControls.add(pairsPanel);

        // Time left
        JLabel timeLabel = (new Txt("Seconds Left:", Optional.of(new Color(242, 53, 91, 255)))).get();
        timePanel.add(timeLabel);

        time = (new Txt(String.valueOf(totalTime), Optional.of(new Color(242, 53, 91, 255)))).get();
        timePanel.add(time);
        boardControls.add(timePanel);

        timer = new Countdown(Integer.parseInt(time.getText()), time, pairs, frame, totalTime);
        timer.start();

        // Control buttons
        JButton restart = (new Btn("restart.png", 200, 80, Optional.empty(), Optional.of(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                timer.restart();
                pairs.setText("0/" + String.valueOf(deck.size() / 2));
                time.setText(String.valueOf(totalTime));
                deck.shuffle(cards, pairs);
            }
        }))).get();
        boardControls.add(restart);

        JButton quit = (new Btn("quit.png", 200, 80, Optional.empty(), Optional.of(new Quitter()))).get();
        boardControls.add(quit);

        deck = new Deck(cards, pairs);
        pairs.setText("0/" + String.valueOf(deck.size() / 2));
        
        // Final setup
        boardControls.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 4;
        c.fill = GridBagConstraints.BOTH;
        c.ipadx = 0;
        c.ipady = 0;
        c.insets = new Insets(0, 0, 0, 0);
        c.anchor = GridBagConstraints.LINE_START;
        c.weightx = 0;
        c.weighty = 0;
        board.add(boardControls);

        cards.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 4;
        c.gridheight = 4;
        c.fill = GridBagConstraints.BOTH;
        c.ipadx = 0;
        c.ipady = 0;
        c.insets = new Insets(0, 0, 0, 0);
        c.anchor = GridBagConstraints.CENTER;
        c.weightx = 0;
        c.weighty = 0;
        board.add(cards);

        board.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        frame.setContentPane(board);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new ChemInTheHouse();
    }
}
/*
REFERENCES:
- Insets(top, left, bottom, right)
- EmptyBorder(top, left, bottom, right)
- GridLayout(rows, cols, horGap, verGap)
- FlowLayout(align, horGap, verGap)
- c values do NOT reset after each Combonent added

TEMPLATES:
c.gridx = 
c.gridy = 
c.gridwidth = 
c.gridheight = 
c.fill = 
c.ipadx = 
c.ipady = 
c.insets = new Insets();
c.anchor = 
c.weightx = 
c.weighty = 
*/