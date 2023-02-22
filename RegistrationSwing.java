import java.awt.*;
import javax.swing.*;

class RegistrationSwing extends JFrame{
    JLabel lb1 = new JLabel("Name");
    JLabel lb2 = new JLabel("Course");
    JLabel lb3 = new JLabel("Password");
    JLabel lb = new JLabel("Registraion Form");
    JTextField tf1 = new JTextField(20);
    JTextField tf2 = new JTextField(20);
    JPasswordField tf3 = new JPasswordField(20);
    JButton btn1 = new JButton("Submit");
    JButton btn2 = new JButton("Reset");

    RegistrationSwing() {
        super();
        setLayout(null);
        lb1.setFont(new Font("Arial", Font.BOLD, 20));
        lb2.setFont(new Font("Arial", Font.BOLD, 20));
        lb3.setFont(new Font("Arial", Font.BOLD, 20));
        lb.setFont(new Font("Arial", Font.BOLD, 25));
        lb.setForeground(Color.red);
        lb.setBounds(150, 50, 230, 40);
        lb1.setBounds(80, 150, 100, 40);
        lb2.setBounds(80, 210, 100, 40);
        lb3.setBounds(80, 270, 100, 40);
        
        tf1.setBounds(220, 150, 150, 30);
        tf2.setBounds(220, 210, 150, 30);
        tf3.setBounds(220, 270, 150, 30);
        btn1.setBounds(110, 350, 100, 40);
        btn2.setBounds(240, 350, 100, 40);

        add(lb); add(lb1); add(lb2); add(lb3);
        add(tf1); add(tf2); add(tf3);
        add(btn1); add(btn2);
        tf3.setEchoChar('*');
        setBackground(Color.cyan);
        setForeground(Color.blue);
        setSize(500, 600);
        setVisible(true);
    }

    public static void main(String args[]) {
        RegistrationSwing R = new RegistrationSwing();
    }
    
}
