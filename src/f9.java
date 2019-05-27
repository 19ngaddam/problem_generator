
import java.util.*;

public class f9 extends Problem{
    static String prob="A person pulls a block of mass 2 kg with a rope, using 2 N of force, causing it to accelerate at 2 m/s^2. \n" +
            " The box has a coefficient of friction 2 . What angle is the person pulling on the rope? Round to the nearest hundredth.";
    private  double solution;


    public f9(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double m=vars.get(0);
        double F=vars.get(1);
        double a=vars.get(2);
        double u=vars.get(3);




        double sol=(m*a-u*m*9.8)/F;
        sol=Math.toDegrees(Math.acos(sol));
        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=10;
        double rangeMax=20;
        for(int i=0; i<vars.size();i++){


            double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
            randomValue=Math.round(randomValue*100.0)/100.0;
            vars.set(i,randomValue);
        }
        rangeMin=1;
        rangeMax=2;
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        randomValue=Math.round(randomValue*100.0)/100.0;
        vars.set(3,randomValue);

        rangeMin=2;
        rangeMax=7;
        randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        randomValue=Math.round(randomValue*100.0)/100.0;
        vars.set(2,randomValue);

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


