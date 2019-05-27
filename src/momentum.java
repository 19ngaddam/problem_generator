import java.util.ArrayList;
import java.util.Arrays;

public class momentum implements problemset {

    static int numprobs=7;
    private ArrayList<Problem> problems;

    private int score;
    private int attempts;


    private m1 prob1;
    private m2 prob2;
    private m3 prob3;
    private m4 prob4;
    private m5 prob5;
    private m6 prob6;
    private m7 prob7;

    public momentum(){

        prob1= new m1();
        prob2= new m2();
        prob3 =new m3();
        prob4= new m4();
        prob5= new m5();
        prob6= new m6();
        prob7=new m7();

        problems=new ArrayList<Problem>(Arrays.asList(prob1,prob2,prob3,prob4,prob5,prob6,prob7));

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
