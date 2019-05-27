
import java.util.*;

public class k2 extends Problem{
    static String prob="A ball is dropped from a 12 m high building. How long does it take to reach the ground? Round to the nearest hundredth.";
    private  double solution;


    public k2(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double sol=Math.pow(2*vars.get(0)/9.8,0.5);
        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=20;
        double rangeMax=70;
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


