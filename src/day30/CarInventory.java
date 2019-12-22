package day30;

public class CarInventory {

    public static void main(String[] args) {


        String[] cars = {"Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};

        int countChev = 0;

        int countCivic = 0;

        for (int x = 0; x < cars.length ; x++) {

            for (int y = 0; y <= cars[x].length()-9 ; y++) {

                if(cars[x].substring(y,y+9).equals("Chevrolet")){

                    ++countChev;

                    System.out.println("LOCATION OF CHEVROLET IS: "+x);
                }


            }


        }

        for (int x = 0; x <cars.length ; x++) {

            for (int z = 0; z <= cars[x].length()-5 ; z++) {

                if(cars[x].substring(z,z+5).equals("Civic")){

                    ++countCivic;

                    System.out.println("LOCATION OF CIVIC IS: "+x);
                }

            }

        }

        System.out.println("Count of Chevrolet: "+countChev);
        System.out.println("Count of Civic: "+countCivic);
    }
}
