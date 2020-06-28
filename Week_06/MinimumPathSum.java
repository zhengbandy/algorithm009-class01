package Week_06;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int a = grid.length;
        int b = grid[0].length;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if ( i == 0 && j == 0) {
                    grid[i][j] = grid[i][j];
                }else if (i == 0) {
                    grid[i][j] = grid[i][j-1] + grid[i][j];
                }else  if (j ==0) {
                    grid[i][j] = grid[i-1][j] + grid[i][j];
                }else {
                    grid[i][j] = grid[i][j] + Math.min(grid[i-1][j], grid[i][j-1]);
                }
            }
        }
        return grid[a-1][b-1];
    }
}
