package BASIC.Additional_Problems_MIX.ExamPrepMay19;

import java.util.Scanner;

public class VetParking_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double hourCharge = 0;
        //double dayCharge = 0;
        double totalCharge = 0;

        for (int i = 1; i <= days; i++) {
            double dayCharge=0;   //!!! declare dayCharge in the "For" for days, so as not to Zero it in the end
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {  //За всеки четен ден и нечетен час, паркингът таксува 2.50 лева
                    hourCharge = 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {  //всеки нечетен ден и четен час таксата е 1.25 лева
                    hourCharge = 1.25;
                } else {
                    hourCharge = 1;    //всички останали случаи се заплаща 1 лев
                }
                totalCharge += hourCharge;
                dayCharge += hourCharge;

            }
            System.out.printf("Day: %d - %.2f leva%n", i,dayCharge);
            //dayCharge=0;  // !!! Zero the dayCharge after each day!
        }
        System.out.printf("Total: %.2f leva", totalCharge);
    }
}
