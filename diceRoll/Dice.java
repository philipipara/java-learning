import java.util.Random;
import java.util.Scanner;

public class Dice{
    public static void main (String[] args){
        Random numberRoll = new Random();
        int x = numberRoll.nextInt(6) + 1;

        System.out.println("You rolled a: " + x);

        Scanner scan= new Scanner(System.in);
        System.out.print("Enter whatever you want:  ");
        String whateverPhrase = scan.nextLine();

        System.out.println("This is really what you wanted to say: " + whateverPhrase);

        int jersey = 10;
        System.out.println(jersey);

        jersey = 22;
        System.out.println(jersey);

        String favoritePlayer = "Christian Pulisic";
        System.out.println(favoritePlayer);

        favoritePlayer = "Actually, I like Reece James more right now";
        System.out.println(favoritePlayer);

        Scanner choice = new Scanner(System.in);
        System.out.print("What about CHO? ");
        String playerChoice = choice.nextLine();

        System.out.println(playerChoice);
      
    }
}