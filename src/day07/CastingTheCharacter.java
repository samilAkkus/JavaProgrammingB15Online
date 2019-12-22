package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {


        char grade = 'B';

        System.out.println(grade);

        int letterInNumber = grade; // grade could be 'B' //

        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';

        System.out.println(letterInNumber2);

        ///////////////////////////////////////////////////////

        char myFirstChar = 100;

        System.out.println(myFirstChar);

        // find out your number of each char in your first name


        char myFirstChar1 = (char) 115;
        char myFirstChar2 = (char) 97;
        char myFirstChar3 = (char) 109;
        char myFirstChar4 = (char) 105;
        char myFirstChar5 = (char) 108;

        System.out.println(" " + myFirstChar1 + myFirstChar2);

        char letterA = 'a';

        System.out.println(letterA + 1); // adding a character to a int number will result in int//98

        System.out.println(" " + letterA + 1);








    }
}
