import java.util.*;

public class Ex_2_2_5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        double sum = a + b;
        System.out.println("The sum is " + sum);
        
        double diff = Math.abs(a - b);
        System.out.println("The difference is " + diff);
        
        double prod = a * b;
        System.out.println("The product is " + prod);
        
        String x = "The sum is " + sum + "\nThe difference is " + diff + 
        		"\nThe product is " + prod;
        
        if (b != 0) {
        	double quot = a / b;
        	x += "\nThe quotient is " + quot;
        } else {
        	x += "\nCannot divide by zero!!!";
        }
        System.out.println(x);
        scanner.close();
	}    
}

   
