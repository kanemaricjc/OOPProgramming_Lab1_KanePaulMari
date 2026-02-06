package oop_kp;

public abstract class MathematicalOperations {
    
    private double[] operands;
    
    public void setOperands(double... values) {
        this.operands = values;
    }
    
    
    
    public double[] getOperands() {
        return operands;
    }
    
    public abstract double calculate();
}
