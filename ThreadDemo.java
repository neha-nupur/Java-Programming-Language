class ThreadDemo extends Thread {
    Thread th;
    ThreadDemo() {
        th = new Thread(this);
        th.start();
    }

    public void run() {
        while(true) {
            System.out.println("I am child thread");

            try {
                Thread.sleep(1000);
            }

            catch(InterruptedException e) {}
        }
    }

    public static void main(String args[]) {
        new ThreadDemo();

        System.out.println("I am main thread");
    }
}