/**
 * Created by eaglebrosi on 10/10/16.
 */
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {
    static int FirstNumber;
    static String Operator;
    static int SecondNumber;
    static int answer;
    static int nextStep;
    static Scanner firstNum = new Scanner(System.in);
    static Scanner Operate = new Scanner(System.in);
    static Scanner secNum = new Scanner(System.in);
    static Scanner returnToSender = new Scanner(System.in);

//        ArrayList<String> historyList = new ArrayList<>();

    public static void calcuLate() throws IOException, NumberFormatException, InterruptedException {
        String fileName = "oldMaths.txt";
        Scanner infile = new Scanner(new FileReader(fileName));
        PrintWriter historyList = new PrintWriter(new FileWriter(fileName));

        while (true) {

            System.out.print("Welcome to the Calculator!" + "\n" + "Please enter a number:");
            FirstNumber = firstNum.nextInt();
            System.out.print("What do you want to do with " + FirstNumber + "? + * - / %");
            Operator = Operate.nextLine();
            System.out.print(FirstNumber + Operator + "______?");

            System.out.print("");
            SecondNumber = secNum.nextInt();
            System.out.print(FirstNumber + Operator + SecondNumber + " = ");

            switch (Operator) {
                case "*":
                    answer = FirstNumber * SecondNumber;
                    System.out.println(FirstNumber * SecondNumber);
//                    historyList.add(FirstNumber + Operator + SecondNumber + " = " + answer);
                    historyList.println(FirstNumber);
                    historyList.println(SecondNumber);
                    historyList.println(answer);
                    //                   SecondNumber + " = " + answer);
                    Thread.sleep(2000);
                    break;
                case "+":
                    System.out.println(FirstNumber + SecondNumber);
                    answer = FirstNumber - SecondNumber;
//                    historyList.add(FirstNumber + Operator + SecondNumber + " = " + answer);
                    historyList.println(FirstNumber + Operator + SecondNumber + " = " + answer);
                    Thread.sleep(2000);
                    break;
                case "-":
                    System.out.println(FirstNumber - SecondNumber);
                    answer = FirstNumber - SecondNumber;
//                    historyList.add(FirstNumber + Operator + SecondNumber + " = " + answer);
                    historyList.println(FirstNumber + Operator + SecondNumber + " = " + answer);
                    Thread.sleep(2000);
//                    Calculator.whatIsNext();
                        break;
                case "/":
                    System.out.println(FirstNumber / SecondNumber);
                    answer = FirstNumber / SecondNumber;
//                    historyList.add(FirstNumber + Operator + SecondNumber + " = " + answer);
                    historyList.println(FirstNumber + Operator + SecondNumber + " = " + answer);
                    Thread.sleep(2000);
                    //                  Calculator.whatIsNext();
                    break;
                case "%":
                    System.out.println(FirstNumber % SecondNumber);
                    answer = FirstNumber % SecondNumber;
//                    historyList.add(FirstNumber + Operator + SecondNumber + " = " + answer);
                    historyList.println(FirstNumber + Operator + SecondNumber + " = " + answer);
                    Thread.sleep(2000);
                    //                Calculator.whatIsNext();
                    break;
                default:
                    System.out.println("Not a number. Try again. I can't figure you out.");
                    Thread.sleep(2000);
                    break;
            }
//            historyList.close();

            System.out.println("Would you like to do next?\nCalculate another number:1\nPrint your history:2\nReturn to Menu:3");
            nextStep = returnToSender.nextInt();

            switch (nextStep) {
                case 1:
                    break;
                case 2:
                    historyList.close();
                    //               System.out.print("HOOPLA!!!");  works!
                    Scanner inFile = new Scanner(new FileReader(fileName));
                    int toNum;
                    while (inFile.hasNextLine()) {
//                        System.out.print("SHAQ");
                        toNum = Integer.parseInt(inFile.nextLine());
                        System.out.println(toNum);
                    }
                case 3:
//                    Menu.main();
            }
        }
/*
        public static void datSweetCalculatorHistoryBrah(String[] args) throws IOException, NumberFormatException{
            String fileName = "oldMaths.txt";
            Scanner inFile = new Scanner(new FileReader(fileName));
            int toNum;
            while (inFile.hasNextLine()){
                toNum= Integer.parseInt(inFile.nextLine());
                System.out.println(toNum);
            }
        }


    /*                    for(int i = 0; i < historyList.size(); ++i) {
                        System.out.println(historyList.get(i));
                    }break;
                    Scanner inFile = new Scanner(new FileReader(fileName));

                    while (inFile.hasNextLine()){
                        toNum = String.parseInt(inFile.nextLine());
                        System.out.println(toNum);
                        break;}*/

    }
}


