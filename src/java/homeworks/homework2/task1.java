package homework2;

import java.util.Scanner;

public class task1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();      // 1
        if (n == 1) return;             // 1
        for (int i = 1; i <= n; i++) {  // 1 + n*2
            for (int j = 1; j <= n; j++) {// 1 + 1*2
                System.out.println("*"); // 1
                break;  // 1
            }
        }
    // оценка сложности task #1 = 1 + 1 + 1 + n*2 * (1 + 1 * 2) = 3 + n*6 = O(n)

    }
}
