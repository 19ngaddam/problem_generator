
import java.util.*;

public class w6 extends Problem{
    static String prob="A box of mass 1 kg is pushed at constant acceleration from rest to velocity 1 m/s in 1 seconds. How much work is done on the box? Round to the nearest hundredth.";
    private  double solution;


    public w6(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double m=vars.get(0);
        double vf=vars.get(1);
        double t=vars.get(2);


        double sol=Math.pow(vf,2)*m/2.0;

        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=1;
        double rangeMax=32;
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


