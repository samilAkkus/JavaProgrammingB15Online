package day07;

public class LateNightExercise3_PrePostIncrement {

    public static void main(String[] args) {

        int score = 4;

        score = score + 1; //5

        score += 1; //6

        System.out.println(score);

        ++score; //7

        System.out.println(score);

        System.out.println(++score); //8

        score++; //9

        System.out.println(score);

        System.out.println(score++); // its 10 but it does not show it yet--9

        System.out.println(score); //10





    }
}
