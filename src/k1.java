
import java.util.*;

public class k1 extends Problem{
    static String prob="A car constantly accelerates from 1 m/s to 1 m/s over 1 seconds, how far does it travel in that time? Round to the nearest hundredth.";
    private  double solution;


    public k1(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double sol=(vars.get(0)+ vars.get(1))*vars.get(2)/2.0;
        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=1;
        double rangeMax=10;
        for(int i=0; i<vars.size();i++){


            double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
            randomValue=Math.round(randomValue*100.0)/100.0;
            vars.set(i,randomValue);
        }


        int j=0;
        while(text.contains("TBD")){

            text=text.replaceFirst("TBD",""+vars.get(j));

            j++;

        }
    }
    public double getSolution(){

        return solution;
    }





}


