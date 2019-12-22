package day14;

public class StringReview {
    public static void main(String[] args) {


        String str = "I like Pumpkin";

        System.out.println(str.equals("Pumpkin"));

        // contains :
        // it checks whether a string exists in another string
        // return true or false result

        System.out.println("does it contain Pumpkin:");

        System.out.println(str.contains("Pumpkin"));
                            //true
        boolean gotPumpkin = str.contains("Pumpkin");

        System.out.println("gotPumpkin = " + gotPumpkin); // soutv

        // startsWith // endsWith
        //check whether a String start with another String
        //check whether a String end with another String
        //and return true or false result

        boolean startedWithI = str.startsWith("I");

        System.out.println("startedWithI = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");

        System.out.println("endWithPumpkin = " + endWithPumpkin);


    }
}
