import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by eaglebrosi on 10/10/16.
 */
public class TipCalculator {
    double bill;
    int tipChoice;
    int whatsNext;
    double tipAmount;
    Scanner whatUpIzaak = new Scanner(System.in);
//        ArrayList<String> historyList = new ArrayList<>();

    public void calculateBill() throws IOException, NumberFormatException, InterruptedException {
        while (true) {
            System.out.print("Welcome to the tip calculator!\n Please enter your bill amount:");
            bill = whatUpIzaak.nextDouble();
            System.out.print("\nHow good was the service? \n 1: Excellent! 25%\n 2: Great. 20%\n 3: Okay? 15%\n 4: You aren't human. 10% ");
            tipChoice = whatUpIzaak.nextInt();
            int whatsNext;

            switch (tipChoice) {
                case 1:
                    tipAmount = 0.25;
                    System.out.println("Your tip is 25%");
                    break;
                case 2:
                    tipAmount = 0.2;
                    System.out.println("Your tip is 20%");

                    break;
                case 3:
                    tipAmount = 0.15;
                    System.out.println("Your tip is 15%");
                    break;
                case 4:
                    tipAmount = 0.1;
                    System.out.println("Your tip is 10%");
                    break;
                default:
                    System.out.println("Not a number. Try again. I can't figure you out.");
                    Thread.sleep(1250);
                    calculateBill();
                    break;
            }

            BigDecimal a = new BigDecimal(bill * tipAmount);
            BigDecimal totalTip = a.setScale(2, RoundingMode.DOWN);

            System.out.println("The tip amount is: $" + totalTip + "\n");

            BigDecimal b = new BigDecimal((bill * tipAmount) + bill);
            BigDecimal totalBillAmount = b.setScale(2, RoundingMode.DOWN);
            System.out.println("The total bil is: $" + (totalBillAmount));

            whatIsNext();
        }
    }

    public void whatIsNext() throws IOException, InterruptedException {
        Thread.sleep(1500);
        System.out.print("\nWhat would you like to do next?\n1: Configure another tip:\n2: Return to Menu");
        whatsNext = whatUpIzaak.nextInt();

        switch (whatsNext) {
            case 1:
                calculateBill();
            case 2:
                /*            Menu.main();
                    public static void clearScreen() {
                    System.out.print("\033[H\033[2J");
                    System.out.flush(); */
            case 3:

            default:
                System.out.println("I don't understand what you mean.");
                whatIsNext();
        }
    }
}