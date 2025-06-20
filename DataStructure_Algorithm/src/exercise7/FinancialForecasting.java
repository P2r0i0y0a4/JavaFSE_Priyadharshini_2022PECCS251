package exercise7;

public class FinancialForecasting {
	// Method to calculate future value recursively
    public double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: if years is 0, return the present value
        if (years == 0) {
            return presentValue;
        }
        // Recursive case: calculate future value
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

}
