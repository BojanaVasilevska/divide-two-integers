
public class DivideTwoIntegers {
	
	public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        int quotient = 0;
        while (absDividend >= absDivisor) {
            long temp = absDivisor;
            long multiple = 1;
            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            absDividend -= temp;
            quotient += multiple;
        }
        return isNegative ? -quotient : quotient;
    }

	public static void main(String[] args) {
		 DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();

	        int dividend = 10;
	        int divisor = 3;

	        int quotient = divideTwoIntegers.divide(dividend, divisor);

	        System.out.println("Quotient: " + quotient);
	}

}
