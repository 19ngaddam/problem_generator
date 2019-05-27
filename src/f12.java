
import java.util.*;

public class f12 extends Problem{
    static String prob="A person standing on a scale in an elevator accelerating at 2 m/s^2 sees the scale read 2 N. What is the person’s mass?\n Round to the nearest hundredth.";
    private  double solution;


    public f12(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {

        double a=vars.get(0);
        double F=vars.get(1);

        double sol= F/(9.8+a);

        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=5;
        double rangeMax=40;
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


