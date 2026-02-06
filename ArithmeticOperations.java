package oop_kp;

public class ArithmeticOperations extends MathematicalOperations {
    
    @Override
    public double calculate(){
        return 0;
    }
    
    public double addAll() {
        
        double[] ops = getOperands();
        
        if (ops == null || ops.length == 0) {
        return 0;
        }
        
        double sum = 0;
        
        for (double val : ops ) {
            sum += val;
        }
        return sum;
    }
    
    public double multiplyAll() {
        
        double[] ops = getOperands();
        
        if (ops == null || ops.length == 0) {
        return 0;
        }
        
        double sum = 1;
        
        for (double val : ops ) {
            sum *= val;
        }
        
        return sum;
    }
    
    public double subtractAll() {
        double[] ops = getOperands();
        
        double result = ops[0];
        
        for ( int i = 1; i < ops.length; i++ ) {
            result -= ops[i];
        }
        return result;
    }
    
    public String divideAll() {
        double [] ops = getOperands();
        
        double result = ops[0];
        
        for ( int i = 1; i < ops.length; i++ ) {
            if ( ops[i] == 0 ) {
                return "Undefined";
            }
            result /= ops[i];
        }
        return String.valueOf(result);
    }
    
    

    
}
