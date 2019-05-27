
import java.util.*;

public class f7 extends Problem{
    static String prob="A truck of mass 1 kg accelerating at 1 m/s^2 hits a fat bug of mass 1 kg. What is the bug’s acceleration? Round to the nearest hundredth.";
    private  double solution;


    public f7(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {

        double m1=vars.get(0);
        double a1=vars.get(1);
        double m2=vars.get(2);


        double sol=m1*a1/m2;

        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=5;
        double rangeMax=30;
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


