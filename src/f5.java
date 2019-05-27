
import java.util.*;

public class f5 extends Problem{
    static String prob="Two cords with maximum tension 12 N need to hold up a block of mass 3 kg. What angle should they be held at to support the mass? Round to the nearest hundredth.";
    private  double solution;


    public f5(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {



        double sol=Math.toDegrees(Math.asin(vars.get(1)*9.8/vars.get(0)));

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


