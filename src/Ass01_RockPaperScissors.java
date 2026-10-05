import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String moveOne = "";
        String moveTwo = "";
        boolean finished = false;

        while (!finished) {
            boolean validOne = false;
            boolean validTwo = false;

            System.out.println("Player A, choose Rock, Paper, or Scissors (R, P, or S?)");
            while (!validOne) {
                moveOne = in.next().toUpperCase();

                if (moveOne.equals("R") || moveOne.equals("P") || moveOne.equals("S")) {
                    playerA = moveOne;
                    validOne = true;
                } else {
                    System.out.println("Wrong choice. Select R, P, or S.");
                }
            }
            System.out.println("Player B, choose Rock, Paper, or Scissors (R, P, or S?)");
            while (!validTwo)  {
                moveTwo=in.next().toUpperCase();

            if(moveTwo.equals("R")||moveTwo.equals("P")||moveTwo.equals("S")){
                playerB=moveTwo;
                validTwo=true;
            }else{
                System.out.println("Wrong Choice. Pick R,P,orS.");
            }
            }
    if(moveOne.equals("R")&& moveTwo.equals("S")){
        System.out.println("Rock breaks Scissors. Player A wins!");
    }else if (moveOne.equals("S") && moveTwo.equals("R")){
        System.out.println("Rock breaks Scissors. Player B wins!");
    }else if (moveOne.equals("P") && moveTwo.equals("R")) {
        System.out.println("Paper covers Rock. Player A wins!");
    }else if (moveOne.equals("R") && moveTwo.equals("P")) {
        System.out.println("Paper covers Rock. Player B wins!");
    }else if (moveOne.equals("S") && moveTwo.equals("P")) {
        System.out.println("Scissors cuts Paper. player A wins!");
    }else if (moveOne.equals("P") && moveTwo.equals("S")) {
        System.out.println("Scissors cut Paper. Player B wins!");
    }else{
        System.out.println("Both players chose the same thing. It's a Tie!");
    }

            System.out.println("Want to play again? (Y/N)");
            if (in.next().equalsIgnoreCase("N")) {
                finished = true;
            }
        }

        in.close();
    }
}