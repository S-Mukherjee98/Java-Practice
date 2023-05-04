//By extending the thread class

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread 1 is Running ..... ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Thread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread 2 is Running ....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Thread1 {
    public static void main(String[] args) {
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t2.start();
        t3.start();
    }
}