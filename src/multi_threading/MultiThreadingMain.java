package multi_threading;

public class MultiThreadingMain {
    public static void main(String[] arg) throws InterruptedException {
//        MultiThreading thread1 = new MultiThreading();
//        MultiThreading thread2 = new MultiThreading();

        // calling run directly is just going to execute first then go the the second run
        // that is not exactly multi threading now is it
//        thread1.run();
//        thread2.run();

        //this is the actual threading
//        thread1.start();
//        thread2.start();

//      // branch off and start executing a task in parallel and while the task is executing
        // come back to the main branch see the next line of code and execute it
//        thread1.start();
//        thread2.run();

        // creating three threads that count from 1 through five simultaneously
        for (int i = 1; i <=3; i++){
            MultiThreading thread = new MultiThreading(i);
            // if you want to implement the runnable interface instead of extending thread
//            Thread newThread = new Thread(thread);
//            newThread.start();
            thread.start();
//            thread.join();
        }
//        throw new RuntimeException();
    }
}
