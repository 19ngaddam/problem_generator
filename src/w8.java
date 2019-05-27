
import java.util.*;

public class w8 extends Problem{
    static String prob="A box of mass 2 kg needs to be lifted 2 meters. An inclined plane of horizontal length 2 meters is used to push the box. \n" +
            " What is the average force needed to push the box up the incline? Round to the nearest hundredth.";
    private  double solution;


    public w8(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double m=vars.get(0);
        double y=vars.get(1);
        double x=vars.get(2);


        double sol=Math.pow((Math.pow(x,2)+Math.pow(y,2)),0.5);
        sol=m*9.8*y/sol;

        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=10;
        double rangeMax=50;
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


