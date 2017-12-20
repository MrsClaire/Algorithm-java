package java_practise;

import java.util.Scanner;
//写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号
public class test_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.Add(num1, num2));
    }

}

class Solution {
    public int Add(int num1,int num2) {
        while (num2!=0) {
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;
    }
}