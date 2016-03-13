/**
 * Created by Michaels on 13/3/2016.
 */
public class sumEvenFib {

    public long sumEvenFib(int cap){  //Euler problem 2

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
}
