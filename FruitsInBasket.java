import java.util.HashMap;
public class FruitsInBasket {

    public static int solve(int[] fruits) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int maxFruits = 0;
        int left = 0;

        for (int right = 0; right < fruits.length; right++) {
            // Add the current fruit to the basket
            mpp.put(fruits[right], mpp.getOrDefault(fruits[right], 0) + 1);

            // If we have more than 2 types of fruits, shrink the window from the left
            while (mpp.size() > 2) {
                mpp.put(fruits[left], mpp.get(fruits[left]) - 1);
                if (mpp.get(fruits[left]) == 0) {
                    mpp.remove(fruits[left]);
                }
                left++;
            }

            // Update the maximum number of fruits in the basket
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }

    public static void main(String[] args) {
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println("Maximum number of fruits: " + solve(fruits)); // Output: 5
    }
}






