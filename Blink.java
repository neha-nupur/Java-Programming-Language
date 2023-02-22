import java.awt.*;

class Blink extends Frame implements Runnable {
    Thread th;
    Label lb = new Label("Good Morning");
    int x;

    Blink() {
        setLayout(new FlowLayout());
        setFont(new Font("Arial", Font.BOLD, 30));
        setForeground(Color.red);
        add(lb);
        setSize(500, 500);
        setVisible(true);
        x = 0;
        th = new Thread(this);
        th.start();
    }

    public void run() {
        while(true) {
            if(x == 1) {
                lb.setVisible(false);
                x = 0;
            }
            else if(x == 0);
                lb.setVisible(true);
                x = 1;

        try{
            Thread.sleep(100);
        }

        catch(InterruptedException e) {} 
        }
    }

    public static void main(String args[]) {
        new Blink();
    }

}


