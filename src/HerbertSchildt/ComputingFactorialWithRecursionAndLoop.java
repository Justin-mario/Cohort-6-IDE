package HerbertSchildt;

public class ComputingFactorialWithRecursionAndLoop {
        int factorial(int number) {
            int result;
            if (number == 1)
                return 1;
            result = factorial ( number - 1 ) * number;
            return result;
        }
            int factorial1(int number) {
                int table, result;

                result = 1;
                for (table = 1; table <= number; table++)
                    result *= table;
                return result;

            }


    }

