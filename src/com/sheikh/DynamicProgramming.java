package com.sheikh;

import java.time.Instant;
import java.util.*;
import java.util.LinkedList;


/**
 * Created by squmruzz on 7/12/17.
 */
public class DynamicProgramming {
    public int[][] memoGrid;
    public int[] memoArr;
    public boolean[] memoArrBool;
    public HashMap<String, Integer> map = new HashMap<>();

    public DynamicProgramming() {
        String seq1 = "";
        String seq2 = "";

        /*Rod cutting problem
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int price = cutRod(prices, 10);
        System.out.println("Price: " + price);
        */

        /*Two Sum*/
        /*
        int[] num = {6, 9, 3, 5};
        int[] sum = DynamicProgramming.twoSum(num, 11);
        */

        //System.out.println(DynamicProgramming.lengthOfLongestSubstring("abccdeffbcsar"));

        /*Longest Palindromic Subsequence*/
        //String seq = "GEEKSFORGEEKS";
        //String seq = "abca";
        //System.out.println("The length of the LPS is " + lPSubSequence(seq, 0, seq.length() - 1));
        //this.initialize(seq.length());
        //System.out.println("The length of the LPS (DP memoGrid) is " + this.lpsDPMemo(seq, 0, seq.length() - 1));

        //System.out.println("The length of the LPS (DP Tab) is " + this.lpsDPTab(seq));
        //this.printGrid(this.memoGrid);
        /**/

        /*Longest palindromic substring
        String seq2 = "abcb";
        //String seq2 = "forgeeksskeegfor";
        this.initialize(seq2.length());
        System.out.println("Longest palindromic substring of " + seq2 + " is: " + this.lPSubStringDpTab(seq2));
        this.printGrid(this.memoGrid);
        */

        /*Minimum steps to 1
        int n = 10;
        this.initialize(n);
        System.out.println("(Recursive) Minimum step to 1 of " + n + " is: " + minStepToOne(n));
        this.initialize(n);
        System.out.println("(DP Memoization)Minimum step to 1 of " + n + " is: " + minStepToOneDpMem(n));
        this.initialize(n);
        System.out.println("(DP Tabular) Minimum step to 1 of " + n + " is: " + minStepToOneDPTab(n));
        */

        /*Longest Common Subsequnece
        seq1 = "AGGTAB";
        seq2 = "GXTXAYB";
        this.initialize(seq1.length(), seq2.length());
        System.out.println("Longest common subsequence of " + seq1 + " and " + seq2 + " is " +
                lCSubSequence(seq1, seq2, seq1.length() - 1, seq2.length() - 1));
        System.out.println("Longest common subsequence of " + seq1 + " and " + seq2 + " is " +
                lCSubSequenceDpMemo(seq1, seq2, seq1.length() - 1, seq2.length() - 1));
        // For tabular method, initialize table with length + 1 elements, because the trivial case would be if any or
        // both string are empty then length is 0.
        this.initialize(seq1.length() + 1, seq2.length() + 1);
        System.out.println("Longest common subsequence of " + seq1 + " and " + seq2 + " is " +
                lCSubSequenceDpTab(seq1, seq2, seq1.length(), seq2.length()));
        */

        /*Edit Distance
        seq1 = "saturday";
        seq2 = "sunday";
        System.out.println("Edit distance of " + seq2 + " to " + seq1 + " : " +
                editDistance(seq1, seq2, seq1.length(), seq2.length()));
        */

        /*Fibonacci number
        int n = 10;
        System.out.println(n + " th Fibonacci number is: " + DynamicProgramming.fibonacci(n));
        */

        /* Climb Stairs
        int n = 5;

        //System.out.println(climbStairsRecur(n, 0));
        this.initialize(n);
        //System.out.println(climbStairsMemo(n, 0));
        this.initialize(n + 1);
        System.out.println(climbStairsTab(5));
        */

        /*Recursion test
        int[] n = {0, 1, 2, 3};
        reTest(n, 0, 1);
        */

        /*Unique Paths
        this.initialize(3, 7);
        System.out.println(uniquePaths(3, 7));
        */

        /*House Robber
        int[] nums = {4,1,2,7,5,3,1};
        //int[] nums = {226,174,214,16,218,48,153,131,128,17,157,142,88,43,37,157,43,221,191,68,206,23,225,82,54,118,111,46,80,49,245,63,25,194,72,80,143,55,209,18,55,122,65,66,177,101,63,201,172,130,103,225,142,46,86,185,62,138,212,192,125,77,223,188,99,228,90,25,193,211,84,239,119,234,85,83,123,120,131,203,219,10,82,35,120,180,249,106,37,169,225,54,103,55,166,124};
        //int[] nums = {2, 1, 1, 2};
        this.initialize(nums.length);
        //System.out.println(robHouseRecur(nums, nums.length - 1));
        //System.out.println(robHouseMemo1(nums, nums.length - 1));
        System.out.println(robHouseMemo2(nums));
        */

        /*Perfect Squares
        int n = 1;
        this.initialize(n, "MAX");
        //System.out.println(numSquaresMemo(n));
        this.initialize(n  + 1, "MAX");
        System.out.println(numSquaresTab(n));
        */

        /*Burst Balloons
        int[] A = {3, 1, 5, 8};
        //map = new HashMap<>();
        //System.out.println(maxCoins(A));
        System.out.println(maxCoinsMemo(A));
        */

        /*Min Path Sum
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        this.initialize(grid.length, grid[0].length);
        System.out.println(minPathSum(grid));
        */

        /*Paint House
        int[][] costs = {{1,3,1},{1,5,1},{4,2,1}};
        //int[][] costs = {{7, 6, 2}};
        //this.initialize(costs.length, costs[0].length);
        //System.out.println(paintHouse(grid));
        //System.out.println(paintHouseRecur(costs, costs[0].length - 1, -1));
        //System.out.println(paintHouseMemo(costs, costs.length - 1, -1));
        this.initialize(costs.length, costs[0].length, 0);
        System.out.println(paintHouseTab(costs));
        */

        /*Paint Fence
        int n = 3;
        int k = 1;
        //System.out.println(paintFence(3 - 1, 2, -1 ,-1));
        this.initialize(n, k, 0);
        System.out.println(paintFenceTab(n, k));
        */

        /*Longest increasing subsequence
        int[] nums = {3, 1, 2, 4};
        System.out.println(lISubsequenceRecur(nums, 0, Integer.MIN_VALUE));
        //this.initialize(nums.length + 1, nums.length, 0);
        this.initialize(nums.length,);
        System.out.println(lISubsequenceMemo(nums, 0, Integer.MIN_VALUE));
        */

        /*Maximum Subarray
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        this.initialize(nums.length);
        System.out.println(maxSubarray(nums));
        */

        /*Best Time to Buy and Sell Stock
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
        */


        /*Nim Game
        System.out.println(canWinNim(6));
        */

        //System.out.println(minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        //System.out.println(minCostClimbingStairs(new int[] {1, 0, 0, 1}));

        /*System.out.println(numIslands(new char[][]{
                {'1', '1','0', '0', '0'},
                {'1', '1','0', '0', '0'},
                {'0', '0','1', '0', '0'},
                {'0', '0','0', '1', '1'}}));*/

        /*System.out.println(numIslands(new char[][]{
                {'1', '1','1'},
                {'0', '1','0'},
                {'1', '1','1'}}));*/
        //System.out.println(numIslands(new char[][]{{'0'}}));

        //System.out.println(Instant.now());
        //String[] sArr = new String[]{"leet", "code", "lemon"};
        //String s = "leetcode";
        //String[] sArr = new String[]{"leet", "code", "lemon"};
        String s = "aaab";
        String[] sArr = new String[]{"a", "ab"};
        //System.out.println(wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaab", new ArrayList<String>(Arrays.asList(new String[] {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"}))));
        //System.out.println(wordBreak(s, new ArrayList<String>(Arrays.asList(sArr))));
        //System.out.println(Instant.now());
        //String s = "aabaablbb";
        //System.out.println(lengthOfLongestSubstring(s));
        //System.out.println(longestPalindrome("bcab"));
        this.initialize(11);
        //System.out.println(coinChange(new int[]{1, 2, 5}, 11));

        //List<String> list = generateParenthesis(2);
        //System.out.println(uniquePathsWithObstacles(board));
        int[][] board = {
                {1}
        };
        System.out.println(minPathSum(board));
    }

