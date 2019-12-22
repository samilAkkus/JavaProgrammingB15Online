package day09;

public class DayPrinter_V2 {

    public static void main(String[] args) {


        //if the day code 1--monday
        //if the day code 2--tuesday and so on

        //if non of above, print unknown day

        int dayCode = 5;

        String dayName = "";


        if(dayCode==1){
            dayName = "Monday";
        }else{
            if(dayCode==2){
                dayName = "tuesday";
            }else{
                if(dayCode==3){
                    dayName = "wednesday";
                }else {
                    if(dayCode==4){
                        dayName = "thursday";
                    }else{
                        if(dayCode==5){
                            dayName = "friday";
                        }else{
                            if(dayCode==6){
                                dayName = "saturday";
                            }else{
                                if(dayCode==7){
                                    dayName = "sunday";
                                }else{
                                    dayName = "unknown";
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println( " day is " + dayName);
    }
}
