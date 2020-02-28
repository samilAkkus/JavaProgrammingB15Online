package a_replit;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayListDelivery_211 {

    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(100,200,10));

        System.out.println(refuel_times(integerList, 10));

    }

    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel){

        int total = 0;

        for (int i = 0; i < deliveries.size() ; i++) {

            total += deliveries.get(i);

        }

        int delivery ;

        if(total % max_fuel == 0 ){

            delivery = total / max_fuel;

        }else {

            delivery = (total / max_fuel) + 1;
        }

        return delivery;




    }
}
