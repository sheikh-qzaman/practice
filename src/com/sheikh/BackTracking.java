package com.sheikh;

import java.util.*;

public class BackTracking {
    public BackTracking() {
        //List<List<Integer>> list = permute(new int[] {1, 2, 3});
        //List<List<Integer>> list = subsets(new int[] {});
        int[] nums = new int[] {2,5,2,1,2};
        //int[] nums = new int[] {10,1,2,7,6,1,5};
        //List<List<Integer>> list = combinationSum(nums, 8);
        Utils.printList(combinationSum(nums, 5));
        //List<String> list = generateParenthesis(3);
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        //System.out.println(exist(board, "ABCCE", 0, -1, -1));
    }

    public boolean exist(char[][] board, String word, int pos, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i <= row || j <= col) continue;
                else if (board[i][j] == word.charAt(pos) && pos == word.length() - 1) {
                    return true;
                } else if (board[i][j] == word.charAt(pos)) {
                    return exist(board, word, pos + 1, i, j) || exist(board, word, pos + 1, i, j);
                }
            }
        }

        return false;
    }

    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
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

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        //combinationSum(candidates, target, list, lists, 0);
        combinationSum2(candidates, target, list, lists, 0);
        return lists;
    }

    // indx is the previous index
    public void combinationSum(int[] candidates, int target, List<Integer> list, List<List<Integer>> lists, int indx) {
        for (int i = 0; i < candidates.length; i++) {
            if (i < indx) continue;
            if (target == 0) {
                lists.add(new ArrayList<>(list));
                return;
            }else if (target < 0) {
                return;
            }
            else {
                list.add(candidates[i]);
                combinationSum(candidates, target - candidates[i], list, lists, i);
                list.remove(list.size() - 1);
            }
        }
    }

    // indx is the previous index
    public void combinationSum2(int[] candidates, int target, List<Integer> list, List<List<Integer>> lists, int start) {
        if (target == 0) {
            lists.add(new ArrayList<>(list));
        } else if (target > 0) {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) continue;
                list.add(candidates[i]);
                combinationSum2(candidates, target - candidates[i], list, lists, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        subsets(nums, new ArrayList<>(), lists);
        return lists;
    }

    public void subsets(int[] nums, List<Integer> list, List<List<Integer>> lists) {
        if (list.size() < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (!list.contains(nums[i])) {
                    list.add(nums[i]);
                    lists.add(new ArrayList<>(list));
                    subsets(nums, list, lists);
                    list.remove(list.size() - 1);
                }
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permute(nums, new ArrayList<>(), list);
        return list;
    }

    public void permute(int[] nums, List<Integer> tmpList, List<List<Integer>> list) {
        if (tmpList.size() == nums.length) list.add(new ArrayList<>(tmpList));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (!tmpList.contains(nums[i])) {
                    tmpList.add(nums[i]);
                    permute(nums, tmpList, list);
                    tmpList.remove(tmpList.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        new BackTracking();
    }
}
