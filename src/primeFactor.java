import java.util.ArrayList;

/**
 * Created by Michaels on 13/3/2016.
 */

public class primeFactor {

    ArrayList<Long> primeNumberList = new ArrayList<Long>();
    long primeFactorTarget = 600_851_475_143L;

    //Working solution
    public long primeFactor(long Tn) {
        int a = 0;
        //findPrimes(n);
        for (long i = 2; i < Math.sqrt(Tn); i++) {

            if(Tn % i == 0) {
                Tn = Tn / i;

            }
        }
        System.out.println(Tn);
        return (Tn);
    }


    //WIP

    public boolean isPrime(long i){
        for(int c = 2; c < (i/2); c++){
            if(i%c == 0)
                System.out.println(i + " is a prime ");
            return false;
        }
        return true;
    }


    public void fillPrimeNumberList(long max){

        for(long potentialPrime = 2; (potentialPrime*potentialPrime) <= max; potentialPrime++){
            if (potentialPrime <= 1 || potentialPrime % 2 == 0 || potentialPrime % 3 == 0){
                //false
            }else {
                if (potentialPrime <= 3) {
                    primeNumberList.add(potentialPrime);
                }
            }
            int i = 5;
            while(i*i <= max){
                if(potentialPrime % i == 0 && (potentialPrime % (i + 2)) == 0 ){
                    //false
                }
                else{
                    System.out.println("Prime is " + potentialPrime);
                    primeNumberList.add(potentialPrime);
                }


            }

        }


    }




}
