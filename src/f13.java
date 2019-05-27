
import java.util.*;

public class f13 extends Problem{
    static String prob="A person of mass 2 kg is standing on a scale in an elevator which reads at 2 N. What is the elevator’s acceleration? Round to the nearest hundredth.";
    private  double solution;


    public f13(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {

        double m=vars.get(0);
        double F=vars.get(1);

        double sol=(F-m*9.8)/m;

        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=20;
        double rangeMax=120;
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


