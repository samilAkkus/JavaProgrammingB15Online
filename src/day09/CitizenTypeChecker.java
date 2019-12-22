package day09;

public class CitizenTypeChecker {

    public static void main(String[] args) {

        // create a variable called citizenType as String
        // and create a variable with age
        // if the age is more than 65, assign value of citizenType to senior
        // if not assign value of citizenType to not-senior

        String citizenType;

        int age = 60;

        if(age>65){

            citizenType = "Senior";

        }else {

            citizenType = "Not-Senior";
        }

        System.out.println("The citizen age is " + age + " ,and he is a " + citizenType);



    }
}
