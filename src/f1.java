
import java.util.*;

public class f1 extends Problem{
    static String prob="A block has mass 2 kg. What is its weight? Round to the nearest hundredth.";
    private  double solution;


    public f1(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {



        double sol=vars.get(0)*9.8;

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


