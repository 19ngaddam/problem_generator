
import java.util.*;

public class f11 extends Problem{
    static String prob="A person of mass 12 kg is standing on a scale in an elevator. The elevator is accelerating at 12 m/s^2. What does the scale read as? Round to the nearest hundredth.";
    private  double solution;


    public f11(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {

        double m=vars.get(0);
        double a=vars.get(1);

        double sol=m*9.8+m*a;

        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=20;
        double rangeMax=30;
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


