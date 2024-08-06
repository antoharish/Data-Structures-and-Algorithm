
package Mitsogo;

import java.util.*;

public class steppingNumbers {
    public static List<Integer> findSteppingNumbers(int n, int m) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i <= 9; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            if (current >= n && current <= m) {
                result.add(current);
            }
            
            if (current != 0 && current <= m) {
                int lastDigit = current % 10;
                
                int stepDown = current * 10 + (lastDigit - 1);
                int stepUp = current * 10 + (lastDigit + 1);
                
                if (lastDigit > 0 && stepDown <= m) {
                    queue.add(stepDown);
                }
                
                if (lastDigit < 9 && stepUp <= m) {
                    queue.add(stepUp);
                }
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Enter M: ");
        int m = sc.nextInt();
        
        List<Integer> steppingNumbers = findSteppingNumbers(n, m);
        System.out.println("Stepping Numbers in the range [" + n + ", " + m + "]: " + steppingNumbers);
    }
}
