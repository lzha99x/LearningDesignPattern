package LeetCode.LeetCode;

import java.util.Arrays;

class FindMinArrowShots_452 {
    
    public int findMinArrowShots(int[][] points) {

        if (points.length == 0) {
            return 0;
        }

        Arrays.sort(points, (points1, points2) -> {
            if (points1[1] > points2[1]) {
                return 1;
            } else if (points1[1] < points2[1]) {
                return -1;
            } else {
                return 0;
            }
        });

        int ans = 1;
        int pos = points[0][1];

        for (int[] balloon : points) {
            if (balloon[0] > pos) {
                pos = balloon[1];
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println("ret = " + new FindMinArrowShots_452().findMinArrowShots(points));
    }
}
