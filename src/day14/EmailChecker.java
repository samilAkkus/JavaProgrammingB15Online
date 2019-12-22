package day14;

public class EmailChecker {
    public static void main(String[] args) {


        //create a variable called email
        //check for below conditions
        //if it does not contain character @, say invalid email
        //if it contains space say invalid email
        //if it endsWith @gmail.com---gmail
        //if it endsWith @gmail.com---yahoo
        //if it endsWith @mail.ru---russian mail

        String email = "sdsdsd@gmail.com";

        boolean notContainSymbol = !email.contains("@");

        boolean containSpace = email.contains(" ");

        boolean endWithG = email.endsWith("@gmail.com");
        boolean endWithY = email.endsWith("@yahoo.com");
        boolean endWithR = email.endsWith("@mail.ru.com");

        if(notContainSymbol || containSpace){
            System.out.println("INVALID EMAIL");
        }else{
            if(endWithG){
                System.out.println("gmail");
            }else{
                if(endWithY){
                    System.out.println("yahoo email");
                }else{
                    if(endWithR){
                        System.out.println("russian email");
                    }
                }
            }
        }



    }
}
