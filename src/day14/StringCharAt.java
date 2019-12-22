package day14;

public class StringCharAt {

    public static void main(String[] args) {


        //charAt will return a character at certain location

        String name = "Samil";

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));

        String aName = "Arya";

        char c1 = aName.charAt(0);
        char c2 = aName.charAt(1);
        char c3 = aName.charAt(2);
        char c4 = aName.charAt(3);

        // A r y a ---- I want this

        System.out.println(c1+" "+c2+" "+c3+" "+c4);
        System.out.println(""+c1+c2+c3+c4);
    }
}
