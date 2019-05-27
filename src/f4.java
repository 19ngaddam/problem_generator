
import java.util.*;

public class f4 extends Problem{
    static String prob="Two cords with the same angle 23 ° are holding up a block of mass 1 kg. what is the tension in each cord? Round to the nearest hundredth.";
    private  double solution;


    public f4(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {

        double t=vars.get(0);
        double m=vars.get(1);

        double sol=m*9.8/(2*Math.sin(Math.toRadians(t)));

        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=5;
        double rangeMax=90;
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


