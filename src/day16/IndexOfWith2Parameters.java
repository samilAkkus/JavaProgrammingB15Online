package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {

        //              012345678901234567890123456789012
        String name =  "I love Java I love Java Java Java";

        //get the second java from sentence
        //assume u already know there are 4 java in this sentence
        //second java means----the java show up after first java

        //first find out where is location of the first java showed up
        //in order to find second one,
        //instead of searching from beginning
        //search from right after the location u found first java
        //then it will gi ve u the index of second java

        //BUT HOW DO I START FROM DIFFERENT LOCATION WHEN USING INDEX OF
        //BECAUSE INDEX OF ALWAYS STARTS FROM BEGINNING

        //indexOf method has 2 version 1 expect 1 external data
        //another expect 2 external data---- yourString.indexOf("l",3)---> search l after starting from 3!!!

        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java",8));
        System.out.println(name.indexOf("Java",20));
        System.out.println(name.indexOf("Java",25));
        System.out.println(name.indexOf("Java",30));

        int firstJavaLocation = name.indexOf("Java");///location of first java---7

        //starting point can be right after the index of first character of the word
        //or u can start write after you finish the word you are searching, for the word java--- +4
        //if we do not know the length of the word--- +word.length()

        int startingPointToSearchSecondJava = firstJavaLocation + 1;

        int secondJavaLocation = name.indexOf("Java",startingPointToSearchSecondJava);

        System.out.println("secondJavaLocation = " + secondJavaLocation);

        //find second word

        int firstSpace = name.indexOf(" ");

        int secondSpace = name.indexOf(" ",firstSpace+1);

        String secondWord = name.substring(firstSpace+1,secondSpace);

        System.out.println(secondWord);



    }
}
