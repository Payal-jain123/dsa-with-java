public class LemonadeChange {
    static boolean lemonade(int[] bills) {
        int five = 0, ten = 0;
        int n = bills.length;
        for (int i = 0; i < n; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //int [] bills = {5, 5, 10, 10, 20};//false
        int [] bills = {5, 5, 5, 10, 20};//true
        boolean canChange = lemonade(bills);
        System.out.println("Can change: " + canChange);
    }
}