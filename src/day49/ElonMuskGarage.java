package day49;



public class ElonMuskGarage {

    public static void main(String[] args) {
        Tesla t1 = new Tesla(2020 , 5000 , "X");

        System.out.println(t1);

        t1.charge();
        t1.selfDrive();
        t1.goForward();
        t1.start();
    }



}
