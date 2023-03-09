package Coding;

import java.util.Scanner;

/**
 * @author abuthair on 09/03/23.
 * 10:18 am
 * @project LeetCode
 */
public class RunningSumInArrayProblemNo1480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int space = sc.nextInt();
        int [] N  =new int[space];
        for (int i = 0; i < space; i++) {
            N[i] = sc.nextInt();
        }
        System.out.println((FindRunningSum(N)));
    }
    static int[] FindRunningSum(int [] N){
        int [] answer = new int[N.length];
        answer[0]=N[0];
        for (int i = 1; i < N.length ; i++) {
            answer[i] = N[i]+answer[i-1];
        }
        return answer;
    }
}
