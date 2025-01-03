public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        QUEUEQ queue = new QUEUEQ();

        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);


        System.out.println(queue.Dequeue());


    }
}