package hackerrank_algorithms;

import java.io.*;
import java.util.*;

public class AVeryBigSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int len = 0;
        len = sc.nextInt();
        int[] arr = new int[len];
        long sum = 0;
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
