import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // if statement, simple form
        System.out.println("==============if statement, simple form==============");
        if (1000 > 10) {
            System.out.println("Hello world!");
        }
        System.out.println("This is the code after if statement block!\n");

        // if-else statement
        System.out.println("==============if-else statement==============");
        if (10 > 1000) {
            System.out.println("10 is greater than 1000");
        } else {
            System.out.println("10 is not greater than 1000\n");
//            int counter = 1;
//            counter += 1;
//            System.out.printf("Counter: %d", counter);
        }

        // if-else-if ladder
        System.out.println("==============if-else-if ladder==============");
        if (1 > 5) {
            System.out.println("1 is greater than 5");
        } else if (2 > 5) {
            System.out.println("2 is greater than 5");
        } else if (3 > 5) {
            System.out.println("3 is greater than 5");
        } else if (4 > 5) {
            System.out.println("4 is greater than 5");
        } else {
            System.out.println("5 is a champion");
        }
        System.out.println("Have you found a number greater than 5?\n");

        // nested if statement
        System.out.println("==============nested if==============");
        if (5 > 1) {
            System.out.println("5 is greater than 1");
            if (5 > 3) {
                System.out.println("5 is greater than 1 and 3");
                if (5 > 10) {
                    System.out.println("5 is greater than 1, 3 and 10");
                } else {
                    System.out.println("5 is greater than 1 and 3, but not greater than 10\n");
                }
            }
        }

        // switch statement
        System.out.println("==============switch statement 1st scenario==============");
        int number = 5;
//        if (number == 1) {
//            System.out.println("Number is 1");
//        } else if (number == 2) {
//            System.out.println("Number is 2");
//        } else if (number == 3) {
//            System.out.println("Number is 3");
//        } else if (number == 4) {
//            System.out.println("Number is 4");
//        } else if (number == 5) {
//            System.out.println("Number is 5");
//        } else {
//            System.out.println("I don't what this number is!");
//        }

        switch (number) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            case 4:
                System.out.println("Number is 4");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            case 6:
                System.out.println("Number is 6");
                break;
            default:
                System.out.println("I don't know what this number is!");
        }

        System.out.println("==============switch statement 2nd scenario==============");
        // the program will add a month name in the list, and all the months after it
        // don't worry if you don't understand this code
        ArrayList<String> futureMonths = new ArrayList<>();
        int month = 8;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
                break;
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }

        System.out.println("==============comparison operators==============");
        number = 100;
        boolean numberResult = number == 100;

        if (number == 100) {
            System.out.println("Number is equal to a 100");
        }
        if (number != 110) {
            System.out.println("Number is not equal to 110");
        }
        if (number >= 90) {
            System.out.println("Number is greater than or equal to 90");
        }
        if (number > 90) {
            System.out.println("Number is greater than 90");
        }
        if (number == 90) {
            System.out.println("Number is equal to 90");
        } else {
            System.out.println("Number is not equal to 90");
        }
        if (number <= 100) {
            System.out.println("Number is less than or equal to 100");
        }
        if (number < 100) {
            System.out.println("Number is less than 100");
        } else {
            System.out.println("Number is not less than a 100");
        }
    }
}