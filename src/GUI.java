import BreezySwing.*;


import javax.swing.*;


public class GUI extends GBFrame {


    //Buttons

    private JButton reset;

    private JButton unit1, unit2, unit3, unit4;

    private JButton submit;

    //Labels

    private JLabel AnswerLabel;

    private JLabel ProblemLabel;

    private JLabel ScoreLabel;

    //answer field
    private DoubleField answer;

    //score text box
    private JTextField score;

    //question dialog box

    private JTextArea problem;


    //problem sets
    private kinematics set1;
    private forces set2;
    private work set3;
    private momentum set4;

    private problemset currentset;

    public GUI() {


        AnswerLabel = addLabel("Answer", 5, 1, 1, 1);
        ProblemLabel = addLabel("Problem", 2, 1, 1, 1);
        ScoreLabel = addLabel("Score", 5, 3, 1, 1);


        answer = addDoubleField(0, 6, 1, 1, 1);

        problem = addTextArea("", 3, 1, 3, 2);

        score = addTextField("", 6, 3, 1, 1);


        unit1 = addButton("Kinematics", 1, 1, 1, 1);

        unit2 = addButton("Forces", 1, 3, 1, 1);
        unit3 = addButton("Work", 2, 1, 1, 1);
        unit4 = addButton("Momentum", 2, 3, 1, 1);


        submit = addButton("submit", 7, 1, 1, 1);

        reset = addButton("reset", 7, 3, 1, 1);

        //actual objects
        set1 = new kinematics();
        set2= new forces();
        set3= new work();
        set4=new momentum();
        //set the current set to the first one
        currentset = set1;


        score.setEditable(false);
        problem.setEditable(false);

        menuDisplays();

    }

    public void menuDisplays() {

        unit1.setVisible(true);
        unit2.setVisible(true);
        unit3.setVisible(true);
        unit4.setVisible(true);


        ProblemLabel.setVisible(false);

        problem.setText("");

        problem.setVisible(false);

        AnswerLabel.setVisible(false);
        answer.setNumber(0);

        answer.setVisible(false);

        submit.setVisible(false);

        ScoreLabel.setVisible(false);
        score.setText("");
        score.setVisible(false);

    }

    public void problemDisplay() {

        unit1.setVisible(false);
        unit2.setVisible(false);
        unit3.setVisible(false);
        unit4.setVisible(false);


        ProblemLabel.setVisible(true);
        problem.setVisible(true);

        AnswerLabel.setVisible(true);
        answer.setVisible(true);

        submit.setVisible(true);

        ScoreLabel.setVisible(true);
        score.setVisible(true);


    }


    public void buttonClicked(JButton b) {

        if (b == unit1) {

            problemDisplay();

            //adjust the currentset to the one selected
            currentset = set1;

            problem.setText(currentset.displayProblem());
        }
        if(b==unit2){

            problemDisplay();

            //adjust the currentset to the one selected
            currentset = set2;

            problem.setText(currentset.displayProblem());
        }
        if(b==unit3){

            problemDisplay();

            //adjust the currentset to the one selected
            currentset = set3;

            problem.setText(currentset.displayProblem());
        }
        if(b==unit4){

            problemDisplay();

            //adjust the currentset to the one selected
            currentset = set4;

            problem.setText(currentset.displayProblem());
        }
        if (b == submit) {
            //check if the answer they input is a double format or else throw exception
            double input = 0;
            try {
                if (answer.isValidNumber()) {

                    input = answer.getNumber();
                } else {
                    throw new Exception("Enter a valid number");

                }


                //textbox pop up with result and the answer is:

                String result = currentset.checkAnswer(input);
                messageBox(result);

             //   score.setText(currentset.displayScore());

                //check if finished
                boolean done = currentset.isFinished();
                //if so reset basically
                if (done) {
                    menuDisplays();
                    messageBox("Final score:" + currentset.displayScore());
                    //reset every single problem set object
                    set1 = new kinematics();
                    set2=new forces();
                    set3= new work();
                    set4=new momentum();

                } else {
                    //update to new problem
                    problem.setText(currentset.displayProblem());
                    //update the score
                    score.setText(currentset.displayScore());

                }

            } catch (Exception e) {
                messageBox(e.getMessage());
            }
        }
        //reset all the sets and the whole display
        if (b == reset) {

            menuDisplays();

            //reset every single problem set object
            set1 = new kinematics();
            set2= new forces();
            set3= new work();
            set4=new momentum();

        }


    }

    //Create GUI with specified dimensions
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        GUI GUI = new GUI();
        GUI.setTitle("Physics Problem Generator");
        GUI.setSize(800, 500);
        GUI.setVisible(true);

    }


}
