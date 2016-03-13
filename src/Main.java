/**
 * Created by Michaels on 8/3/2016.
 */

public class Main {

    long timer;

    public static void main(String [] args){

        Main s = new Main();

        System.out.println();
        //System.out.println("Sum of multiples of 3 and 5 is " +  s.mult3and5counting(1000));
        //System.out.println("Sum of fib up to 4 million is " + s.sumEvenFibonacci(4000000));
        long primeFactorTarget = 600_851_475_143L;
        System.out.println("Largest prime factor: " + s.primeFactor(primeFactorTarget));





    }

    public long primeFactor(long n){
        int a = 0;
        for( int i = 2; i < n; i++)
            if(isPrime(i) && n%i == 0) {
                System.out.println(i + " is a factorial prime");
                a = i;
            }

        return a;
    }
    public int mult3and5counting(int cap){ //Euler problem 1
        int sum = 0;
        for(int i = 0; i < cap; i++)
            if ((i % 3) == 0 || (i % 5) == 0) {
                sum += i;
            }


        return sum;
    }
    public long sumEvenFibonacci(int cap){  //Euler problem 2

        long previous = 1;
        long total = 0;
        long current;

        for( current = 1; current < cap; total = total + 0){
            if(detectEvenNumber(current + previous)){
               total += (current+previous);
               System.out.println("+++++++++++++ \n Total: " + total);
           }
            System.out.println("Current: " + current);
            current = current + previous;
            previous = current - previous;


        }

        return total;
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
    public boolean isPrime(long i){
        for(int c = 2; c < i; c++){
            if(i%c==0)
                return false;
            else
                return true;
        }
        return false;
    }

}
