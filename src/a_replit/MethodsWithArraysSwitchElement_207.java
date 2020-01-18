package a_replit;
import java.util.Arrays;

public class MethodsWithArraysSwitchElement_207 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(do_switch(new int[]{1, 2, 3, 4})));


    }

    public static int[] do_switch(int[] i) {

        int temp ;

        temp = i[0];

        i[0] = i[i.length-1];

        i[i.length-1] = temp;

        return i;

    }
}
