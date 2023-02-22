import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame implements KeyListener {
    Label lb = new Label("Press F1 to change colour");
    TextField tf = new TextField(40);
    int x;
    KeyEventDemo() {
        setLayout(new FlowLayout());
        setFont(new Font("Arial", Font.BOLD, 25));
        add(tf);
        add(lb);
        tf.addKeyListener(this);
        setSize(400, 400);
        setVisible(true);
        x = 0;
    }

    public void KeyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_F1)
            if(x == 0) {
                tf.setForeground(Color.red);
                x = 1;
            }
            else if(x == 1) {
                tf.setForeground(Color.green);
                x = 2;
            }
            else if(x == 2) {
                tf.setForeground(Color.blue);
                x = 0;
            }
    }      
    
    public void KeyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public static void main(String args[]) {
        new KeyEventDemo();
    }
}
