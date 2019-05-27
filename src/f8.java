
import java.util.*;

public class f8 extends Problem{
    static String prob="A person wants to pull a block of mass 2 kg which has a coefficient of friction 1.5 , using a rope at an angle of 3 °. \n" +
            "How much force should the person pull with to have an acceleration of 4 m/s^2? Round to the nearest hundredth.";
    private  double solution;


    public f8(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {

        double m=vars.get(0);
        double u=vars.get(1);
        double t=vars.get(2);

        double a=vars.get(3);

        double sol=(m*a-u*m*9.8)/Math.cos(Math.toRadians(t));

        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=10;
        double rangeMax=85;
        for(int i=0; i<vars.size();i++){


            double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
            randomValue=Math.round(randomValue*100.0)/100.0;
            vars.set(i,randomValue);
        }
        rangeMin=1;
        rangeMax=2;
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        randomValue=Math.round(randomValue*100.0)/100.0;
        vars.set(1,randomValue);

        rangeMin=2;
        rangeMax=7;
         randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        randomValue=Math.round(randomValue*100.0)/100.0;
        vars.set(3,randomValue);

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


