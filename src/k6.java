
import java.util.*;

public class k6 extends Problem{
    static String prob="A ball is shot from height 1 m with angle 2 ° and velocity 2 m/s. How high is the peak? Round to the nearest hundredth.";
    private  double solution;


    public k6(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double sol=Math.pow(vars.get(2),2)/9.8*(Math.sin(Math.toRadians(vars.get(1)))+0.5*Math.pow(Math.sin(Math.toRadians(vars.get(1))),2))+vars.get(0);
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


