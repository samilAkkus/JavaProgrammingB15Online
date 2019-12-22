package a_replit;
import java.util.*;

public class Arrays2DMatchTwo_144 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }
        }
        int matches = 0;

        for(int x=0 ;x<=rows-1;x++) {

            for(int z=0 ;z<=cols-2;z++) {

                if(arr[x][z] == arr[x][z+1]){

                    ++matches;
                }



            }
        }

        System.out.println("matches: "+matches);




    }
}
