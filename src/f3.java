
import java.util.*;

public class f3 extends Problem{
    static String prob="A block with mass 2 kg has friction force 23 N, what is its coefficient of friction? Round to the nearest hundredth.";
    private  double solution;


    public f3(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {



        double sol=vars.get(1)/vars.get(0)/9.8;

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


