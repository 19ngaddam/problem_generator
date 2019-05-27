
import java.util.*;

public class w2 extends Problem{
    static String prob="A ball of mass 1 kg is drops from a height 1 m.What is the kinetic energy upon impact? Round to the nearest hundredth.";
    private  double solution;


    public w2(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double m=vars.get(0);
        double h=vars.get(1);


        double sol=m*9.8*h;

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


