import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by eaglebrosi on 10/11/16.
 */

public class GroceryList {
    static String item;
    static double itemCost;
    static double itemCostPlusTax;
    static double kentuckyTax;
    static int nowWhat;
    static int deleteWhich;
    static Scanner whatItem = new Scanner(System.in);
    static Scanner whatPrice = new Scanner(System.in);
    static Scanner groceryMenu = new Scanner(System.in);
    static Scanner deleteWhat = new Scanner(System.in);
    static ArrayList<String> historyList = new ArrayList<>();

    public static void groceryList() throws IOException, NumberFormatException, InterruptedException {
        while (true) {
            System.out.print("\nWelcome to your Grocery Getting!\n \n What are we buying today?\n Please input an item:");
            item = whatItem.nextLine();
            System.out.print("\nHow much does " + item + " cost?\n Please input the cost: $");
            itemCost = whatPrice.nextDouble();
            System.out.println("\nKentucky's sales tax is 6%.");
            kentuckyTax = (itemCost * 0.06);
            BigDecimal terribleNumber = new BigDecimal(itemCost+kentuckyTax);
            BigDecimal itemCostPlusTax = terribleNumber.setScale(2, RoundingMode.DOWN);

            System.out.println("\n Give me a minute");
            System.out.println("\n The " + item + " is going to cost $" + itemCostPlusTax+"\n");
            // some sort of add mechanic
            historyList.add(item +": $" + itemCostPlusTax);
            GroceryList.whatIsNext();
        }
    }

    public static void whatIsNext() throws IOException, InterruptedException {
        System.out.print("Would you like to do next?\n1: Add another item: \n2: Look at Grocery list: \n3: Delete a Grocery Item.\n4:Just go back to the menu.");
        nowWhat = groceryMenu.nextInt();
        switch (nowWhat) {
            case 1:
                GroceryList.groceryList();
            case 2:
                System.out.println("");
                for(int i = 0; i < historyList.size(); ++i) {
                    System.out.println(historyList.get(i));
                }
                GroceryList.whatIsNext();
                break;
            case 3:
                System.out.println("Your Grocery List\n");
                for (int i = 0; i < historyList.size(); ++i) {
                    System.out.print(i+1+". ");
                    System.out.println(historyList.get(i));
                }
                System.out.print("\nPlease select the number of which item you want to delete: ");
                deleteWhich = deleteWhat.nextInt();
                System.out.print("\nYou are about to delete: ");
                System.out.println(historyList.get(deleteWhich-1));
                historyList.remove(deleteWhich-1);
                GroceryList.whatIsNext();
                break;
            default:
                System.out.println("I don't understand what you mean.");
                GroceryList.whatIsNext();
        }
    }
}