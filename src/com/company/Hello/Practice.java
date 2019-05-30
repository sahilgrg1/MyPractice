package com.company.Hello;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0) {
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            int[] nums = new int[num1];
            for (int i = 0; i < num1; i++) {
                nums[i] = s.nextInt();

            }
            max(nums, num2);

        }
    }

    public static void max(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int max;
        int min;
        int sum = 0;
        int c;
        for (int i = 0; i <= nums.length - k; i++) {
            max = nums[i];
            min = nums[i];
            for (int j = 1; j < k; j++) {
                if (nums[i + j] > max) {
                    max = nums[i + j];
                }
                if (nums[i + j] < min) {
                    min = nums[i + j];
                }

            }
            c = min + max;
            list.add(c);


        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);

        }
        System.out.println(sum);

    }
}