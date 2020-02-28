package day60.exceptions;

import java.util.ArrayList;
import java.util.Collection;

class Main {


    public static void main(String[] args) {


//        throw new BreakTimeException();
        try {
            throw new MyOwnCheckedException();
        } catch (MyOwnCheckedException e) {
            System.out.println("WOLA MY OWN THING CAUGHT!!!");
        }

        Collection<String> bla = new ArrayList<>();

    }


}