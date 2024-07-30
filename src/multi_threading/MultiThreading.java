package multi_threading;

public class MultiThreading extends Thread{
//public class MultiThreading implements Runnable{
    private int threadNumber;
    public MultiThreading(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for(int i = 1; i <=5; i++){
            System.out.println(i + " From Thread Number " + threadNumber);
//            if(threadNumber == 3) {
//                throw new RuntimeException();
//            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
