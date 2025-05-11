package ThreadCounter;

public class Main {
    
    public static void main(String[] args) {
        
        //initialize counters
        Counter cUp = new Counter(); //initalizes an up counter
        Counter cDown = new  Counter(); //initializes a down counter

        //calls to 'Counter'
        cUp.countUp();
        cDown.countDown();
    }
}
