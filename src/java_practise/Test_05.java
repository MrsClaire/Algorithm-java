package java_practise;

//https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6?tpId=13&tqId=11157&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
//输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
// 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。

public class Test_05 {
    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { value = x; }//构造方法
    }
    //主函数
    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode tn = reConstructBinaryTree(pre,in);
        printTree(tn);
    }
    //重建二叉树函数
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode tn = new TreeNode(pre[0]);

        tn.value = pre[0];
        if(pre.length == 1){//如果数组长度为1，直接置其左右子树为空，返回该树
            tn.left = null;
            tn.right = null;
            return tn;
        }
        int i = 0;
        for(i = 0; i < pre.length; i++) {//找出根节点在中序遍历数组中的位置
            if(tn.value == in[i]) {
                break;
            }
        }
        if(i>0){
            //创建左子树
            int[] leftpre = new int[i];
            int[] leftin = new int[i];
            for(int j = 0; j < i; j++) {
                leftpre[j] = pre[j + 1];//左子树的前序序列
                leftin[j] = in[j];//左子树的中序序列
            }

            tn.left = reConstructBinaryTree(leftpre, leftin);//对左子树进行判断
        }else
            tn.left = null;

        if(pre.length - 1 - i > 0) {

            //创建右子树
            int[] rightpre = new int[pre.length - 1 - i];
            int[] rightin = new int[pre.length - 1 - i];
            for(int j = 0; j < pre.length - 1 - i; j++) {
                rightpre[j] = pre[j + 1 + i];
                rightin[j] = in[j + 1 + i];
            }
            tn.right = reConstructBinaryTree(rightpre, rightin);

        }else
            tn.right = null;

        return tn;
    }
    //先序打印二叉树
    public static void printTree(TreeNode tn) {
        if(tn != null) {
            printTree(tn.left);
            System.out.println(tn.value);
            printTree(tn.right);
        }
    }

}



