public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public boolean lemonadeChange(int[] bills) {
        int d5 = 0;
        int d10 = 0;
        int d20 = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                d5++;
            }
            if (bills[i] == 10) {
                d10++;
                d5--;
                if (d5 < 0) {
                    return false;
                }
            }
            if (bills[i] == 20) {
                d5--;
                d20++;
                if (d10 > 0) {
                    d10--;
                } else {
                    d5 = d5-2;
                }
                if (d5 < 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
