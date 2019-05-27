
import java.util.*;

public class m2 extends Problem{
    static String prob="One ball of mass 1 kg is moving at 1 m/s which collides with another ball of mass 1 kg moving at 1 m/s. \n" +
            " If the two balls collide inelastically, what is the velocity of the new system? Round to the nearest hundredth.";
    private  double solution;


    public m2(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double m1=vars.get(0);
        double v1=vars.get(1);
        double m2=vars.get(2);
        double v2=vars.get(3);



        double sol=(m1*v1+m2*v2)/(m1+m2);

        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=10;
        double rangeMax=50;
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


