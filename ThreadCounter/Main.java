package ThreadCounter;

public class Main {
    
    public static void main(String[] args) {
        
        //initialize counters
        Counter cUp = new Counter(); //initalizes an up counter
        Counter cDown = new  Counter(); //initializes a down counter

        //thread for counting up
        Thread c1 = new Thread(new Runnable() {
            @Override
            public void run () {
                cUp.countUp();
            }
        });

        //thread for counting down
        Thread c2 = new Thread(new Runnable() {
            @Override
            public void run () {
                cUp.countDown();
            }
        });

        //calls to run threads
        c1.start();
            try { //waits for the first thread to finish befor moving to the next
                c1.join();
            } catch (Exception e) {
            }
        
        c2.start();

       
    }
}
