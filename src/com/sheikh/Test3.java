package com.sheikh;

public class Test3 {
    public Test3() {
        //System.out.println(climbStairs(0, 3));
        //System.out.println(climbStairsTab(4));
        int[] arr = new int[]{2,7,9,3,1};
        //System.out.println(houseRobber(arr, arr.length - 1));
        System.out.println(houseRobberTab(arr));
    }

    public int climbStairs(int j, int n) {
        if (j == n) return 1;
        else if (j > n) return 0;
        else return climbStairs(j + 1, n) + climbStairs(j + 2, n);
    }

    public int climbStairsTab(int n) {
        int[] memoTab = new int[n + 1];
        memoTab[0] = 0;
        if (n > 0) memoTab[1] = 1;
        if (n > 1) memoTab[2] = 2;

        for (int i = 3; i <= n; i++)
            memoTab[i] = memoTab[i - 1] + memoTab[i - 2];

        return memoTab[n];
    }

    public int houseRobber(int[] nums, int j) {
        if (j < 0) return 0;
        return Math.max(nums[j] + houseRobber(nums, j - 2), j == 0 ? 0 : nums[j - 1] + houseRobber(nums, j - 3));
    }

    public int houseRobberTab(int[] nums) {
        if (nums.length == 0) return 0;
        int[] memoTab = new int[nums.length];
        memoTab[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            memoTab[i] = Math.max((nums[i] + (i - 2 < 0 ? 0 : memoTab[i - 2])), ((i - 1 < 0 ? 0 : memoTab[i - 1])));
        }

        return memoTab[nums.length - 1];
    }

    public static void main(String[] args) {
        new Test3();
    }
}
