package ChapterFive;

public class ModifiedInterestRate {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;
        //double rate = 0.05;

        System.out.println ("Year\t" + "Amount");
        for (int year = 1; year < 11; year++){

            amount = principal * Math.pow (1 + 0.05, year);
            System.out.println (year + " \t\t" + amount);
        }
        System.out.println ();
        System.out.println ("Year\t" + "Amount");
        for (int year = 1; year < 11; year++){

            amount = principal * Math.pow (1 + 0.06, year);
            System.out.println (year + " \t\t" + amount);
        }
        System.out.println ();
        System.out.println ("Year\t" + "Amount");
        for (int year = 1; year < 11; year++){

            amount = principal * Math.pow (1 + 0.07, year);
            System.out.println (year + " \t\t" + amount);
        }
        System.out.println ();
        System.out.println ("Year\t" + "Amount");
        for (int year = 1; year < 11; year++){

            amount = principal * Math.pow (1 + 0.08, year);
            System.out.println (year + " \t\t" + amount);
        }
        System.out.println ();
        System.out.println ("Year\t" + "Amount");
        for (int year = 1; year < 11; year++){

            amount = principal * Math.pow (1 + 0.09, year);
            System.out.println (year + " \t\t" + amount);
        }
        System.out.println ();
        System.out.println ("Year\t" + "Amount");
        for (int year = 1; year < 11; year++){

            amount = principal * Math.pow (1 + 0.10, year);
            System.out.println (year + " \t\t" + amount);
        }
    }
}
