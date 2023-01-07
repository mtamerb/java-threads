public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.activeCount());
        Thread.currentThread().setName("Main Thread");
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().isAlive());

        for (int i = 6; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Done!");


        SecondThread secondThread = new SecondThread();
    /*    secondThread.start();
        System.out.println("second thread is alive?: " + secondThread.isAlive());

        System.out.println(secondThread.getName());

        System.out.println("priority: " + secondThread.getPriority());*/

        secondThread.setDaemon(true);
        System.out.println(secondThread.isDaemon());
        secondThread.start();


    }
}