package day21;

public class WakeUpTask1_NamePrinter {

    public static void main(String[] args) {


        // give your name store it in a variable myName as String for ex
        //"My name is ........."

        //1, loop through each and every character print them out like this
        // M->y-> >n->a->m->e-> and so on
        //put arrow in between the characters

        //print the sentence by 2 character at a time just by incrementing by 1
        //print the sentence by 3 character at a time
        //print the sentence by 4 character at a time

        String myName = "imamhatiplerkapatilsin";

        for (int x = 0; x <= myName.length()-1 ; x++) {

            System.out.print(myName.substring(x,x+1)+"->");

        }
        System.out.println();

        for (int i = 0; i <=myName.length()-2 ; i++) {

            System.out.print(myName.substring(i,i+2)+ "->");

        }
        System.out.println();

        for (int k = 0; k <=myName.length()-3 ; k++) {

            System.out.print(myName.substring(k,k+3)+"->");

        }


    }
}
