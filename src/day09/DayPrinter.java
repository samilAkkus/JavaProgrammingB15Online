package day09;

public class DayPrinter {

    public static void main(String[] args) {


        //if the day code 1--monday
        //if the day code 2--tuesday and so on

        //if non of above, print unknown day

        int dayCode = 7;

        if(dayCode==1){
            System.out.println("day is monday");
        }else{
            if(dayCode==2){
                System.out.println("day is tuesday");
            }else{
                if(dayCode==3){
                    System.out.println("day is wednesday");
                }else {
                    if(dayCode==4){
                        System.out.println(" day is thursday");
                    }else{
                        if(dayCode==5){
                            System.out.println("day is friday");
                        }else{
                            if(dayCode==6){
                                System.out.println("day is saturday");
                            }else{
                                if(dayCode==7){
                                    System.out.println("day is sunday");
                                }else{
                                    System.out.println("day is unknown");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
