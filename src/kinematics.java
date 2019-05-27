import java.util.ArrayList;
import java.util.Arrays;

public class kinematics implements problemset {

    static int numprobs=12;
    private ArrayList<Problem> problems;

    private int score;
    private int attempts;

    private k1 prob1;
    private k2 prob2;
    private k3 prob3;
    private k4 prob4;
    private k5 prob5;
    private k6 prob6;
    private k7 prob7;
    private k8 prob8;
    private k9 prob9;
    private k10 prob10;
    private k11 prob11;
    private k12 prob12;


    public kinematics(){

        prob1= new k1();
        prob2= new k2();
        prob3 =new k3();
        prob4= new k4();
        prob5= new k5();
        prob6= new k6();
        prob7= new k7();
        prob8= new k8();
        prob9= new k9();
        prob10= new k10();
        prob11= new k11();
        prob12= new k12();

        problems=new ArrayList<Problem>(Arrays.asList(prob1,prob2,prob3,prob4,prob5,prob6,prob7,prob8,prob9,prob10,prob11,prob12));

        score=0;
        attempts=0;


    }
    public String checkAnswer(double input){

        Problem currproblem=problems.get(attempts);

        String response="";
        if(input==currproblem.solve()){
            response="correct";
            score++;


        }

        else{
            response="Wrong, the answer is "+ currproblem.solve();

        }
        attempts++;



        return response;


    }

    @Override
    public String displayProblem() {
        return problems.get(attempts).toString();
    }

    public boolean isFinished(){

        if(attempts==numprobs){
            return true;

        }
        return false;

    }
    public String displayScore(){

        return ""+score+" / "+ attempts;


    }



}
