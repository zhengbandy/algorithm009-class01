package Week_06;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int maxSide = 0;
        if(matrix == null || matrix.length==0 || matrix[0].length ==0){
            return maxSide;
        }
        int[][] temp = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    if(i==0||j==0){
                        temp[i][j]=1;
                    }else {
                        temp[i][j]=Math.min(Math.min(temp[i-1][j],temp[i][j-1]),temp[i-1][j-1])+1;
                    }
                    maxSide = Math.max(maxSide, temp[i][j]);
                }
            }
        }
        return maxSide*maxSide;
    }
}
