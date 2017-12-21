package java_practise;

import java.util.Scanner;

//在一个二维数组中，每一行都按照从左到右递增的顺序排序，
// 每一列都按照从上到下递增的顺序排序。
// 请完成一个函数，输入这样的一个二维数组和一个整数，
// 判断数组中是否含有该整数

//从左下角开始查找
public class Test_02 {
    public static void main(String[] args){
        int[][] array = {{1, 2, 3, 5, 7, 8, 9, 10, 11},
                        {2, 3, 4, 5, 8, 10, 11, 13, 15},
                        {3, 4, 5, 6, 10, 11, 14, 18, 20},
                        {5, 6, 8, 10, 15, 18, 20, 25, 29},
                        {7, 10, 20, 27, 36, 41, 47, 50, 56},
                        {10, 12, 23, 29, 48, 57, 63, 77, 99}};
        System.out.println(find(20, array));
        System.out.println(find(19, array));
    }
    public static boolean find(int target, int [][] array) {
        int m = array.length;//行
        int n = array[0].length;//列

        int x = m-1;  //行
        int y = 0;    //列
        while(x >= 0 && y <= n - 1){
            if(target < array[x][y]){
                x--;//上移1行
            }else if(target > array[x][y]){
                y++;//右移1列
            }else {//查到
                return true;
            }
        }
        return false;
    }
}


