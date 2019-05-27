import java.util.ArrayList;
import java.util.Arrays;

public class work implements problemset {

    static int numprobs=9;
    private ArrayList<Problem> problems;

    private int score;
    private int attempts;

    private w1 prob1;
    private w2 prob2;
    private w3 prob3;
    private w4 prob4;
    private w5 prob5;
    private w6 prob6;
    private w7 prob7;
    private w8 prob8;
    private w9 prob9;
    public work(){

        prob1= new w1();
        prob2= new w2();
        prob3 =new w3();
        prob4= new w4();
        prob5= new w5();
        prob6= new w6();
        prob7= new w7();
        prob8= new w8();
        prob9= new w9();
        problems=new ArrayList<Problem>(Arrays.asList(prob1,prob2,prob3,prob4,prob5,prob6,prob7,prob8,prob9));
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
