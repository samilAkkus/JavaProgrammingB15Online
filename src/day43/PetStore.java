package day43;

import java.util.Arrays;
import java.util.List;

public class PetStore {

    public static void main(String[] args) {



        Pet p1 = new Pet();

        System.out.println("p1 = " + p1);

        p1.speak();
        System.out.println("========================================");
        p1.setType("cow");
        p1.speak();


        Pet p2 = new Pet("horse","Walter");
        Pet p3 = new Pet("goose","Samantha");
        Pet p4 = new Pet("donkey","Oliver");
        Pet p5 = new Pet("dog","Henry");
        Pet p6 = new Pet("cow","Adam");
        Pet p7 = new Pet("ant","Atom");
        Pet p8 = new Pet("bear","Teddy");
        Pet p9 = new Pet("cat","Stephanie");

        List<Pet> myPets = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9);

        System.out.println(myPets);

        for (Pet each : myPets) {

            System.out.println("each name = " + each.getName());
        }

        for (Pet each : myPets) {

            if(each.getType().equals("cat")){

                System.out.println("cat names : "+ each.getName());
            }
            
        }

    }
}
