package LeetCode.LeetCode;

import java.util.Arrays;
// cotr
public class FindContentChildren {
    
    
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int numOfChildren = g.length, numOfCookies = s.length;

        Arrays.sort(g);
        Arrays.sort(s);

        for (int i = 0,j = 0; i < numOfChildren && j < numOfCookies; i++, j++) {
            while (j < numOfCookies && g[i] > s[j]) {
                j++;
            }

            if ( j < numOfCookies) {
                count++;
            }
        }

        return count;
    }
}
