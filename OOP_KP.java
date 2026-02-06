package oop_kp;
import java.util.Arrays;

public class OOP_KP {

    public static void main(String[] args) {
        
        
        
        ArithmeticOperations arith = new ArithmeticOperations();
        GeometryOperations geo = new GeometryOperations();
        NumberAnalysis nal = new NumberAnalysis();
        //arith.operands = new double[]{1,2,3};   //Test case 1.1 - Attribute Protection
        //I attempted to modify the internal data of "arith" directly, but since it is private, the data cannot be modified without setters.
        
        arith.setOperands(15,10);   //Test Case 2.1 - Addition Operation
        System.out.println("The result of adding " + Arrays.toString(arith.getOperands())  + " is: " + arith.addAll() + "." );
        
        arith.setOperands(20,0);    //Test Case 2.2 - Division by Zero
        System.out.println("The result of dividing " + Arrays.toString(arith.getOperands())  + " is: " + arith.divideAll()+ "." );
        
        geo.setOperands(5);         //Test Case 3.1 - Circle Area Calculation
        System.out.println("The area of a circle that has a radius of " + Arrays.toString(geo.getOperands()) + " is: " + geo.ComputeArea() + ".");
        
        geo.setOperands(-3);        //Test Case 3.2 - Invalid Shape Dimension
        System.out.println("The area of a circle that has a radius of " + Arrays.toString(geo.getOperands()) + " is: " + geo.ComputeArea() + ".");
        
        nal.setOperands(7);         //Test Case 4.1 - Prime Number Check
        System.out.println("The number " + Arrays.toString( nal.getOperands() ) + " is: " + nal.primeCheck() );
        
        nal.setOperands(10);        //Test Case 4.2 - Non-prime Number Check
        System.out.println("The number " + Arrays.toString( nal.getOperands() ) + " is: " + nal.primeCheck() );
        
        nal.setOperands(5);         //Test Case 4.3 - Factorial Computation
        System.out.println("The factorial of the number " + Arrays.toString( nal.getOperands() ) + " is: " + nal.Factorial() );
        
    }
    
}
        
        /*  
            The class hierarchy is as follows: The base/parent class is named MathematicalOperations. All child classes are ArithmeticOperations, GeometryOperations, and NumberAnalysis.
            All attributes are defined as private in order to avoid direct external modification, which means the values can only be modified through setters and the data can only be taken through getters.
            Inheritance is important for this activity to avoid errors. Without inheritance, each classes would need to have their own way of handling data. In this way, only the base class handles the data and each child class can get the data from the base class through getters.
    */