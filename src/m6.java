
import java.util.*;

public class m6 extends Problem{
    static String prob="One ball of mass 2 kg is moving at 2 m/s while another ball with mass 2 kg is also in motion. \n" +
            "If the balls collide elastically and the first ball is now going at 2 m/s, and the other ball is now going at 2 m/s, what is the initial velocity of the other ball?  Round to the nearest hundredth.";
    private  double solution;


    public m6(){


        super(prob);


        randomize();


        solution=solve();



    }


    public double solve() {
        double m1=vars.get(0);
        double v1i=vars.get(1);

        double m2=vars.get(2);

        double v1f=vars.get(3);
        double v2f=vars.get(4);



        double sol=(m2*v2f+m1*v1f-m1*v1i)/m2;

        sol=  Math.round(sol*100.0)/100.0;
        solution=sol;
        return sol;
    }

    public void randomize(){
        Random r = new Random();
        double rangeMin=5;
        double rangeMax=25;
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


