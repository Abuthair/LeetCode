package Coding;

import java.util.Scanner;

/**
 * @author abuthair on 10/03/23.
 * 4:43 pm
 * @project LeetCode
 */
public class Number_of_Steps_to_Reduce_a_Number_to_Zero_problemNo1342 {
    public  static int FindSteps(int num){
        int steps = 0;
        while(num > 0){
            if(num % 2 == 0){
                num/=2;
            }
            else{
                num--;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(FindSteps(num));
    }
}
