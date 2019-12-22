package day12;

public class LoginTest_Task4 {

    public static void main(String[] args) {

        String userName = "userf123";

        String password = "pass1sd23";

        if(userName.equals("user123") && password.equals("pass123")){
            System.out.println("login successful");

        }else{
            if(!userName.equals("user123") && password.equals("pass123")){
                System.out.println("username is not correct");
            }else{
                if(userName.equals("user123")&& !password.equals("pass123")){
                    System.out.println("your password is not correct");
                }else{ // i could finish this here, this is extra
                    if(!userName.equals("user123") && !password.equals("pass123")){
                        System.out.println("your username or password is wrong");
                    }


                }
            }
        }






    }
}
//create 2 String variables called userName n passWord
//and do following
//your correct username password is user123 n pass123
// check if your username and password correct
//if so print login successful

//if not
///check whether your correct
//if not say,username is not correct
//check you password is correct or not
//if not, print password is not correct