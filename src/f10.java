
import java.util.*;

public class f10 extends Problem{
    static String prob="A person pulls a block of mass 1 kg with a rope, using 1 N of force at an angle of  1 °, causing it to accelerate at 2 m/s^2. \n" +
            "What is the box’s coefficient of friction? Round to the nearest hundredth.";
    private  double solution;


    public f10(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double m=vars.get(0);

        double F=vars.get(1);
        double t=vars.get(2);
        double a=vars.get(3);


        double sol=(F*Math.cos(Math.toRadians(t))-m*a)/m/9.8;


        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=1;
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


