package hackerrank_algorithms;

import java.io.*;
import java.util.*;

public class SimpleArraySum{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int sum = 0;
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
