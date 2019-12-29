package a_replit;

import java.util.Scanner;

public class MethodsSplitPerson_153 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;

    }

    public static void person(String info){

        System.out.println("person name: "+info.split(",")[0]+" last name: "+
                info.split(",")[1]+" age: "+info.split(",")[2]);



    }
}
