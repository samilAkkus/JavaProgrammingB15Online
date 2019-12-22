package day17;

public class LateNightPractice {

    public static void main(String[] args) {

        // 01234567890
        // sAmiL akKus----Samil Akkus

        String fullName = "sAmiL akKus";

        String firstName = fullName.substring(0,fullName.indexOf(" "));

        System.out.println("firstName = " + firstName);

        String lastName = fullName.substring(fullName.indexOf(" ") +1);

        System.out.println("lastName = " + lastName);

        String firstNameCorrected = firstName.toUpperCase().charAt(0)+
                firstName.toLowerCase().substring(1);

        System.out.println("firstNameCorrected = " + firstNameCorrected);

        String lastNameCorrected = lastName.toUpperCase().charAt(0)+
                lastName.toLowerCase().substring(1);

        System.out.println("lastNameCorrected = " + lastNameCorrected);

        fullName = firstNameCorrected + " " + lastNameCorrected;

        System.out.println("fullName = " + fullName);



    }
}
