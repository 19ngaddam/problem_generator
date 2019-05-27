
import java.util.*;

public class k12 extends Problem{
    static String prob="A ball is shot from height 1 m with angle 2 ° and velocity 2 m/s. What is the magnitude of the total velocity upon impact? Round to the nearest hundredth.";
    private  double solution;


    public k12(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {

        double vi=vars.get(2);
        double h=vars.get(0);
        double t=vars.get(1);

        double sol=Math.pow((Math.pow(vi,2) + 2*9.8*h),0.5);

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


