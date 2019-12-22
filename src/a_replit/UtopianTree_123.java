package a_replit;

public class UtopianTree_123 {
    public static void main(String[] args) {

        int sum = 0;


        for (int x = 1; x <4 ; x++) {

           ++sum;

            System.out.println("year "+x+" - growth 1 cm");
            System.out.println("tree size: "+sum+"cm");

        }
        for (int y = 4; y <=10 ; y++) {

            sum+=2;

            System.out.println("year "+y+" - growth 2 cm");
            System.out.println("tree size: "+sum+"cm");

        }

    }
}
