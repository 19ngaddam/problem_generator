
import java.util.*;

public class m7 extends Problem{
    static String prob="A bullet of mass 3 kg flying at velocity 2 m/s collides and buries itself into a hanging block of mass 2 kg. \n" +
            "What is the change in height of the block after the bullet collides into it? Round to the nearest hundredth.";
    private  double solution;


    public m7(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
      double m1=vars.get(0);
      double vi=vars.get(1);
      double m2=vars.get(2);




        double sol=(m1*Math.pow(vi,2)/(2*9.8*(m1+m2)))*(1.0-m1/(m1+m2));
        ;

        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=5;
        double rangeMax=60;
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