    public int minPathSum(int[][] grid) {
        int[][] tab = new int[grid.length][grid[0].length];
        for (int r = grid.length - 1; r >= 0; r--) {
            for (int c = grid[0].length - 1; c >= 0; c--) {
                if (r == grid.length - 1 && c == grid[0].length - 1) tab[r][c] = grid[r][c];
                else {
                    if (r + 1 == grid.length) tab[r][c] = tab[r][c + 1];
                    else if (c + 1 == grid[0].length) tab[r][c] = tab[r + 1][c];
                    else tab[r][c] = Math.min(tab[r + 1][c], tab[r][c + 1]);
                    tab[r][c] += grid[r][c];
                    //tab[r][c] = grid[r][c] + ((r + 1 == grid.length) ? tab[r][c + 1] :
                    //        (c + 1 == grid[0].length ? tab[r + 1][c] : Math.min(tab[r + 1][c], tab[r][c + 1])));
                }
            }
        }

        return tab[0][0];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return uniquePWOD(obstacleGrid);
        //return uniquePWO(obstacleGrid, 0, 0);
    }

    public int uniquePWOD(int[][] board) {
        if (board == null || board.length == 0) return 0;
        int[][] memoTab = new int[board.length][board[0].length];
        for (int r = board.length - 1; r >= 0; r--) {
            for (int c = board[0].length - 1; c >= 0; c--) {
                if (board[r][c] == 1) memoTab[r][c] = 0;
                else if (r == board.length -1 && c == board[0].length - 1) memoTab[r][c] = 1;
                else {
                    int bottom = r + 1 < memoTab.length ? memoTab[r + 1][c] : 0;
                    int right = c + 1 < memoTab[0].length ? memoTab[r][c + 1] : 0;
                    memoTab[r][c] =  bottom + right;
                }
            }
        }

        return memoTab[0][0];
    }

