package day17;

public class NamePrinterWithWhileLoop {

    public static void main(String[] args) {


        String name = "Alexander";

        //get each and every character and print them out vertically

//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(4));
//        System.out.println(name.charAt(5));
//        System.out.println(name.charAt(6));
//        System.out.println(name.charAt(7));
//        System.out.println(name.charAt(8));

//        int x = 0;
//
//        System.out.println(name.charAt(x));
//
//        ++x;
//
//        System.out.println(name.charAt(x));
//
//        ++x;
//
//        System.out.println(name.charAt(x));

        int x = 0;

        while(x < name.length()){

            System.out.print("index "+ x + " : "); //index 0 : A
            System.out.println(name.charAt(x));    //index 1 : l
            ++x;
        }




    }
}
