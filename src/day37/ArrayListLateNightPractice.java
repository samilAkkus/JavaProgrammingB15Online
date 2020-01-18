package day37;

import java.util.ArrayList;

public class ArrayListLateNightPractice {

    public static void main(String[] args) {


        ArrayList<String> nameLst = new ArrayList<>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        nameLst.add("Ayjerenjan");

        System.out.println(nameLst);

        System.out.println("size: "+nameLst.size());

        String lastOne = nameLst.get(nameLst.size()-1);

        System.out.println("lastOne = " + lastOne);

        nameLst.add(0,"Samil");

        System.out.println(nameLst);

        System.out.println("indexOf Mustafa: " +nameLst.indexOf("Mustafa"));

        nameLst.remove(1);

        System.out.println("After removal of 1: "+nameLst);

        nameLst.remove("Ruzi");

        System.out.println("after removal of Ruzi: "+nameLst);

        nameLst.set(0,"SAMIL");

        System.out.println("after set of Samil: "+nameLst);

        /////////////// Swap first and last////////////////////////

        String temp = nameLst.get(0);

        nameLst.set(0,nameLst.get(nameLst.size()-1));

        nameLst.set(nameLst.size()-1, temp);

        System.out.println("\t AFTER SWAPPING::"+nameLst);







    }
}
