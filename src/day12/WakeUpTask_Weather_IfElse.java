package day12;

public class WakeUpTask_Weather_IfElse {

    public static void main(String[] args) {


        //create a variable to store the weather of your city right now:
        //and write a if else if else statement to do following
        //if weather sunny---code in sunny weather
        //if weather rainy---code in rainy weather
        //if weather cloudy---code in cloudy weather
        //if weather snowy---code in snowy weather
        //else rain or shine just keep coding anyway!!

        String weather = new String("cloudy");

        if(weather.equals("sunny")){
            System.out.println("code in sunny weather");
        }else{
            if(weather.equals("rainy")){
                System.out.println("code in rainy weather");
            }else{
                if(weather.equals("cloudy")){
                    System.out.println("code in cloudy weather");
                }else{
                    if(weather.equals("snowy")){
                        System.out.println("code in snowy weather");
                    }else{
                        System.out.println("rain or shine just keep coding anyway");
                    }
                }
            }
        }
    }
}
