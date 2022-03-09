package odd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Calculator myCalculator = new Calculator(0,0,0);

        menu();

        System.out.println('\n' + "Please enter the number of which action from Menu you want: ");
        int menuNumber = reader.nextInt();

        if (menuNumber==1) {
            System.out.println("Please enter first Number: ");
            myCalculator.setNumberA(reader.nextInt());
            System.out.println("Please enter second Number: ");
            myCalculator.setNumberB(reader.nextInt());
            System.out.println("SUM of numbers is " + myCalculator.sum());
        }
        if (menuNumber==2) {
            System.out.println("Please enter first Number: ");
            myCalculator.setNumberA(reader.nextInt());
            System.out.println("Please enter second Number: ");
            myCalculator.setNumberB(reader.nextInt());
            System.out.println("DIFFERENCE of numbers is " + myCalculator.subtraction());
        }
        if (menuNumber==3) {
            System.out.println("Please enter first Number: ");
            myCalculator.setNumberA(reader.nextInt());
            System.out.println("Please enter second Number: ");
            myCalculator.setNumberB(reader.nextInt());
            System.out.println("PRODUCT of numbers is " + myCalculator.multiplication());
        }
        if (menuNumber==4) {
            System.out.println("Please enter first Number: ");
            myCalculator.setNumberA(reader.nextInt());
            System.out.println("Please enter second Number: ");
            myCalculator.setNumberB(reader.nextInt());
            System.out.println("QUOTIENT of numbers is " + myCalculator.division());
        }
        if (menuNumber==5){

            float tempSum = myCalculator.sum();
            char answer;

            System.out.println("Please enter first Number: ");
            myCalculator.setNumberA(reader.nextInt());
            System.out.println("Please enter second Number: ");
            myCalculator.setNumberB(reader.nextInt());
            System.out.println("SUM of numbers is " + myCalculator.sum());

            do {
            System.out.println("Do you want to add more numbers? Enter Y-yes or N-no");
            answer = reader.next().charAt(0);
            if (answer=='y' || answer=='Y') {
                System.out.println("Please add another number: ");
                int tempNumber = reader.nextInt();
                tempSum = tempSum + tempNumber ;
                System.out.println("SUM of numbers is: " + myCalculator.sumNNumbers(myCalculator.sum(),tempSum));
            } else
                break;
            } while (true);

            }
        if (menuNumber==6){

            float tempSum = 1;
            char answer;

            System.out.println("Please enter first Number: ");
            myCalculator.setNumberA(reader.nextInt());
            System.out.println("Please enter second Number: ");
            myCalculator.setNumberB(reader.nextInt());
            System.out.println("PRODUCT of numbers is " + myCalculator.multiplication());

            do {
                System.out.println("Do you want to add more numbers? Enter Y-yes or N-no");
                answer = reader.next().charAt(0);
                if (answer=='y' || answer=='Y') {
                    System.out.println("Please add another number: ");
                    int tempNumber = reader.nextInt();
                    tempSum = tempSum * tempNumber ;
                    System.out.println("PRODUCT of numbers is: " + myCalculator.multiplicationNNumbers(myCalculator.multiplication(),tempSum));
                } else
                    break;
            } while (true);

        }
        if (menuNumber==7) {
            System.out.println("Please enter value of radius to calculate Circle area: ");
            myCalculator.setR(reader.nextFloat());
            System.out.println("Circle area is: " + myCalculator.circleArea());
        }
    }
    public static void menu (){
        Scanner reader = new Scanner(System.in);

        System.out.println('\n' + "MENU: " + '\n');
        System.out.println("1. SUM two numbers");
        System.out.println("2. SUBTRACT two numbers");
        System.out.println("3. MULTIPLY two numbers");
        System.out.println("4. DIVIDE two numbers");
        System.out.println("5. SUM N numbers");
        System.out.println("6. MULTIPLY N numbers");
        System.out.println("7. CALCULATE the area of the circle");
    }
}