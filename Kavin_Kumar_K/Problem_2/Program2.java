package Problem_2;

//With a single integer as the input, generate the following until a = x

import java.util.*;

public class Program2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        for (int i = 1; i <= a * 2 - 1; i += 2) {
            System.out.print(i);
            if (i < a * 2 - 1)
                System.out.print(", ");
        }
    }
}