    public int uniquePWO(int[][] board, int r, int c) {
        if (r >= board.length || c >= board[0].length)
            return 0;
        else if (board[r][c] == 1) {
            memoGrid[r][c] = 0;
            return 0;
        }
        else if (r == board.length - 1 && c == board[0].length - 1) {
            memoGrid[r][c] = 1;
            return 1;
        }
        else {
            return (r + 1 >= board.length ? 0 : ((memoGrid[r + 1][c] == -1) ? uniquePWO(board, r + 1, c) : memoGrid[r + 1][c])) +
                    (c + 1 >= board[0].length ? 0 : ((memoGrid[r][c + 1] == -1) ? uniquePWO(board, r, c + 1) : memoGrid[r][c + 1]));
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList();
        System.out.println();
        long a = new Date().getTime();
        generateAll(new char[2 * n], 0, combinations);
        long b = new Date().getTime();
        System.out.println(b - a);
        a = new Date().getTime();
        //backtrack(combinations, "", 0, 0, n);
        b = new Date().getTime();
        backTrack(combinations, "",0, 0, n);
        System.out.println(b - a);
        return combinations;
    }

    public void backTrack(List<String> res, String cur, int open, int close, int n) {
        if (cur.length() == 2 * n) {
            res.add(new String(cur));
        }

        if (open < n) {
            backTrack(res, cur + "(", open + 1, close, n);
        }
        if (close < open) {
            backTrack(res, cur + ")" , open, close + 1, n);
        }
    }

    public void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (valid(current))
                result.add(new String(current));
        } else {
            current[pos] = '(';
            generateAll(current, pos+1, result);
            current[pos] = ')';
            generateAll(current, pos+1, result);
        }
    }

    public boolean valid(char[] current) {
        int balance = 0;
        for (char c: current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }

    public int coinChange(int[] coins, int amount) {
        /*int[] memoArr = new int[amount];
        for (int i = 0; i < memoArr.length; i++) {
            memoArr[i] = -1;
        }*/
        //return coinChangeRecur(coins, amount);

        return coinChangeMem(coins, amount, new int[amount]);
    }

    public int coinChangeRecur(int[] coins, int amount) {
        if (amount == 0) return 0;
        else if (amount < 0) return Integer.MAX_VALUE;
        else {
            int cost = Integer.MAX_VALUE;
            for (int coin : coins) {
                int curCost = coinChangeRecur(coins, amount - coin);
                cost = Math.min(cost, (curCost == Integer.MAX_VALUE ? Integer.MAX_VALUE : 1 + curCost));
            }

            return cost;
        }
    }

    public int coinChangeMem(int[] coins, int amount, int[] memoArr) {
        if (amount == 0) return 0;
        else if (amount < 0) return -1;
        else if (memoArr[amount - 1] != 0) return memoArr[amount - 1];
        else {
            int minCost = Integer.MAX_VALUE;
            for (int coin : coins) {
                int curCost = coinChangeMem(coins, amount - coin, memoArr);
                minCost = curCost < minCost ? 1 + curCost : minCost;
            }
            memoArr[amount - 1] = (minCost == Integer.MAX_VALUE) ? -1 : minCost;
            return memoArr[amount - 1];
        }
    }

    public int lengthOfLongestSubstring(String s) {
        BitSet bs = new BitSet(256);

        int i = 0, j = 0, maxLen = 0, curLen = 0;
        while (j < s.length()) {
            // keep i static and move j until s[i] != s[j]
            while ((j < s.length()) && !bs.get(s.charAt(j - '\0'))) {
                bs.set(s.charAt(j++) - '\0');
                curLen++;
            }

            maxLen = curLen > maxLen ? curLen : maxLen;

            if (j >= s.length()) return maxLen;

            // move i to find the first occurance of j
            while (s.charAt(i) != s.charAt(j)) {
                bs.clear(s.charAt(i++) - '\0');
                curLen--;
            }

            bs.clear(s.charAt(i));
            curLen--;
        }

        return maxLen;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        //return wordBreakIter(s, new HashSet(wordDict));
        return wordBreak(s, new HashSet(wordDict), 0);
        //return wordBreakMemo(s, new HashSet(wordDict), 0, new Boolean[s.length()]);
    }

    public boolean wordBreakIter(String s, Set<String> wordDict) {
        int start = 0;

        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end))) start = end;
        }

        return start >= s.length();
    }

    public boolean wordBreak(String s, Set<String> wordDict, int start) {
        if (start == s.length()) {
            return true;
        }

        System.out.println("start: " + start);
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && wordBreak(s, wordDict, end)) {
                return true;
            }
        }
        return false;
    }

    public boolean wordBreakMemo(String s, Set<String> wordDict, int start, Boolean[] map) {
        if (start == s.length()) {
            return true;
        }

        if (map[start] != null) return map[start];

        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && wordBreakMemo(s, wordDict, end, map)) {
                return map[start] = true;
            }
        }

        return map[start] = false;
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        char[][] map = new char[grid.length][grid[0].length];
        int count = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1' && map[row][col] != '1') {
                    markIsland(grid, map, row, col);
                    count++;
                }
            }
        }

        return count;
    }

    public void markIsland(char[][] grid, char[][] map, int row, int col) {
        if (row >= grid.length || row < 0 || col >= grid[0].length || col < 0 || grid[row][col] != '1' || map[row][col] == '1') return;
        else {
            map[row][col] = '1';
            markIsland(grid, map, row + 1, col);
            markIsland(grid, map, row - 1, col);
            markIsland(grid, map, row, col + 1);
            markIsland(grid, map, row, col - 1);
        }
    }

    public int minCostClimbingStairs(int[] cost) {
        return Math.min(minCostClimbingStairsRecur(cost, 0), minCostClimbingStairsRecur(cost, 1));
        //return minCostClimbingStairsTab(cost);
    }

    public int minCostClimbingStairsTab(int[] cost) {
        int[] minCost = new int[cost.length + 1];
        minCost[0] = cost[0];
        minCost[1] = cost[1];

        int i = 2;

        for (; i < cost.length; i++) {
            minCost[i] = cost[i] + Math.min(minCost[i - 2], minCost[i - 1]);
        }

        System.out.println(minCost[i - 1]);

        return Math.min(minCost[i - 2], minCost[i - 1]);
    }

    public int minCostClimbingStairsRecur(int[] cost, int i) {
        if (i >= cost.length) return 0;

        return cost[i] + Math.min(minCostClimbingStairsRecur(cost, i + 1), minCostClimbingStairsRecur(cost, i + 2));
    }

    public boolean canWinNimRecur(int n, int level) {
        if (n < 4) {
            return level % 2 == 0;
        }

        return canWinNimRecur(n - 1, level + 1) ||
                canWinNimRecur(n - 2, level + 1) ||
                canWinNimRecur(n - 3, level + 1);
    }

    public int canWinNimMemo(int n, int level) {
        if (n < 3) {
            if (level % 2 == 0) return memoArr[n] = 1;
            else return memoArr[n] = -1;
        }

        int a = (n - 1 >= 0 && memoArr[n - 1] != 0) ? memoArr[n - 1] : canWinNimMemo(n - 1, level + 1);
        int b = (n - 2 >= 0 && memoArr[n - 2] != 0) ? memoArr[n - 2] : canWinNimMemo(n - 2, level + 1);
        int c = (n - 3 >= 0 && memoArr[n - 3] != 0) ? memoArr[n - 3] : canWinNimMemo(n - 3, level + 1);

        memoArr[n] = a | b | c;

        return memoArr[n];
    }

    public boolean canWinNim(int n) {
        //this.initialize(n);
        //return canWinNimRecur(n, 0);
        //this.initBool();
        //memoArrBool = new boolean[n];
        memoArr = new int[n];
        return canWinNimMemo(n - 1, 0) == 1;
    }


    public int maxProfit(int[] prices) {
        int bPrice = -1;
        int curProfit = 0;
        for(int newPrice : prices) {
            if (bPrice < 0) bPrice = newPrice;
            else {
                if (newPrice < bPrice) {
                    bPrice = newPrice;
                } else if (newPrice - bPrice > curProfit) {
                    curProfit = newPrice - bPrice;
                }
            }
        }

        return curProfit;
    }

    public int maxSubarray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        memoArr[0] = nums[0];
        int maxElem = memoArr[0];
        for (int i = 1; i < nums.length; i++) {
            memoArr[i] = Math.max(nums[i], memoArr[i - 1] + nums[i]);
            if (memoArr[i] > maxElem) maxElem = memoArr[i];
        }
        return maxElem;
    }

    public int lISubsequenceRecur(int[] nums, int curPos, int prevElem) {
        if (nums.length == curPos) return 0;
        int taken = 0;
        if (nums[curPos] > prevElem)
            taken = 1 + lISubsequenceRecur(nums, curPos + 1, nums[curPos]);
        int notTaken = 0;
        notTaken = lISubsequenceRecur(nums, curPos + 1, prevElem);

        return Math.max(taken, notTaken);
    }

    public int lISubsequenceMemo(int[] nums, int curPos, int prevElem) {
        if (nums.length == curPos) return 0;
        int taken = 0;
        if (nums[curPos] > prevElem)
            memoGrid[curPos][0] = 1 + lISubsequenceMemo(nums, curPos + 1, nums[curPos]);
        int notTaken = 0;
        notTaken = lISubsequenceMemo(nums, curPos + 1, prevElem);

        return Math.max(taken, notTaken);
    }

    public int paintFenceTab(int n, int k) {
        int rTotal = 0;
        if (n == 0) return 0;
        if (k == 1 && n > 2) return 0;

        for (int i = 0; i < k; i++) {
            memoGrid[0][i] = 1;
        }

        rTotal = paintFenceCount(0);
        if (n == 1) return rTotal;

        for (int i = 0; i < k; i++) {
            memoGrid[1][i] = rTotal;
        }

        rTotal = paintFenceCount(1);
        if (n == 2) return rTotal;

        for (int j = 2; j < n; j++) {

            for (int i = 0; i < k; i++) {
                memoGrid[j][i] = rTotal - 1;
            }
            rTotal = paintFenceCount(j);
        }

        return rTotal;
    }

    public int paintFenceCount(int r) {
        int count = 0;
        for (int i = 0; i < memoGrid[0].length; i++) {
            count += memoGrid[r][i];
        }

        return count;
    }

    public int paintFence(int n, int colCount, int p1, int p2) {
        int numWays = 0;

        for (int i = 0; i < colCount; i++) {
            System.out.println("n: " + n + " i: " + i + " p1: " + p1 + " p2: " + p2);
            numWays += paintFence(n - 1, colCount, i, p1);
            System.out.println("Ways: " + numWays);
        }

        return numWays;
    }

    public int paintHouseRecur(int[][] grid, int row, int col) {
        int minCost = Integer.MAX_VALUE;
        int cost = 0;
        if (row < 0) {
            return 0;
        }

        for (int i = 0; i < grid[0].length; i++) {
            if (i == col) continue;
            cost = grid[row][i] + paintHouseRecur(grid, row - 1, i);
            minCost = Math.min(minCost, cost);
        }
        return minCost;
    }

    public int paintHouseMemo(int[][] grid, int row, int col) {
        int minCost = Integer.MAX_VALUE;
        int cost = 0;
        if (row < 0) {
            return 0;
        }

        for (int i = 0; i < grid[0].length; i++) {
            System.out.println("row: " + row + " col: " + i + " excl: " + col);
            if (i == col) {
                System.out.println("continue");
                continue;
            }

            memoGrid[row][i] = grid[row][i] + ((row > 0 && memoGrid[row - 1][i] != -1) ? memoGrid[row - 1][i] : paintHouseMemo(grid, row - 1, i));
            minCost = Math.min(minCost, memoGrid[row][i]);
            System.out.println("cost: " + cost + " min cost: " + minCost);
            printGrid(memoGrid);
        }

        System.out.println("Ret minCost: " + minCost);
        return minCost;
    }

    public int paintHouseTab(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                memoGrid[i][j] = grid[i][j] + minPaintCost(i - 1, j);
            }
        }
        return minPaintCost(grid.length - 1, -1);
    }

    public int minPaintCost(int row, int exclCol) {
        if (row < 0) return 0;
        else {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < memoGrid[row].length; i++) {
                if (i == exclCol) continue;
                min = Math.min(memoGrid[row][i], min);
            }

            return min;
        }
    }



    public int minPathSum2(int[][] grid) {
        //return minPathSumRecur(grid, 0, 0);
        return minPathSumMemo(grid, 0, 0);
    }

    public int minPathSumRecur(int[][] grid, int i, int j) {
        if (i == grid.length - 1 && j == grid[0].length - 1) return grid[i][j];
        else if (i == grid.length || j == grid[0].length) return Integer.MAX_VALUE;
        else return grid[i][j] + Math.min(minPathSumRecur(grid, i, j + 1), minPathSumRecur(grid, i + 1, j));
    }

    public int minPathSumMemo(int[][] grid, int i, int j) {
        if (i == grid.length - 1 && j == grid[0].length - 1) memoGrid[i][j] = grid[i][j];
        else if (i == grid.length || j == grid[0].length) memoGrid[i][j] = Integer.MAX_VALUE;
        else {
            int a, b;
            a = b = Integer.MAX_VALUE;
            if (j + 1 < grid[0].length && memoGrid[i][j + 1] > 0) a = memoGrid[i][j + 1];
            else a = minPathSumMemo(grid, i, j + 1);
            if (i + 1 < grid.length && memoGrid[i + 1][j] > 0) b = memoGrid[i + 1][j];
            else b = minPathSumMemo(grid, i + 1, j);
            //int a = (memoGrid[i][j + 1] < 0) ? minPathSumMemo(grid, i, j + 1) : memoGrid[i][j + 1];
            //int b = (memoGrid[i + 1][j] < 0) ? minPathSumMemo(grid, i + 1, j) : memoGrid[i + 1][j];
            memoGrid[i][j] = grid[i][j] + Math.min(a, b);
        }

        return memoGrid[i][j];
    }

    public int[] resizeArray(int[] A, int i) {
        int[] newArr = new int[A.length - 1];
        int offset = 0;
        for (int j = 0; j < A.length - 1; j++) {
            if (j == i) offset = 1;
            newArr[j] = A[j + offset];
        }

        return newArr;
    }

    public String getString(int[] A) {
        String s = "[";
        for (int n : A) {
           s = s.concat(n + ",");
        }
        return s + "]";
    }

    public int maxCoins(int[] A) {
        int max = Integer.MIN_VALUE;
        if (A.length == 0) return 0;
        if (A.length == 1) return A[0];
        for (int i = 0; i < A.length; i++) {
            int val = ((i - 1 < 0 ? 1 : A[i - 1]) * A[i] * (i + 1 == A.length ? 1 : A[i+ 1])) + maxCoins(resizeArray(A, i));
            System.out.println("A: " + getString(resizeArray(A, i)) + " Value: " + val);
            max = Math.max(max, val);
        }
        return max;
    }

    public int maxCoinsMemo(int[] A) {
        int max = Integer.MIN_VALUE;
        if (A.length == 0) return 0;
        if (A.length == 1) map.put(getString(A), 1);
        for (int i = 0; i < A.length; i++) {
            Integer val = map.get(getString(resizeArray(A, i)));
            if (val == null) {
                val = ((i - 1 < 0 ? 1 : A[i - 1]) * A[i] * (i + 1 == A.length ? 1 : A[i+ 1])) + maxCoins(resizeArray(A, i));
                map.put(getString(resizeArray(A, i)), val);
            }
            max = Math.max(max, val);
        }
        return max;
    }

    public int numSquaresTab(int n) {
        memoArr[0] = 0;
        memoArr[1] = 1;
        if(n > 1) memoArr[2] = 2;
        if(n > 2) memoArr[3] = 3;

        for (int i = 4; i <= n; i++) {
            int maxSqrtNum = (int) Math.sqrt(i);
            for (int j = 1; j <= maxSqrtNum; j++) {
                int val = i - (j * j);
                memoArr[i] = Math.min(memoArr[i], 1 + memoArr[val]);
            }
        }

        return memoArr[n];
    }

    public int numSquaresMemo(int n) {
        int maxSqrtNum = (int) Math.sqrt(n);

        if (n - (maxSqrtNum * maxSqrtNum) == 0) {
            return 1;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= maxSqrtNum; i++) {
            int val = n - (i * i);
            memoArr[n - 1] = Math.min(memoArr[n - 1], (1 + ((memoArr[val - 1] != Integer.MAX_VALUE) ? memoArr[val - 1] : numSquaresMemo(val))));
        }

        return memoArr[n - 1];
    }

    public int robHouseRecur(int[] nums, int i) {
        if(i < 0) return 0;
        else if(i == 0) return nums[0];
        else {
            int a = nums[i] + robHouseRecur(nums, i - 2);
            int b = nums[i - 1] + robHouseRecur(nums, i - 3);
            return Math.max(a, b);
        }
    }

    public int robHouseMemo1(int[] nums, int i) {
        if(i < 0) return 0;
        else if(i == 0) return nums[0];
        else {
            memoArr[i] = Math.max(nums[i] + (((i - 2 >= 0) && (memoArr[i - 2] >= 0)) ? memoArr[i - 2] : robHouseMemo1(nums, i - 2)),
                    nums[i - 1] + ((i - 3 >=0 && memoArr[i - 3] >= 0) ? memoArr[i - 3] : robHouseMemo1(nums, i - 3)));
        }

        return memoArr[i];
    }

    public int robHouseMemo2(int[] nums) {
        return Math.max(robHouseMemo1(Arrays.copyOfRange(nums, 0, nums.length - 1), nums.length - 2),
                robHouseMemo1(Arrays.copyOfRange(nums, 1, nums.length), nums.length - 2));
    }

    public int robHouseMemo(int[] nums, int i) {
        if(i < 0) return 0;
        else if(i == 0) return nums[0];
        else {
            if(i - 2 >= 0) memoArr[i] = nums[i] + ((memoArr[i - 2] < 0) ? robHouseMemo(nums, i - 2) : memoArr[i - 2]);
            else memoArr[i] = nums[i];
            if (i - 3 >= 0) memoArr[i - 1] = nums[i - 1] + ((memoArr[i - 3] < 0) ? robHouseMemo(nums, i - 2) : memoArr[i - 3]);
            else memoArr[i - 1] = nums[i - 1];
        }

        return Math.max(memoArr[i], memoArr[i - 1]);
    }

    public int uniquePaths(int m, int n) {
        return uniquePaths(m - 1, n - 1, 0, 0);
        //return uniquePathsMemo(m - 1, n - 1, 0, 0);
        //return uniquePathsTab(m - 1, n - 1);
    }

    public int uniquePaths(int m, int n, int i, int j) {
        if (i == m && j == n) return 1;
        else if (i > m || j > n) return 0;
        else return uniquePaths(m, n, i, j + 1) + uniquePaths(m, n, i + 1, j);
    }

    public int uniquePathsMemo(int m, int n, int i, int j) {
        if (i == m && j == n) return 1;
        else if (i > m || j > n) return 0;
        else {
            memoGrid[i][j] = ((j + 1 <= n && memoGrid[i][j + 1] >= 0) ? memoGrid[i][j + 1] : uniquePathsMemo(m, n, i, j + 1)) +
                    ((i + 1 <= m && memoGrid[i + 1][j] >= 0) ? memoGrid[i + 1][j] : uniquePathsMemo(m, n, i + 1, j));
        }
        return memoGrid[0][0];
    }

    public int uniquePathsTab(int m, int n) {
        for (int i = m; i >= 0; i--) {
            for (int j = n; j >= 0; j--) {
                if (i == m && j == n) memoGrid[i][j] = 0;
                else if ((i == m - 1 && j == n) || (i == m && j == n - 1)) memoGrid[i][j] = 1;
                else {
                    memoGrid[i][j] = ((j + 1 <= n) ? memoGrid[i][j + 1] : 0) +
                            ((i + 1 <= m) ? memoGrid[i + 1][j] : 0);
                }
            }
        }

        return memoGrid[0][0];
    }

    public int reTest(int[] n, int start, int r) {
        if (r >= n.length) {
            return start + 1;
        }
        for (int i = start; i < n.length; i++) {
            System.out.println(n[i] + ":" + n[r]);
            start = reTest(n, start, r + 1);
        }
        return 0;
    }

    public int climbStairsRecur(int n, int pos) {
        if (pos == n) {
            return 1;
        } else if (pos > n) {
            return 0;
        }

        return climbStairsRecur(n, pos + 1) + climbStairsRecur(n, pos + 2);
    }

    public int climbStairsMemo(int n, int pos) {
        if (pos == n) {
            return 1;
        } else if (pos > n) {
            return 0;
        }
        if (memoArr[pos] >= 0) {
            return memoArr[pos];
        } else {
            memoArr[pos] = climbStairsMemo(n, pos + 1) + climbStairsMemo(n, pos + 2);
        }

        return memoArr[pos];
    }

    public int climbStairsTab(int n) {
        memoArr[1] = 1;
        memoArr[2] = 2;
        for (int i = 3; i <= n; i++) {
            memoArr[i] = memoArr[i - 1] + memoArr[i - 2];
        }

        return memoArr[n];
    }

    public int editDistance(String seq1, String seq2, int l1, int l2) {
        if(l1 == 0 && l2 == 0) {
            return 0;
        }else if(l1 == 0 || l2 == 0) {
            return l1 > l2 ? l1 : l2;
        }else if (seq1.charAt(l1 - 1) == seq2.charAt(l2 - 1)) {
            return editDistance(seq1, seq2, l1 - 1, l2 - 1);
        } else {
            return 1 + Utils.min(editDistance(seq1, seq2, l1, l2 - 1),
                    editDistance(seq1, seq2, l1 - 1, l2),
                    editDistance(seq1, seq2, l1 - 1, l2 - 1));
        }
    }

    public int lCSubSequence(String seq1, String seq2, int m, int n) {
        if(m < 0 || n < 0) {
            return 0;
        } else if(seq1.charAt(m) == seq2.charAt(n)) {
            return 1 + lCSubSequence(seq1, seq2, m - 1, n - 1);
        } else {
            return Utils.max(lCSubSequence(seq1, seq2, m, n - 1), lCSubSequence(seq1, seq2, m - 1, n));
        }
    }

    public int lCSubSequenceDpMemo(String seq1, String seq2, int m, int n) {
        if(m < 0 || n < 0) {
            return 0;
        } else if(seq1.charAt(m) == seq2.charAt(n)) {
            memoGrid[m][n] = 1 + lCSubSequenceDpMemo(seq1, seq2, m - 1, n - 1);
        } else {
            memoGrid[m][n] = Utils.max(lCSubSequenceDpMemo(seq1, seq2, m, n - 1), lCSubSequenceDpMemo(seq1, seq2, m - 1, n));
        }
        return memoGrid[m][n];
    }

    public int lCSubSequenceDpTab(String seq1, String seq2, int l1, int l2) {
        for(int i = 0; i <= l1; i++) {
            memoGrid[i][0] = 0;
        }

        for(int j = 0; j <= l1; j++) {
            memoGrid[0][j] = 0;
        }

        for(int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++){
                if(seq1.charAt(i - 1) == seq2.charAt(j - 1)) {
                    memoGrid[i][j] = 1 + memoGrid[i -1][j -1];
                } else {
                    memoGrid[i][j] = Utils.max(memoGrid[i][j - 1], memoGrid[i - 1][j]);
                }
            }
        }
        return memoGrid[l1][l2];
    }

    public int minStepToOne(int n) {
        if(n <= 1) {
            return 0;
        }
        return 1 + Utils.min(minStepToOne(n - 1), n % 2 == 0 ? minStepToOne(n / 2) : Integer.MAX_VALUE,
                n % 3 == 0? minStepToOne(n / 3) : Integer.MAX_VALUE);
    }

    public int minStepToOneDpMem(int n) {
        if (memoArr[ n - 1] != -1) {
            return memoArr[n - 1];
        }else if(n <= 1) {
            memoArr[0] = 0;
        } else if (n > 1 ) {
            memoArr[n - 1] = 1 + Utils.min(minStepToOneDpMem(n - 1), n % 2 == 0 ? minStepToOneDpMem(n / 2) : Integer.MAX_VALUE,
                    n % 3 == 0? minStepToOneDpMem(n / 3) : Integer.MAX_VALUE);
        }

        return memoArr[n - 1];
    }

    public int minStepToOneDPTab(int n) {
        memoArr[0] = 0;
        //memoArr[1] = 1;
        //memoArr[2] = 1;

        for(int num = 2; num <= n; num++) {
            memoArr[num - 1] = 1 + Utils.min(memoArr[(num - 1) - 1], num % 2 == 0 ? memoArr[(num / 2) -1] : Integer.MAX_VALUE,
                    num % 3 == 0 ? memoArr[(num / 3) - 1] : Integer.MAX_VALUE);
        }
        return memoArr[n - 1];
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public int lengthOfLongestSubstring2(String s) {
        BitSet bitSet = new BitSet(256);
        HashSet<Character> hashSet = new HashSet<>();
        int maxLen = 0, length = 0;
        if(s == null || s.length() == 0) {
            return 0;
        }

        for(char c : s.toCharArray()) {
            //if(bitSet.get(Character.getNumericValue(c))) {
            if(hashSet.contains(c)) {
                maxLen = length > maxLen ? length : maxLen;
                bitSet = new BitSet(256);
                hashSet = new HashSet<>();
                length = 1;
            }else {
                bitSet.set(Character.getNumericValue(c));
                hashSet.add(c);
                length++;
            }
        }
        return maxLen > length ? maxLen : length;
    }

    public String longestPalindrome(String s) {
        System.out.println(String.valueOf(new char[]{'a', 'b'}));
        return longestPalindromeIter(s);
        //return longestPalindromeRecur(s, 0, s.length() - 1);
    }
    public String longestPalindromeRecur(String s, int start, int end) {
        if (start > end)  return "";
        else if (start == end) {
            //System.out.println(s.substring(start, end + 1));
            return s.substring(start, end + 1);
        } else if (s.charAt(start) != s.charAt(end)) {
            String s1 = longestPalindromeRecur(s, start, end - 1);
            String s2 = longestPalindromeRecur(s, start + 1, end);

            String str = s1.length() > s2.length() ? s1 : s2;
            //System.out.println(str);
            return str;
        } else {
            longestPalindromeRecur(s, start + 1, end - 1);
            //System.out.println("start: " + start + " end: " + (end - 1) + " " + s.substring(start, end + 1));
            return s.substring(start, end + 1);
        }
    }

    public String longestPalindromeIter(String s) {
        int startIndex = -1;
        int endIndex = -1;
        String palindrome = "";

        for(int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                String sub = s.substring(i, j);
                if(Utils.isPalindrome(sub)) {
                    palindrome = sub.length() > palindrome.length() ? sub : palindrome;
                }
            }
        }

        return palindrome;
    }

    // Returns the length of the longest palindromic subsequence in seq
    public int lPSubSequence(String seq, int i, int j)
    {

        // Base Case 1: If there is only 1 character
        if (i == j)
            return 1;

        // Base Case 2: If there are only 2 characters and both are same
        if (seq.charAt(i) == seq.charAt(j) && i + 1 == j)
            return 2;

        // If the first and last characters match
        if (seq.charAt(i) == seq.charAt(j))
            return lPSubSequence(seq, i+1, j-1) + 2;

        // If the first and last characters do not match
        return Utils.max( lPSubSequence(seq, i, j-1),
                lPSubSequence(seq, i+1, j) );
    }

    public int lpsubstring(String seq, int i, int j) {
        if(i == j) {
            return 1;
        }

        if(seq.charAt(i) == seq.charAt(j) && i + 1 == j) {
            return 2;
        }

        else if (seq.charAt(i) == seq.charAt(j)) {
            return lpsubstring(seq, i + 1, j - 1) + 2;
        }
        return 0;
    }

    public String lPSubStringDpTab(String seq) {
        int n = seq.length();
        if(seq == null || seq == "") {
            return seq;
        }
        int sIndex = 0, eIndex = 0;

        for(int sl = 1; sl <= n; sl++) {
            for(int i = 0; i < n - sl + 1; i++) {
                int j = i + sl - 1;
                if(i == j) {
                    memoGrid[i][j] = 1;
                } else if(seq.charAt(i) == seq.charAt(j) && i + 1 == j) {
                    memoGrid[i][j] = 1;
                    sIndex = i;
                    eIndex = j;
                } else if(seq.charAt(i) == seq.charAt(j) && memoGrid[i+1][j-1] == 1) {
                    memoGrid[i][j] = 1;
                    sIndex = i;
                    eIndex = j;
                }
            }
        }
        return seq.substring(sIndex, eIndex + 1);
    }

    public void initBool(int n) {
        memoArrBool = new boolean[n];
        for (int i = 0; i < n; i++) {
            //this.memoArrBool[i] = null;
        }
    }

    public void initialize(int n) {
        memoArr = new int[n];
        for (int i = 0; i < n; i++) {
            this.memoArr[i] = -1;
        }
    }

    public void initialize(int m, int n) {
        this.initialize(m, n, -1);
    }

    public void initialize(int n, String MAX) {
        memoArr = new int[n];
        for (int i = 0; i < n; i++) {
            this.memoArr[i] = Integer.MAX_VALUE;
        }
    }

    public void initialize(int m, int n, int val) {
        memoGrid = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                this.memoGrid[i][j] = val;
            }
        }
    }

    public int lpsDPMemo(String seq, int i, int j) {
        if(this.memoGrid[i][j] == -1) {
            if(i == j)
                memoGrid[i][j] = 1;
            else if(seq.charAt(i) == seq.charAt(j) && i + 1 == j)
                memoGrid[i][j] = 2;
            else if (seq.charAt(i) == seq.charAt(j))
                memoGrid[i][j] = lpsDPMemo(seq, i+1, j-1) + 2;

            else memoGrid[i][j] = Utils.max(lpsDPMemo(seq, i, j-1), lpsDPMemo(seq, i+1, j));
        }
        return memoGrid[i][j];
    }

    public int lpsDPTab(String seq) {
        int n = seq.length();
        //int[][] memoGrid = new int[n][n];

        for(int sl = 1; sl <= n; sl++) {
            for (int i = 0; i < n - sl + 1; i++) {
                int j = i + sl - 1;
                if(i == j) {
                    memoGrid[i][j] = 1;
                } else if(seq.charAt(i) == seq.charAt(j) && sl == 2) {
                    memoGrid[i][j] = 2;
                }else if(seq.charAt(i) == seq.charAt(j)) {
                    memoGrid[i][j] = memoGrid[i + 1][j - 1] + 2;
                }else {
                    memoGrid[i][j] = Utils.max(memoGrid[i][j - 1], memoGrid[i + 1][j]);
                }
            }
        }

        return memoGrid[0][n-1];
    }

    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public void printGrid(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.printf("%5d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public int cutRod(int[] prices, int length) {
        if(length == 0){
            return 0;
        }
        int q = -1;
        for(int i = 1; i <= length; i++){
            System.out.println("q, " + prices[i-1]);
            q = Integer.max(q, prices[i - 1] + cutRod(prices, length - i));
        }
        return q;
    }

    public static void main(String[] args) {
        new DynamicProgramming();
    }
}
