
import java.util.*;

public class f6 extends Problem{
    static String prob="A force 2 N is applied to a block of mass 2 kg and with a coefficient of friction 2 , what is the acceleration of the block? Round to the nearest hundredth.";
    private  double solution;


    public f6(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {

        double F=vars.get(0);

        double u=vars.get(2);

        double m=vars.get(1);


        double sol=(F-u*m*9.8)/m;

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


