public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public int maxProfit(int[] prices) {
        int[] min = new int[prices.length];

        int res = 0;
        if (prices.length <=1) {
            return 0;
        }
        if (prices[1] > prices[0]) {
            min[0] = prices[0];
        }else {
            min[0] = -1;
        }
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i-1]  && min[i-1] == -1) {
                min[i] = -1;
            }
            if (prices[i] < prices[i-1]  && min[i-1] != -1) {
                res = res + prices[i-1] - min[i-1];
                min[i] = -1;
            }
            if (prices[i] >= prices[i-1] && min[i-1] == -1) {
                min[i-1] = prices[i-1];
                min[i] = min[i-1];
            }
            if (prices[i] >= prices[i-1] && min[i-1] != -1) {
                min[i] = min[i-1];
            }
        }
        if (min[prices.length-1] != -1){
            res = res + prices[prices.length-1] - min[prices.length-1];
        }
        return res;
    }

}
