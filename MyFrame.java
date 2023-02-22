import java.awt.*;



// // Ques 1......................

// public class MyFrame {
//     public static void main(String args[]) {
//         Frame F = new Frame("This is my first frame");
//         F.setSize(300, 400);
//         F.setVisible(true);
//         F.setBackground(Color.yellow);
//         F.setResizable(false);
//     }
// }

// 2nd Method.........

class MyFrame extends Frame{
    MyFrame(String s) {
        super(s);
        setSize(300, 400);
        setVisible(true);
        setBackground(Color.yellow);
        setResizable(false);
    }

    public static void main(String args[]) {
        MyFrame F = new MyFrame("This is my First Frame");

    }
}