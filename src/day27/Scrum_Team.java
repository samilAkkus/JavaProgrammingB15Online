package day27;

import java.util.Arrays;

public class Scrum_Team {

    public static void main(String[] args) {
        String[] developersTeam = {"Vladislav", "Hasan" ,"Tolkun","Abide" };
        String[] testersTeam = {"Zhibekchach" , "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysitsTeam = {"Lisa","Ershad", "Naila"};
        String[][] scrumTeam = { developersTeam , testersTeam, businessAnalysitsTeam };

        System.out.println(Arrays.deepToString(scrumTeam));




    }


}
