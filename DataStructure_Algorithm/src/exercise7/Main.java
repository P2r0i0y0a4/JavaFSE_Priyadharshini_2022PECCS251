package exercise7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FinancialForecasting forecasting = new FinancialForecasting();
        Scanner scanner = new Scanner(System.in);

        // Input present value, growth rate, and number of years
        System.out.print("Enter the present value: ");
        double presentValue = scanner.nextDouble();

        System.out.print("Enter the growth rate (as a decimal): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate future value
        double futureValue = forecasting.calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("The future value after %d years is: %.2f%n", years, futureValue);
        
        scanner.close();
    }
}
