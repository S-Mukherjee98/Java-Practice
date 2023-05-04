public class Thread2 {

    public static void main(String[] args) {

        Runnable r1 = () -> {
            for (int i = 0; i < 15; i++) {
                System.out.println("Thread 1 is Running Now ......");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Runnable r2 = () -> {

            for (int i = 0; i < 15; i++) {
                System.out.println("Thread 2 is Running ######");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Runnable r3 = () -> {

            for (int i = 0; i < 15; i++) {

                System.out.println("Threa 3 is Running ------");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }

}
