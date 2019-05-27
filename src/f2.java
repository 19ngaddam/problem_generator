
import java.util.*;

public class f2 extends Problem{
    static String prob="A block has mass 2 kg and coefficient of friction 1 . What is its friction force? Round to the nearest hundredth.";
    private  double solution;


    public f2(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {



        double sol=vars.get(0)*9.8*vars.get(1);

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


