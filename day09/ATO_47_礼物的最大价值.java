/**
 * @title: ATO_47_礼物的最大价值
 * @Author: Lux_er
 * @Date: 2021/11/1 0001 下午 2:26
 * @Description:在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。你可以从棋盘的左上角开始拿格子里的礼物，
 * 并每次向右或者向下移动一格、直到到达棋盘的右下角。给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
 *
 * 示例 1:
 * 输入:
 * [
 *  [1,3,1],
 *  [1,5,1],
 *  [4,2,1]
 * ]
 * 输出: 12
 * 解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物
 */
public class ATO_47_礼物的最大价值 {
    public static void main(String[] args) {

    }
}
class Solution47{
    public int maxValue(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) + grid[i-1][j-1];
            }
        }
        return dp[m][n];
    }
}
// 以上代码逻辑清晰，和转移方程直接对应，但仍可提升效率：当 gridgrid 矩阵很大时， i = 0i=0 或 j = 0j=0 的情况仅占极少数，相当循环每轮都冗余了一次判断。
// 因此，可先初始化矩阵第一行和第一列，再开始遍历递推。
class Solution47_2{
    public int maxValue(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i < n; i++) {
            dp[0][i] += grid[0][i-1];
        }
        for (int i = 1; i < m; i++) {
            dp[i][0] += grid[i-1][0];
        }
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) + grid[i-1][j-1];
            }
        }
        return dp[m][n];
    }
}