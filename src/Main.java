/**
 * Created by Michaels on 8/3/2016.
 */
public class Main {

    long timer;

    public static void main(String [] args){

        Main s = new Main();

        //System.out.println("Sum of multiples of 3 and 5 is " +  s.mult3and5counting());
        System.out.println("Sum of fib up to 4 million is " + s.sumEvenFibonacci());






    }

    public int mult3and5counting(){
        int sum = 0;
        for(int i = 0; i < 1000; i++)
            if ((i % 3) == 0 || (i % 5) == 0) {
                sum += i;
            }


        return sum;
    }
    public long sumEvenFibonacci(){

        long previous = 0;
        long sum = 0;
        long current = 1;

        for( current = 1; current < 4000000; current += previous){
           if(detectEvenNumber(current)){
               sum += current;
               previous = current;
               System.out.println(sum);
           }
        }

        return sum;
    }



    public boolean detectEvenNumber(long n){
        boolean isEven = false;
        if((n % 2) == 0){
            isEven = true;
        }
        return isEven;
    }


    public void resetTimer(){        timer = 0;   }
    public void startTimer(){        timer = System.currentTimeMillis();   }
    public void endTime(){
        long timerEnd = System.currentTimeMillis();
        timer = timerEnd - timer;

    }

    public long getTimer(){ return timer;}


}
