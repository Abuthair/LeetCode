package Coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author abuthair on 08/03/23.s
 * 10:49 pm
 * @project LeetCode
 */


public class FizzBuzz_ProblemNo412 {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> answer =  new ArrayList<>();
        for(int i = 1; i <= n ; i++){
            Boolean divisibleBy3 = i % 3 == 0;
            Boolean divisibleBy5 = i % 5 == 0;
            if(divisibleBy3 && divisibleBy5){
                answer.add("FizzBuzz");
            } else if (divisibleBy3) {
                answer.add("Fuzz");
            } else if (divisibleBy5) {
                 answer.add("Buzz");
            }
            else{
                answer.add(String.valueOf(i));
            }

        }
        return  answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fizzBuzz(n));
    }
}
