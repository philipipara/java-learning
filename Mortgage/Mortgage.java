
import java.util.Scanner;
import java.text.NumberFormat;
import java.awt.*;

public class Mortgage {

    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scan = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scan.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scan.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (years): ");
        byte years = scan.nextByte();
        int numPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numPayments))
                / (Math.pow(1 + monthlyInterest, numPayments));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}