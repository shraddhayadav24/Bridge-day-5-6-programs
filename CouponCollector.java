package com.bridge.pb;

import java.util.Random;

public class CouponCollector {
	public static int[] generateCouponNumbers(int n) {
        int[] couponNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            couponNumbers[i] = i + 1;
        }
        return couponNumbers;
    }

    public static int generateRandomCoupon(int n) {
        Random random = new Random();
        return random.nextInt(n) + 1;
    }

    public static int collectCoupons(int n) {
        boolean[] collected = new boolean[n];
        int distinctCount = 0;
        int totalRandomNumbers = 0;

        while (distinctCount < n) {
            int randomCoupon = generateRandomCoupon(n);
            totalRandomNumbers++;

            if (!collected[randomCoupon - 1]) {
                collected[randomCoupon - 1] = true;
                distinctCount++;
            }

           
            boolean allCollected = true;
            for (int i = 0; i < n; i++) {
                if (!collected[i]) {
                    allCollected = false;
                    break;
                }
            }
            if (allCollected) {
                break;
            }
        }

        return totalRandomNumbers;
    }

    public static void main(String[] args) {
        int n = 10; 
        int totalRandomNumbersNeeded = collectCoupons(n);
        System.out.println("Total random numbers needed to have all distinct numbers: " + totalRandomNumbersNeeded);
    }


}
