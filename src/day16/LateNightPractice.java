package day16;

public class LateNightPractice {
    public static void main(String[] args) {

        //              012345678901234567890123456789012
        String name =  "I love Java I love Java Java Java";

        //find first java location
        //find second java location
        //find second word location

        int firstJavaLocation = name.indexOf("Java");

        System.out.println(firstJavaLocation);

        int secondJavaLocation = name.indexOf("Java",firstJavaLocation+1);

        System.out.println("secondJavaLocation = " + secondJavaLocation);

        int thirdJavaLocation = name.indexOf("Java",secondJavaLocation+1);

        System.out.println("thirdJavaLocation = " + thirdJavaLocation);

        ////////////////////////////////////////////////////////////////////

        int secondWordLocationStart = name.indexOf(" ")+1;

        System.out.println("secondWordLocationStart = " + secondWordLocationStart);

        int secondWordLocEnd = name.indexOf(" ",secondWordLocationStart);

        System.out.println("secondWordLocEnd = " + secondWordLocEnd);

        System.out.println(name.substring(secondWordLocationStart,secondWordLocEnd));

        //////////////////////////////////////////////////////////////////////////////









    }
}
