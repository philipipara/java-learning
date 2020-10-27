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

        System.out.println(whateverPhrase);

      
    }
}