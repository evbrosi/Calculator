/**
 * Created by eaglebrosi on 10/10/16.
 */
import java.io.IOException;
import java.util.Scanner;
import java.awt.Desktop;

public class Menu {
    TipCalculator t1 = new TipCalculator();
    public void main() throws IOException, InterruptedException {
        int menuChoice;
        String fileName = "help.txt";

        Scanner firstNum = new Scanner(System.in);
        //block out the menu (did it differently here than tip calculator because I figured I might have to add things)//
        System.out.println("\n*****Main Menu*****\n");
        System.out.println("1: Calculator\n");
        System.out.println("2: Tip Calculator\n");
        System.out.println("3: Grocery List\n");
        System.out.println("4: Help\n");
        System.out.println("5: Quit\n");
        System.out.print("Please enter the number of how you'd like to proceed:");

        menuChoice = firstNum.nextInt();

        switch(menuChoice) {
            case 1:
                Calculator.calcuLate();
                break;
            case 2:
                t1.calculateBill();
                break;
            case 3:
                GroceryList.groceryList();
                break;
            case 4:

                break;
            case 5:
                System.out.println("Thank you for using Eagle. This is just like prom.");
                main();
                break;
            default:
                System.out.println("Please type in a valid entry.");
                break;
        }
    }
}
