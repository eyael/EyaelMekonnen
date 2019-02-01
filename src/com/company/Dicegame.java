import static java.lang.System.*;
import java.util.*;

public class Dicegame {



    public static void main(String args[]) {
        int score = 0;
        out.println("Welcome! Let's Play Roll Dice!");
        pMechanics();
    }
    public static Scanner scan = new Scanner(in);
    public static Random generator = new Random();

    public static int Score = 0;
    public static int counter;

    public static int Roll() {
        int Low = 1;
        int High = 6;
        int lost = 1;
        int double_1 = 25;
        int Random = generator.nextInt(High - Low) + Low;
        return Random;
    }

    public static void pMechanics() {
        counter = 0;
        out.println("Do you want to play this turn? (Y/N)");
        String answer = scan.nextLine();

        if (answer.equals("Y")) {
            out.println("Roll Again? Yes.");
            int Roll = Roll();
            out.println("You rolls a " + Roll);
            while (Score + counter < 100)


                while (Roll != 1) {
                    counter += Roll;
                    out.println("Do you want to roll more? (Y/N)");
                    answer = scan.nextLine();

                    if (answer.equals("N")) {
                        out.println("Thank you For Playing.");

                        out.println("Player's score reached 100!");
                        exit(0);




                        }

                    }

                }
        }
    }







