
import java.util.*;

public class w9 extends Problem{
    static String prob="A person is driving a car of mass 1 kg at velocity 1 m/s when they see a cop, so they slow down to 1 m/s. \n" +
            " How much work is done on the car during the deceleration? Round to the nearest hundredth.";
    private  double solution;


    public w9(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double m=vars.get(0);
        double vi=vars.get(1);
        double vf=vars.get(2);


        double sol=0.5*m*(Math.pow(vf,2)-Math.pow(vi,2));

        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=10;
        double rangeMax=320;
        for(int i=0; i<vars.size();i++){


            double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
            randomValue=Math.round(randomValue*100.0)/100.0;
            vars.set(i,randomValue);
        }
        rangeMin=5;
        rangeMax=10;
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        randomValue=Math.round(randomValue*100.0)/100.0;
        vars.set(2,randomValue);

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


