package a_replit;

public class MethodsWith2DArraysCurrency_212 {

    public static void main(String[] args) {

        String[][] test_money =
                {
                        {"mark","11.0"},
                        {"shekel","5.0"},
                };

        String[][] test_convert=
                {
                        {"mark","0.6"},
                        {"shekel","100"},
                };

        System.out.println(convertC(test_money , test_convert));

    }

    public static  double convertC(String[][] money,String[][] convertionRate){

        double total = 0;

        for (int i = 0; i < money.length ; i++) {

            total += Double.parseDouble(money[i][1]) * Double.parseDouble(convertionRate[i][1]);

        }

        return total;




    }
}
