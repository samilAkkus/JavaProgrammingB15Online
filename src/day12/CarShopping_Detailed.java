package day12;

public class CarShopping_Detailed {

    public static void main(String[] args) {

        String carBrand = "Tesla";

        int carPrice = 60000;
        int budget = 40000;

        if(carBrand.equals("corolla")){
            System.out.println("car acquired!!");
        }else{
            if(carBrand.equals("Tesla") && carPrice <=budget){
                System.out.println("tesla car acquired!");
            }else {
                System.out.println("not what im looking for");
            }
        }
    }
}
