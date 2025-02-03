import java.awt.Color;
import java.awt.Font;
import java.util.Optional;

import javax.swing.JLabel;

public class Txt {
    JLabel txt;

    public Txt(String content, Optional<Color> color) {
        // Large center-aligned labels
        txt = new JLabel(content);
		txt.setFont(new Font("Sans-serif", Font.PLAIN, 30));
        color.ifPresent(clr -> txt.setForeground(clr));
		txt.setHorizontalAlignment(JLabel.CENTER);
    }

    public JLabel get() {
        return txt;
    }
}