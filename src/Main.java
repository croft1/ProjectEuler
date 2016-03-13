/**
 * Created by Michaels on 8/3/2016.
 */
import java.util.ArrayList;

public class Main {

    long timer;


    public static void main(String [] args){

        Main s = new Main();

        System.out.println();
    }




    public void resetTimer(){        timer = 0;   }
    public void startTimer(){        timer = System.currentTimeMillis();   }
    public void endTime(){
        long timerEnd = System.currentTimeMillis();
        timer = timerEnd - timer;

    }
    public long getTimer(){ return timer;}

}
