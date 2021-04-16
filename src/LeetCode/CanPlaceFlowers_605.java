/**
 * 输入：flowerbed = [1,0,0,0,1], n = 1
 * 输出：true
 * 
 * 输入：flowerbed = [1,0,0,0,1], n = 2
 * 输出：false
*/
package LeetCode;

public class CanPlaceFlowers_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int m = flowerbed.length;
        int prev = -1;

        for (int i = 0; i < m; i++) {
            if (flowerbed[i] == 1) {
                if (prev < 0) {
                    count +=i/2;
                } else {
                    count += (i - prev -2)/2;
                }
                prev = i;
            }
        }

        if (prev < 0) {
            count += (m + 1)/2;
        } else {
            count += (m - prev -1)/2;
        }
        System.out.println("Count = " + count);
        return count >= n;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,0,0,0,1};
        boolean ret = false;
        CanPlaceFlowers_605 test = new CanPlaceFlowers_605();

        ret = test.canPlaceFlowers(arr, 1);
        System.out.println(ret);
    }
}
