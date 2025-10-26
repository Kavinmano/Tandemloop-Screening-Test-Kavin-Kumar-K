package Problem_3;

//With a single integer as the input, generate the following until a = x

import java.util.*;

public class Program3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int limit;
        if (a % 2 == 0)
            limit = a - 1;
        else
            limit = a;

        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i);
            if (i < limit - 1)
                System.out.print(", ");
        }
    }
}
