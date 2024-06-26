package homework2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /*
        START
READ number n
number a = 0
FOR i = 0, i < n, i + 1
    FOR j = n, j > i, j - 1
        a = a + i + j
END
         */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();      //1
        int a = 0;                      // 1
        for (int i = 0; i < n ; i++) {    // 1 + n * 2
            for (int j = n; j > i  ; j--) { // 1 + 1* (n/2) + 1 * n
                a = a + i + j;   // n
            }
        }

        // оценка сложности task #3 => 1 + 1 + (1+ 2n)*(1+n/2+n + n) = 4 + (1+2n) * (1 + 3/2*n) = O(n*n)
    }
}
