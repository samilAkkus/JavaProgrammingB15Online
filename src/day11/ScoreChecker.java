package day11;

import java.util.jar.JarOutputStream;

public class ScoreChecker {
    public static void main(String[] args) {


        //create a program to check the score
        //create a variable called score and assign a value of your choice
        //if the score is less than 0 or more than 100----invalid score
        //if the score is 100----perfect score
        //if the score is between 70 and 100 than say---you have passed
        //else you have failed

        int score = 110;

        if(score < 0 || score > 100){
            System.out.println("invalid score");
        }else{
            if(score==100){
                System.out.println("perfect score");
            }else{
                if(score > 70 && score < 100){
                    System.out.println("you have passed");
                }else{
                    System.out.println("you have failed");
                }

            }
        }
    }
}
