package oop_kp;

public class NumberAnalysis extends MathematicalOperations {
    
    @Override 
    public double calculate() {
        return 0;
    }
    
    public String primeCheck() {
        
        double[] ops = getOperands();
        double n = ops[0];
        
        if ( n <= 1 ) {
            return "Not a prime number.";
        } 
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                // If n is divisible by any number in this range, it is not prime
                return "Not a prime number.";
            }
        }
       
        return "A prime number.";
    }
    
    public String Factorial() {
        
        double[] ops = getOperands();
        double n = ops[0];
        long result = 1;
        
        if ( n < 0 ) {
            return "The factorial is not defined for negative numbers.";
        }   else {
        for (int i = 1; i<= n; i++) {
            result *= i;
            }
        }
        return String.valueOf(result) + ".";
    }
    
}
