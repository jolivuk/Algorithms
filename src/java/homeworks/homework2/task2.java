package homework2;

import java.util.Scanner;

public class task2 {


    public static void main(String[] args) {



/*
task #2

START
READ number n
numbers i = 0, j = 0, a = 0
FOR i = n/2, i <= n; i + 1
    FOR j = 2, j <= n, j * 2
        a = a + n / 2
END
 */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();      //1
        int i = 0, j = 0, a = 0;        // 3
        for (i = n/2; i <=n ; i++) {    // 1 + n/2 * 2
            for (j = 2; j <=n ; j = j * 2) { // 1 + 1* (n/2) + 1 * n/2
                a = a + n / 2; // 1 * n/2
            }
        }

        // оценка сложности task #2 => 1 + 3 + (1+ n)*(1+n/2+n/2) = 4 + (1+n) * (1 + n) = O(n*n)
    }
}
