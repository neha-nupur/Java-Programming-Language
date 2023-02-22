import java.awt.*;
import javax.swing.*;

class SwingRadio extends JFrame{
    JRadioButton rb1 = new JRadioButton("Male");
    JRadioButton rb2 = new JRadioButton("Female");
    ButtonGroup bg = new ButtonGroup();

    SwingRadio() {
        setLayout(new FlowLayout());
        bg.add(rb1);
        bg.add(rb2);
        add(rb1);
        add(rb2);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String args[]) {
        new SwingRadio();
    }
    
}
