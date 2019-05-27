
import java.util.*;

public class k3 extends Problem{
    static String prob="A ball has been thrown down from a building with initial velocity 4 m/s. How far has it traveled over 5 seconds?\n Round to the nearest hundredth.";
    private  double solution;


    public k3(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double sol=vars.get(0)*vars.get(1)+ 4.9*Math.pow(vars.get(1),2);
        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=10;
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


