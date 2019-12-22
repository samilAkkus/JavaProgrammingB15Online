package day14;

public class IndexOfPractice {
    public static void main(String[] args) {


        // indexOf--->> find out index of another String inside this String
            //         012345678901 ////space counted as character
        String name = "Game of Java";  //character(length) count is 12,, last character index is 11
        //find out the location of Java
        //find out the location of letter o
        //find out the location of first space

        System.out.println(name.indexOf("Java")); //8

        System.out.println(name.indexOf("o")); //5

        // if u have -1 it means you dont have

        System.out.println(name.indexOf("O")); // -1

        System.out.println(name.indexOf(" ")); //1
//////////////////////////////////////////////////////////////////////////////

        // if finds out last location of characters
        System.out.println(name.lastIndexOf("a"));

        System.out.println(name.lastIndexOf(" "));

        System.out.println(name.lastIndexOf("Ga"));

        ///////////////////////////////////////////////////////

        if(name.indexOf("Kawa") != -1){
            System.out.println("");


        }

    }
}
