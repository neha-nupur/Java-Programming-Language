import java.awt.*;

class Registration extends Frame {
    Label lb1 = new Label("Name");
    Label lb2 = new Label("Course");
    Label lb3 = new Label("Password");
    TextField tf1 = new TextField(20);
    TextField tf2 = new TextField(20);
    TextField tf3 = new TextField(20);
    Button btn1 = new Button("Submit");
    Button btn2 = new Button("Reset");
    Registration(String s) {
        super(s);
        setLayout(new GridLayout(4, 2, 10, 10));
        setFont(new Font("Arial", Font.BOLD, 20));
        add(lb1); add(tf1);
        add(lb2); add(tf2);
        add(lb3); add(tf3);
        add(btn1); add(btn2);
        tf3.setEchochar('*');
        setBackground(Color.cyan);
        setForegound(Color.blue);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String args[]) {
        Registration R = new Registration("Registration Form");
    }
}
