package a_replit;

public class MethodsWithReturnSimpleRoom_176 {

    public static void main(String[] args) {

        System.out.println(simpleRoomBook(false,2,1,2018));
        System.out.println(simpleRoomBook(true,2,1,2018));
        System.out.println(simpleRoomBook(true,7,2,2018));

    }

    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){

        if(isAvailable == true){

            if(year == 2018){

                if(month != 7){

                    return true;
                }else {

                    if(day >8){

                        return true;
                    }else {

                        return false;
                    }
                }
            }
        }

        return false;
    }
}
