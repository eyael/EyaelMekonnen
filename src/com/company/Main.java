import static java.lang.System.*;
import java.util.*;

public class Main{

    public static Scanner scan = new Scanner (in);
    public static Random generator = new Random ();

    public static int p1Score = 0;
    public static int p2Score = 0;
    public static int counter;

    public static void main(String args[]){
        out.println("Welcome to Pig, the two-player dice game!");
        out.println("Player 1 go first");
        p1Mechanics ();
    }

    public static int Roll() {
        int Low = 1;
        int High = 7;
        int Roll = generator.nextInt (High - Low) + Low;
        return Roll;
    }

    public static void p1Mechanics() {
        counter = 0;
        out.println("Do you want to play this turn? (Y/N)");
        String answer = scan.nextLine ();
        answer = answer.replaceAll (" ", "") ;
        answer = answer.toUpperCase ();
        if (answer.equals("N")) {
            out.println ("Player 1 skipped their turn.");
            out.println ("Player 2's turn to roll");
            p2Mechanics ();
        }
        int Roll = Roll();
        out.println ("You rolled a " + Roll);
        while (p1Score + counter < 100) {
            while (Roll != 1) {
                counter += Roll;
                out.println ("Do you want to roll more? (Y/N)");
                answer = scan.nextLine ();
                answer = answer.replaceAll (" ", "") ;
                answer = answer.toUpperCase ();
                while(!(answer.equals("Y")) && !(answer.equals("N"))){
                    out.println("Please enter only Y/N:");
                    answer = scan.nextLine ();
                    answer = answer.replaceAll (" ", "") ;
                    answer = answer.toUpperCase ();
                }
                if (answer.equals("N")) {
                    p1Score += counter;
                    out.println ("Player 1 ended their turn.");
                    out.println ("P1 vs P2: " + p1Score + "-" + p2Score);
                    out.println ("Player 2's turn to roll");
                    p2Mechanics ();
                }
                Roll = Roll ();
                out.println ("You rolled a " + Roll);

            }
            if (Roll == 1) {
                counter = 0;
            }
            out.println ("Player 1 rolled a '1'.");
            out.println ("P1 vs P2: " + p1Score + "-" + p2Score);
            out.println ("Player 2's turn to roll");
            p2Mechanics ();
        }
        out.println("Player 1's score reached 100!");
        out.println("P1 wins by " + (p1Score - p2Score) + " points!");
        exit (0);
    }

    public static void p2Mechanics() {
        counter = 0;
        out.println("Do you want to play this turn? (Y/N)");
        String answer = scan.nextLine ();
        answer = answer.replaceAll (" ", "") ;
        answer = answer.toUpperCase ();
        if (answer.equals("N")) {
            out.println ("Player 2 skipped their turn.");
            out.println ("Player 1's turn to roll");
            p1Mechanics ();
        }
        int Roll = Roll();
        out.println ("You rolled a " + Roll);
        maxScore: while (p2Score < 100) {
            while (Roll != 1) {
                counter += Roll;
                out.println ("Do you want to roll more? (Y/N)");
                answer = scan.nextLine ();
                answer = answer.replaceAll (" ", "") ;
                answer = answer.toUpperCase ();
                while(!(answer.equals("Y")) && !(answer.equals("N"))){
                    out.println("Please enter only Y/N:");
                    answer = scan.nextLine ();
                    answer = answer.replaceAll (" ", "") ;
                    answer = answer.toUpperCase ();
                }
                if (answer.equals("N")) {
                    p2Score += counter;
                    out.println ("Player 2 ended their turn.");
                    out.println ("P1 vs P2: " + p1Score + "-" + p2Score);
                    out.println ("Player 1's turn to roll");
                    p1Mechanics ();
                }
                Roll = Roll ();
                out.println ("You rolled a " + Roll);

            }
            if (Roll == 1) {
                counter = 0;
            }
            out.println ("Player 2 rolled a '1'.");
            out.println ("P1 vs P2: " + p1Score + "-" + p2Score);
            out.println ("Player 1's turn to roll");
            p1Mechanics ();
        }
        out.println("Player 2's score reached 100!");
        out.println("P2 wins by " + (p2Score - p1Score) + " points!");
        exit (0);
    }

}