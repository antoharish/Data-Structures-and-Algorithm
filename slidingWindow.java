package Mitsogo;
import java.util.Scanner;

public class slidingWindow {
    public static int getMaxToys(int prices[], int money) {
        int n = prices.length;
        int maxToys = 0;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            currentSum += prices[end];

            while (currentSum > money) {
                currentSum -= prices[start];
                start++;
            }

            maxToys = Math.max(maxToys, end - start + 1);
        }

        return maxToys;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int money = sc.nextInt();
        System.out.println(getMaxToys(prices, money));
    }
}