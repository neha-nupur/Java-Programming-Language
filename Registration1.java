import java.awt.*;

class Registration1 extends Frame {
    
    Label lb1 = new Label("Name");
    Label lb2 = new Label("Course");
    Label lb3 = new Label("password");
    Label lb = new Label("Registration Form");
    TextField tf1 = new TextField(20);
    TextField tf2 = new TextField(20);
    TextField tf3 = new TextField(20);
    Button btn1 = new Button("Submit");
    Button btn2 = new Button("Reset");

    Registration1() {
        super();
        setLayout(null);
        setFont(new Font("Arial", Font.BOLD, 20));

        lb.setBounds(150, 50, 200, 40);
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
        Registration1 R = new Registration1();
    }

}
