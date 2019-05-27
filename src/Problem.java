
//General problem outline

import java.util.*;
import java.io.*;
public abstract class Problem {

    protected String text;

    protected ArrayList<Double> vars;

   public Problem(String str){


       text=str;
        vars=parse(str);


   }
    //finds numbers and replaces them, creates a dynamic array to hold all these numbers
   public ArrayList<Double> parse(String str){

       str = str.replaceAll(" [-+]?[0-9]*\\.?[0-9]", " TBD");

        text=str;


        ArrayList<Double> vals=new ArrayList<Double>();

       String a[] = str.split(" ");



       for (int i = 0; i < a.length; i++)
       {

           if (("TBD").equals(a[i]))

               vals.add((double)0);
       }

       return vals;
   }
    //abstract method to be implemented based on type of problem
    public abstract double solve();
   // abstract method to randomize the values of the arraylist
    public abstract  void randomize();
    //print out the problem
    public String toString(){



        return text;


    }





}
