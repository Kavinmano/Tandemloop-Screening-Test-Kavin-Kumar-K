package Problem_4;

//Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]

import java.util.HashMap;

public class Program4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : arr) {
                if (num % i == 0)
                    count++;
            }
            countMap.put(i, count);
        }

        System.out.println(countMap);
    }
}
