package java_practise;
//https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
//请实现一个函数，将一个字符串中的空格替换成“%20”。
// 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

public class Test_03 {
    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("I am ljx")));
    }
    public static String replaceSpace(StringBuffer str) {
        String str1 = str.toString();
        String str2 = str1.replace(" ","%20");
        return str2;
    }
}

