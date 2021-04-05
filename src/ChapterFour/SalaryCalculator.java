package ChapterFour;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        int hoursWorked;
        double payRatePerHour;
        double workerPay;
        double overtimePayAndRegular;
        int numberOfWorker = 1;

        while(numberOfWorker <= 3) {
            System.out.print ( "Enter Hours Worked: " );
            hoursWorked = input.nextInt ();
            System.out.print ( "Enter Pay Rate per Hour: " );
            payRatePerHour = input.nextDouble ();
            if (hoursWorked <= 40) {
                workerPay = hoursWorked * payRatePerHour;
                System.out.println ("Total pay is: " + workerPay);
            }
            if (hoursWorked > 40) {
                double overtimePay = (hoursWorked - 40) * (payRatePerHour / 2);
                overtimePayAndRegular = overtimePay + (40 * payRatePerHour);

            System.out.println ("Total Pay Is: " + overtimePayAndRegular);}
            numberOfWorker++;
        }
    }
}
