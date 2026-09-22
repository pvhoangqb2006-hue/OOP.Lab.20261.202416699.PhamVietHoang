import java.util.*;

public class Ex_6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] months = {
            {"1","jan","jan.","january"},
            {"2","feb","feb.","february"},
            {"3","mar","mar.","march"},
            {"4","apr","apr.","april"},
            {"5","may","may."},
            {"6","jun","jun.","june"},
            {"7","jul","jul.","july"},
            {"8","aug","aug.","august"},
            {"9","sep","sep.","september"},
            {"10","oct","oct.","october"},
            {"11","nov","nov.","november"},
            {"12","dec","dec.","december"}
        };

        int month = -1, year = -1;

        while (month == -1) {
            System.out.print("Enter month: ");
            String input = sc.nextLine().toLowerCase().trim();
            for (String[] m : months)
                for (String alias : m)
                    if (alias.equals(input))
                        month = Integer.parseInt(m[0]);
            if (month == -1)
                System.out.println("Invalid month, try again.");
        }

        while (year < 0) {
            System.out.print("Enter year: ");
            String input = sc.nextLine().trim();
            if (input.matches("\\d+"))
                year = Integer.parseInt(input);
            else
                System.out.println("Invalid year, try again.");
        }

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && ((year%4==0 && year%100!=0) || year%400==0))
            days[1] = 29;

        System.out.println("Month " + month + " of year " + year + " has " + days[month-1] + " days.");
        sc.close();
    }
}


