import java.util.*;

public class Ex_2_2_6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int deg = 0;
        
        while (true) {
            System.out.print("Enter the degree of equation (1 or 2): ");
            int input1 = sc.nextInt();
            if (input1 == 1 || input1 == 2) {
                deg = input1;
                break;
            } else {
                System.out.println("Invalid input, try again.");
            }
        }

        int variable = 0;
        
        while (true) {
            if (deg == 1) {
                System.out.print("Enter the number of variables (1 or 2): ");
                int input2 = sc.nextInt();
                if (input2 == 1 || input2 == 2) {
                    variable = input2;
                    break;
                } else {
                    System.out.println("Invalid input, try again.");
                }
            } else { 
                variable = 1; 
                break;
            }
        }

        System.out.println("Degree selected: " + deg);
        System.out.println("Number of variables: " + variable);
        
        // Case 1: Linear, 1 variable
        if (deg == 1 && variable == 1) {
            int a;
            while (true) {
                System.out.print("Enter a (for ax + b = 0): ");
                int a0 = sc.nextInt();
                if (a0 != 0) {
                    a = a0; 
                    break;
                } else {
                    System.out.println("Invalid input, a must differ from 0, try again.");
                }
            }
            System.out.print("Enter b (for ax + b = 0): ");
            int b = sc.nextInt();
            double result = -(double)b / a;
            System.out.println("The solution is x = " + result);
        }
        
        // Case 2: Linear, 2 variables
        if (deg == 1 && variable == 2) {
            System.out.print("Enter a11 (for a11*x1 + a12*x2 = b1): ");
            int a11 = sc.nextInt();
            System.out.print("Enter a12 (for a11*x1 + a12*x2 = b1): ");
            int a12 = sc.nextInt();
            System.out.print("Enter b1 (for a11*x1 + a12*x2 = b1): ");
            int b1 = sc.nextInt();
            System.out.print("Enter a21 (for a21*x1 + a22*x2 = b2): ");
            int a21 = sc.nextInt();
            System.out.print("Enter a22 (for a21*x1 + a22*x2 = b2): ");
            int a22 = sc.nextInt();
            System.out.print("Enter b2 (for a21*x1 + a22*x2 = b2): ");
            int b2 = sc.nextInt();
            
            int D = a11 * a22 - a12 * a21;
            int D1 = b1 * a22 - b2 * a12;
            int D2 = a11 * b2 - a21 * b1;
            
            if (D != 0) {
                double x1 = (double) D1 / D;
                double x2 = (double) D2 / D;
                System.out.println("Unique solution:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else {
                if (D1 == 0 && D2 == 0) {
                    System.out.println("The system has infinitely many solutions.");
                } else {
                    System.out.println("The system has no solution.");
                }
            }
        }
        
        // Case 3: Quadratic, 1 variable
        if (deg == 2 && variable == 1) {
            int a;
            while (true) {
                System.out.print("Enter a (for a*x^2 + b*x + c = 0): ");
                int a0 = sc.nextInt();
                if (a0 != 0) {
                    a = a0; 
                    break;
                } else {
                    System.out.println("Invalid input, a must differ from 0, try again.");
                }
            }   
            
            System.out.print("Enter b (for a*x^2 + b*x + c = 0): ");
            int b = sc.nextInt();
            
            System.out.print("Enter c (for a*x^2 + b*x + c = 0): ");
            int c = sc.nextInt();
            
            double delta = b * b - 4.0 * a * c;
            
            if (delta == 0) {
                double x = - (double)b / (2 * a);
                System.out.println("The equation has one double root:");
                System.out.println("x = " + x);
            } else if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two distinct real roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else {
                System.out.println("The equation has no real solution.");
            }
        }
        
        sc.close();
    } 
}



