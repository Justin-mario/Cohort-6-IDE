package javaClass;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        int day = 1;

        while (day <= 12) {
            System.out.print(" On the ");


            switch (day) {
                case 1:
                    System.out.print("First ");
                    break;

                case 2:
                    System.out.print("Second ");
                    break;

                case 3:
                    System.out.print("Third ");
                    break;

                case 4:
                    System.out.print("Fourth ");
                    break;

                case 5:
                    System.out.print("Fifth ");
                    break;

                case 6:
                    System.out.print("Sixth ");
                    break;

                case 7:
                    System.out.print("Seventh ");
                    break;

                case 8:
                    System.out.print("Eight ");
                    break;

                case 9:
                    System.out.print("Ninth ");
                    break;

                case 10:
                    System.out.print("Tenth ");
                    break;

                case 11:
                    System.out.print("Eleventh ");
                    break;

                case 12:
                    System.out.print("Twelfth ");
                    break;

            }


            System.out.println(" Day my true love gave to me ");


                switch (day) {
                    case 12:
                        System.out.println(" Twelve Drummers drumming. ");



                    case 11:
                        System.out.println(" Eleven Pipers Piping ");



                    case 10:
                        System.out.println(" Ten Lords a leaping ");



                    case 9:
                        System.out.println(" Nine Ladies Dancing ");



                    case 8:
                        System.out.println(" Eight Maids a milking ");



                    case 7:
                        System.out.println(" Seven Swans a swimming ");



                    case 6:
                        System.out.println(" Six Geese a laying ");



                    case 5:
                        System.out.println(" Five Golden rings ");



                    case 4:
                        System.out.println(" Four Calling birds ");



                    case 3:
                        System.out.println(" Three French hen ");



                    case 2:
                        System.out.println(" Two Turtle doves ");



                    case 1:
                        System.out.println(" A partridge in a pear tree  \n");

                        break;



                }


            day++;
        }
    }
}