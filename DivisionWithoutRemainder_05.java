package BASIC.Additional_Problems_MIX.ExamPrepMay19;

import java.util.Scanner;

public class DivisionWithoutRemainder_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p2 = 0;   // counters
        int p3 = 0;
        int p4 = 0;
          // hint - 1 num can be divided simultaneously to 2, 3 and 4 -> use only If
        for (int i = 1; i <= n; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            if (current % 2 == 0) {
                p2++;
            }
            if (current % 3 == 0) {
                p3++;
            }
            if (current % 4 == 0) {
                p4++;
            }
        }
        double percentP2 = 1.0 * p2 / n * 100;
        double percentP3 = 1.0 * p3 / n * 100;
        double percentP4 = 1.0 * p4 / n * 100;

        System.out.printf("%.2f%%%n", percentP2);
        System.out.printf("%.2f%%%n", percentP3);
        System.out.printf("%.2f%%", percentP4);


    }
}
