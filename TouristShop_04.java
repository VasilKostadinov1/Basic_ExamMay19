package BASIC.Additional_Problems_MIX.ExamPrepMay19;

import java.util.Scanner;

public class TouristShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int counter = 0;
        double sum=0;
        boolean isFinished=false;

        String input = scanner.nextLine();  //	Име на продукта – текст
        while (!input.equals("Stop")) {
            counter++;
            double price = Double.parseDouble(scanner.nextLine());
            if (counter % 3 == 0) {
                price = price / 2;
            }
            sum+= price; // !! below the counter, 1st check if product is 3rd
            if (budget < sum) {    // 30 < 45
                isFinished=true;
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Stop")){
            System.out.printf("You bought %d products for %.2f leva.",counter,sum);
        }
        if (isFinished){
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", Math.abs(sum-budget));  // (-15)
        }
    }
}
