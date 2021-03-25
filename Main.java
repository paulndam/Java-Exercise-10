import java.util.Scanner;

public class Main {

    // constructors
    
    int playerNum;
    String teamName;

    

    public Main(int numbers, String names){

        playerNum = numbers;
        teamName = names;

    }

    public static void main(String[] args) {

        Main myTeam = new Main(10, "Barcelona");

        System.out.println(" Team Name is ------->" + " " + myTeam.teamName + " & " + "My Player Number is -------> "
                + myTeam.playerNum);

    }
    

    


    




}