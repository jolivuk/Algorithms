package homework2;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        /*
     START
READ number n
numbers a = 0, i = n
WHILE i > 0
    a = a + i
    i = i / 2
END
         */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();      //1
        int a = 0, i = n;               // 1

        while(i>0){                     // n/2
            a = a + i;                  //1
            i = i / 2;                  //1

        }
        // оценка сложности task #4 => 1 + 1 + n/2 * 2 = O(n)
    }
}
