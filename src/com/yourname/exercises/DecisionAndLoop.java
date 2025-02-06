package com.yourname.exercises;

//import java.io.IO;
//import java.util.Scanner;
import module java.base;

/**
 * Class containing Decision and Loop solutions
 * 
 * @author Ken
 */
public class DecisionAndLoop {

    private final Scanner sc;

    public DecisionAndLoop() {
        sc = new Scanner(System.in);
    }

    public void checkPassFail() {
        IO.println("Enter a number from 1 to 100:");
        int number = sc.nextInt();

        if (number > 50) {
            IO.println("Pass");
        } else {
            IO.println("Fail");
        }
    }

    public void checkOddEven() {
        IO.println("Please enter and integer: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            IO.println("Even");
        } else {
            IO.println("Odd");
        }
    }

    public void calculateProduct1ToN() {
        IO.println("Please enter an integer: ");
        int number = sc.nextInt();

        int answer = 1;
        for (int x = 1; x <= number; x++) {
            answer = answer * x;
        }
        IO.println("The product of 1 to " + number + " is " + answer);
    }
    
    
    public void calculateSumAndAverage() {
        IO.println("Please enter an integer: ");
        int number = sc.nextInt();

        int answer = 0;
        for (int x = 1; x <= number; x++) {
            answer = answer + x;
        }
        double average = (double) answer / number;
        IO.println("answer = " + answer + " average = " + average);
    }

    public void makeCheckerBoard() {
        IO.println("Please the number of symbols per row: ");
        int number = sc.nextInt();
        
        if (number < 20) {
            // Rows
            for(int row = 0; row < number; ++row) {
                // Columns
                if (row % 2 == 1) {
                    IO.print("  ");
                }
                for(int col = 0; col < number; ++col) {
                    IO.print("# ");
                }
                IO.println("");
            }
        } else {
            IO.println("Numbers 20 and greater are not acceptable.");
        }
    }
    
    public void displayCozaLozaWoza() {
        for (int x = 1; x <= 110; x += 11) {
            for (int y = x; y < x + 11; ++y) {
                if (y % 3 == 0 && y % 5 == 0 && y % 7 == 0) {
                    IO.print("CozaLozaWoza ");
                } else if (y % 3 == 0 && y % 7 == 0) {
                    IO.print("CozaWoza ");
                } else if (y % 5 == 0 && y % 7 == 0) {
                    IO.print("LozaWoza ");
                } else if (y % 3 == 0 && y % 5 == 0) {
                    IO.print("CozaLoza ");
                } else if (y % 3 == 0) {
                    IO.print("Coza ");
                } else if (y % 5 == 0) {
                    IO.print("Loza ");
                } else if (y % 7 == 0) {
                    IO.print("Woza ");
                } else {
                    IO.print(y + " ");
                }
            }
            IO.print("\n");
        }
    }
    
    public void printNumberInWordA() {
        IO.println("Please enter a number from 0 to 9: ");
        int number = sc.nextInt();
        String wordNumber;
        if (number >= 0 && number <= 9) {
            if (number == 0) {
                wordNumber = "Zero";
            } else if (number == 1) {
                wordNumber = "One";
            } else if (number == 2) {
                wordNumber = "Two";
            } else if (number == 3) {
                wordNumber = "Three";
            } else if (number == 4) {
                wordNumber = "Four";
            } else if (number == 5) {
                wordNumber = "Five";
            } else if (number == 6) {
                wordNumber = "Six";
            } else if (number == 7) {
                wordNumber = "Seven";
            } else if (number == 8) {
                wordNumber = "Eight";
            } else if (number == 9) {
                wordNumber = "Nine";
            } else {
                wordNumber = "Something has gone wrong.";
            }
            IO.println("The number " + number + " in a word is " + wordNumber);
        } else {
            IO.println("Number out of range.");
        }
    }
    public void printNumberInWordB() {
        IO.println("Please enter a number from 0 to 9: ");
        int number = sc.nextInt();
        String wordNumber;
        if (number >= 0 && number <= 9) {
            switch (number) {
                case 0: 
                    wordNumber = "Zero";
                    break;
                case 1: 
                    wordNumber = "One";
                    break;
                case 2:
                    wordNumber = "Two";
                    break;
                case 3:
                    wordNumber = "Three";
                    break;
                case 4:
                    wordNumber = "Four";
                    break;
                case 5:
                    wordNumber = "Five";
                    break;
                case 6:
                    wordNumber = "Six";
                    break;
                case 7:
                    wordNumber = "Seven";
                    break;
                case 8:
                    wordNumber = "Eight";
                    break;
                case 9:
                    wordNumber = "Nine";
                    break;
                default:
                    wordNumber = "Something has gone wrong.";
                    break;
            }
            IO.println("The number " + number + " in a word is " + wordNumber);
        } else {
            IO.println("Number out of range.");
        }
    }

    public void printNumberInWordC() {
        IO.println("Please enter a number from 0 to 9: ");
        int number = sc.nextInt();
        String wordNumber;
        if (number >= 0 && number <= 9) {
            wordNumber = switch (number) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "Something has gone wrong.";
            };
            IO.println("The number " + number + " in a word is " + wordNumber);
        } else {
            IO.println("Number out of range.");
        }
    }

    public void perform() {
        checkPassFail();
//        checkOddEven();
//        calculateProduct1ToN();
//        calculateSumAndAverage();
//        displayCozaLozaWoza();
//        makeCheckerBoard();
//        printNumberInWordA();
//        printNumberInWordB();
//        printNumberInWordC();
    }

    public static void main(String[] args) {
        DecisionAndLoop dal = new DecisionAndLoop();
        dal.perform();
//        new DecisionAndLoop().perform();
        System.exit(0);

    }
}
