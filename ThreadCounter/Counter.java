package ThreadCounter;


public class Counter {
    
    //counts up to 20
    public void countUp () {
        System.out.println("Counting up...");
        for(int i = 1; i <= 20; i++){
            System.out.println(i);
        }
    }



    //counts down from 20
    public void countDown () {
        System.out.println("Counting down...");
        for(int i = 20; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("Count completed.");
        
    }
}
