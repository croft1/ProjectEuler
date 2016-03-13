/**
 * Created by Michaels on 13/3/2016.
 */
public class mult3and5counting {


    public int mult3and5counting(int cap){ //Euler problem 1
        int sum = 0;
        for(int i = 0; i < cap; i++)
            if ((i % 3) == 0 || (i % 5) == 0) {
                sum += i;
            }


        return sum;
    }


}
