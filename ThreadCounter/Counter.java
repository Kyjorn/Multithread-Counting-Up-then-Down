package ThreadCounter;


public class Counter {
    
    //counts up to 5
    public void countUp () {
        System.out.println("Counting up...");
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
    }



    //counts down from 5
    public void countDown () {
        System.out.println("Counting down...");
        for(int i = 5; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("Count completed.");
        
    }
}
