public class Main {
    public static void main(String[] args) {

        System.out.println(Thread.activeCount());
        Thread.currentThread().setName("Main Thread");
        System.out.println(Thread.currentThread().getName());
    }
}