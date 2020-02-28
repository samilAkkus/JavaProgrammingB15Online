package day53;

public class FruitShopUtility {

    public static void main(String[] args) {


        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);


        displayFruit(f1);
        displayFruit(f2);

        digestBetter(f1);

        System.out.println(getMyFavoriteFruit());
    }

    public static void digestBetter(Fruit bla){

        bla.getDigest();
        bla.getDigest();
        bla.getDigest();
        bla.getDigest();
        System.out.println("bla fruit: "+bla);
    }

    public static Fruit getMyFavoriteFruit(){

        return new Orange("sour","orange",55);


    }



    //displayFruits

    public static void displayFruit(Fruit anyFruit){

        System.out.println("Displaying fruit \n" + anyFruit.toString());


    }






    //sellFruit
    //displayFruits
    //buyFruit
}
