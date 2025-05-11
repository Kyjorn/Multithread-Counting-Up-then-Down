package ThreadCounter;


public class Counter {
    
    //counts up to 20
    public void countUp () {
        System.out.println("Counting up...");
        for(int i = 1; i <= 20; i++){
            try {
                System.out.println(i);
            Thread.sleep(255);
        } catch (InterruptedException e) {
            
        }
        }
        
    }



    //counts down from 20
    public void countDown () {
        System.out.println("Counting down...");
        for(int i = 20; i >= 1; i--){
            try {
                System.out.println(i);
            Thread.sleep(255);
        } catch (InterruptedException e) {
            
        }
        }
        System.out.println("Count completed.");
        
    }
}
