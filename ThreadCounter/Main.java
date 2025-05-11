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

       
    }
}
