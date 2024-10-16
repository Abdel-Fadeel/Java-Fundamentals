package net.javafundamentals.firstapp.package1;


public class Main {
    public static void main(String[] args) {
        getNumberInfo(10);
    }

    public static void getNumberInfo(int number) {
        do {
            int digitsCount = 0;
            int digitsSum = 0;
            int newNumber = 0;

            do {
                int remainder = number % 10;
                System.out.println(remainder);
                digitsSum += remainder;
                newNumber += remainder * remainder;
                number /= 10;
                digitsCount++;
            } while (number > 0);

            System.out.println("Digits Count is " + digitsCount);
            System.out.println("Digits Sum is " + digitsSum);
            System.out.println("New Number is " + newNumber);

            number = newNumber;
        } while ((number != 1 && number != 89 && number != 145 && number != 42 && number != 20 && number != 4 && number != 16 && number != 37 && number != 58));
    }
}