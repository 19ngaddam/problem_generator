
import java.util.*;

public class k4 extends Problem{
    static String prob="A ball has been thrown straight down with initial velocity 12 m/s, and has fallen a distance 1 m. How much time has it taken to do so? Round to the nearest hundredth.";
    private  double solution;


    public k4(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double sol=(-1*vars.get(0)+ Math.pow(Math.pow(vars.get(0),2)+2*9.8*vars.get(1),0.5))/9.8;
        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=10;
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


