package Coding;

import java.util.Scanner;

/**
 * @author abuthair on 09/03/23.
 * 10:55 am
 * @project LeetCode
 */
public class RicheshestCustomerProblemNo1672 {
    public static int maximumWealth(int[][] accounts) {
        int MaxCustomerAcc = 0;
        for (int current[]: accounts) {
            int currentWealthAcc = 0;
            for (int acc:current) {
                currentWealthAcc+=acc;
            }
            MaxCustomerAcc = Math.max(MaxCustomerAcc,currentWealthAcc);
        }
        return MaxCustomerAcc;
    }
}
