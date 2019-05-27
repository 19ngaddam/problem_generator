
import java.util.*;

public class w7 extends Problem{
    static String prob="A box of mass 1 kg is pulled with a force 1 N at an angle of  1 ° for 1 seconds. \n" +
            "The box has a coefficient of friction 1 . How much work has been done on the box? Round to the nearest hundredth.";
    private  double solution;


    public w7(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double m=vars.get(0);
        double F=vars.get(1);
        double a=vars.get(2);
        double t=vars.get(3);
        double u=vars.get(4);


        double sol=Math.pow(t,2)*(Math.pow((F*Math.cos(Math.toRadians(a))-u*m*9.8),2))/(2*m);
        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=10;
        double rangeMax=100;
        for(int i=0; i<vars.size();i++){


            double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
            randomValue=Math.round(randomValue*100.0)/100.0;
            vars.set(i,randomValue);
        }

         rangeMin=1;
         rangeMax=90;
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        randomValue=Math.round(randomValue*100.0)/100.0;
        vars.set(2,randomValue);

        rangeMin=1;
        rangeMax=2;
         randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        randomValue=Math.round(randomValue*100.0)/100.0;
        vars.set(4,randomValue);

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


