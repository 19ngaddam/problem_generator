import java.util.ArrayList;
import java.util.Arrays;

public class forces implements problemset {

    static int numprobs=13;
    private ArrayList<Problem> problems;

    private int score;
    private int attempts;

    private f1 prob1;
    private f2 prob2;
    private f3 prob3;
    private f4 prob4;
    private f5 prob5;
    private f6 prob6;
    private f7 prob7;
    private f8 prob8;
    private f9 prob9;
    private f10 prob10;
    private f11 prob11;
    private f12 prob12;
    private f13 prob13;
    public forces(){

        prob1= new f1();
        prob2= new f2();
        prob3 =new f3();
        prob4= new f4();
        prob5= new f5();
        prob6= new f6();
        prob7= new f7();
        prob8= new f8();
        prob9= new f9();
        prob10= new f10();
        prob11= new f11();
        prob12= new f12();
        prob13=new f13();
        problems=new ArrayList<Problem>(Arrays.asList(prob1,prob2,prob3,prob4,prob5,prob6,prob7,prob8,prob9,prob10,prob11,prob12,prob13));

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
