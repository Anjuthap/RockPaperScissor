
import java.util.Random;
import java.util.Scanner;

public class RoPaSc {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ROCK,PAPER,SCISSOR GAME");

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        String[] rps = { "Rock", "Paper", "Scissor" };

        String usermove;

        while (true) {
            String compmove = rps[random.nextInt(3)];

            System.out.println("Choose any : Rock,Paper,Scissor:");
            usermove = sc.nextLine();

            if (!usermove.equalsIgnoreCase("Rock") &&
                    !usermove.equalsIgnoreCase("Paper") &&
                    !usermove.equalsIgnoreCase("Scissor")) {
                System.out.println("Invalid");
            } else {
                System.out.println("Computer played:" + compmove);
            }
            if (compmove.equalsIgnoreCase(usermove)) {
                System.out.println("It's a tie");
            } else if (usermove.equalsIgnoreCase("Rock")) {
                if (compmove.equalsIgnoreCase("Paper")) {
                    System.out.println("You lose");
                } else if (compmove.equalsIgnoreCase("Scissor")) {
                    System.out.println("You win");
                }
            } else if (usermove.equalsIgnoreCase("Paper")) {
                if (compmove.equalsIgnoreCase("Rock")) {
                    System.out.println("You Win");
                } else if (compmove.equalsIgnoreCase("Scissor")) {
                    System.out.println("You lose");
                }
            } else if (usermove.equalsIgnoreCase("Scissor")) {
                if (compmove.equalsIgnoreCase("Rock")) {
                    System.out.println("You lose");
                } else if (compmove.equalsIgnoreCase("Paper")) {
                    System.out.println("You win");
                }
            }

            System.out.println("Play Again?");
            String playagain = sc.nextLine();
            if (!playagain.equalsIgnoreCase("yes")) {
                break;
            }
        }
        sc.close();

    }

}
