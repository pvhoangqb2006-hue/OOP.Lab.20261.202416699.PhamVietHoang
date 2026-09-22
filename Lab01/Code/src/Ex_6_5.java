import java.util.Scanner;

public class Ex_6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] numbers = new int[n];
            System.out.print("Enter '" + n + "' integers: ");
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }
            
            sortArray(numbers);
            System.out.print("Sorted array: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("Sum: " + sumArray(numbers));
            System.out.println("Average: " + averArray(numbers));
        } finally {
            sc.close();
        }
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int averArray(int[] array) {
        int avg = sumArray(array) / array.length;
        return avg;
    }
}

