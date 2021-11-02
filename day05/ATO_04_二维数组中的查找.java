/**
 * @title: ATO_04_二维数组中的查找
 * @Author: Lux_er
 * @Date: 2021/10/22 0022 上午 9:43
 * @Description:在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 示例:
 * 现有矩阵 matrix 如下：
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * 给定 target=5，返回true。
 * 给定target=20，返回false。
 */

// 算法流程：
// 从矩阵 matrix 左下角元素（索引设为 (i, j) ）开始遍历，并与目标值对比：
// 当 matrix[i][j] > target 时，执行 i-- ，即消去第 i 行元素；
// 当 matrix[i][j] < target 时，执行 j++ ，即消去第 j 列元素；
// 当 matrix[i][j] = target 时，返回 true ，代表找到目标值。
// 若行索引或列索引越界，则代表矩阵中无目标值，返回 false 。
// 每轮 i 或 j 移动后，相当于生成了“消去一行（列）的新矩阵”， 索引(i,j) 指向新矩阵的左下角元素（标志数），因此可重复使用以上性质消去行（列）。

public class ATO_04_二维数组中的查找 {
    public static void main(String[] args) {

    }
}
// 从数组的左下角或右上角出发遍历
class Solution04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) i--;
            else if (matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }
}