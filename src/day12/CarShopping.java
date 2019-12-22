package day12;

public class CarShopping {

    public static void main(String[] args) {


        //buy corolla or Tesla(only if its within the budged)

        // there is only one car covered

        String carBrand = "corolla";

        int carPrice = 90000;

        int budget = 40000;

        if (carBrand.equals("corolla") || (carBrand.equals("Tesla") && carPrice<=budget)){

            System.out.println("Car Acquired!!!");

        }else{
            System.out.println("not what im lookin for");
        }

    }
}
