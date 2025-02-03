import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.Optional;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Btn {
    JButton btn;

    public Btn(String img, int w, int h, Optional<String> description, Optional<ActionListener> listen) {
        // Buttons from images with transparent backgrounds
        btn = new JButton(new ImageIcon(new ImageIcon("assets/img/" + img).getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH)));
        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        description.ifPresent(d -> ((ImageIcon)btn.getIcon()).setDescription(d));
        listen.ifPresent(l -> btn.addActionListener(l));
    }

    public JButton get() {
        return btn;
    }

    public void set(String img, int w, int h, String description) {
        btn.setIcon(new ImageIcon(new ImageIcon("assets/img/" + img).getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH), description));
    }
}