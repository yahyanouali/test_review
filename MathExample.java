public class MathExample {
    public static void main(String[] args) {
        // Absolute Value
        double num = -10.5;
        double absoluteValue = Math.abs(num);
        System.out.println("Absolute value of " + num + " is "
         + absoluteValue);

        // Power
        double base = 3;
        double exponent = 4;
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " 
        + exponent + " is " + result);

        // Square Root
        double number = 16;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of " + number + " is " + squareRoot);

        // Trigonometric Functions
        double angleInRadians = Math.PI / 4; // 45 degrees
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);
        System.out.println("Sine: " + sine + ", Cosine: " 
        + cosine + ", Tangent: " + tangent);

        // Rounding
        double roundingNum = 5.67;
        long roundedNum = Math.round(roundingNum);
        System.out.println("Rounded value of "
         + roundingNum + " is " + roundedNum);

        // Random Number
        double randomNum = Math.random(); // Generates a random double 
        /// value between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println("Random number: " + randomNum);
    }
}
