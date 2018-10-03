package com.sheikh;

import java.util.*;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by squmruzz on 6/13/17.
 */
public class Test2 {
    public enum directions {
        left, right, up, down
    }

    public HashMap<Character, Integer> map;

    public Test2() {
        String str = "";
        /*String to integer
        str = "12345";
        System.out.println(myAtoi(str));
        */

        /*Container With Most Water
        int heights[] = {55, 44, 55, 8, 3, 44};
        System.out.println(containerWithMostWater(heights));
        */

        /*Three sum
        int[] elements = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(elements));
        */

        /*Letter Combinations of a Phone Number
        System.out.println(letterCombinations("24"));
        */

        /**/
        //System.out.println(strStr("ab", "babc", 0, 0));
        /**/

        /*
        nums = {1};
        int[] res = searchRange(nums, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i : res) {
            sb.append(i + ',');
        }
        sb.append(']');
        System.out.println(sb.toString());
        */

        /*
        String[] boardStrArr = {".87654321","2........","3........","4........","5........","6........","7........","8........","9........"};
        char[][] board = new char[9][9];
        int row = 0;
        for (String s : boardStrArr) {
            for (int col = 0; col < 9; col++) {
                board[row][col] = s.charAt(col);
            }
            row++;
        }
        System.out.println(validSudoku(board));
        */

        /*Count and Say
        System.out.println(countAndSay(4));
        */

        /*Generate Permutation
        str = "ABC";
        int n = str.length();
        permute(str, 0, n-1);
        */

        /*Group anagrams
        String[] strArr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = groupAnagrams(strArr);
        */

        /*Power
        System.out.println(myPow(2, -7));
        */

        /*Maximum sub array
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        //int[] nums = {-3, 1};
        System.out.println(maxSubarrayRecur(nums, nums.length - 1));
        //System.out.println(maxSubArray(nums));
        */

        /*Jump Game
        int[] nums = {2, 3, 1};
        int[] dp = new int[nums.length];
        //dp[nums.length - 1] = 1;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = -1;
        }
        System.out.println(jumpGame(nums, 0, dp));
        */

        /*Merge Intervals
        //int[][] ints = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ints = {{2, 4}, {1, 5}};
        List<Interval> intervalsList = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            intervalsList.add(new Interval(ints[i][0], ints[i][1]));
        }
        mergeIntervals(intervalsList);
        */
        /*Permutation
        int[] nums = {1, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        List<List<Integer>> lists = new ArrayList<>();
        this.permuation(nums, 0, nums.length - 1, lists);
        System.out.println(lists);
        */
        /*Word Search in Matrix
        char[][] M = {
            {'A','B','C','E'},
            {'B','F','C','S'},
            {'A','D','E','E'}
        };

        HashSet<String> visitMap = new HashSet<>();
        String S = "ABFDAB";
        char c = 'A';
        char r = (char) (c ^ 256);
        System.out.println(r);
        System.out.println((char) (r ^ 256));
        //System.out.println(wordSearch(M, S));
        Node cur = new Node(2, 3);
        //System.out.println(wordSearch2(M, S, cur, null, S.length() - 1, 2, 3, visitMap));
        */

        /*Decode Ways
        String S = "0";
        char[] charMap = {'#', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        //System.out.println(decodeWays(S, S.length() - 1, charMap));
        System.out.println(numDecodings(S));
        */
        /*Word Bread
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        wordDict.add("is");
        //System.out.println(wordBreak("leeticode", wordDict));
        System.out.println(wordBreakMemo("leeticode", wordDict));
        */
        /*Number of One
        numOfOne(256);
        */

        /*Perfect Square
        //System.out.println(numSquares(12));

        int num = 61;
        TreeNode3 root = new TreeNode3(num);
        numSquaresCreateTree(root);
        Queue<TreeNode3> queue = new LinkedList<>();
        queue.add(root);
        queue.add(new TreeNode3(-1));
        //System.out.println(numSquaresMinBFS(queue, 0));

        System.out.println(numSquaresRecur(num));

        */

        /*Counting Bits
        System.out.println(Utils.printArray(countBits(5)));
        */

        /*Add Two Numbers
        int[] nums1 = {1};
        int[] nums2 = {9, 9};
        //ListNode listNode = ListNode.getListNode(nums1);
        addTwoNumbers(ListNode.getListNode(nums1), ListNode.getListNode(nums2));
        */

        /*Roman to Integer
        this.romanToIntMap();
        System.out.println(romanToInt("XCIX"));
        */

        /*Reverse String
        System.out.println(reverseString("hello"));
        */

        /*Single Number
        int[] nums = {1,3,1,4,4};
        System.out.println(singleNumber(nums));
        */

        /*Longest Common Prefix
        //String[] strs = {"abc", "abcdef", "ab"};
        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));
        */

        /*Hamming Distance
        System.out.println(hammingDistance(1, 4));
        */

        /*Palindrome Number
        System.out.println(isPalindrome(-2147483648));
        */

        /*Jewels and Stones
        System.out.println(numJewelsInStones("z", "ZZ"));
        */

        /*Reverse Integer
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2, 31));
        */

        /*Sum of Two Integers*/
        //System.out.println(getSum(1, 2));;
        /**/

        /*Array Partition
        int nums[] = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
        */

        /*Plus One
        int[] digits = {9, 9, 9};
        System.out.println(Utils.printArray(plusOne(digits)));
        */

        /*Hamming Weight
        System.out.println(hammingWeight(1));
        */

        /*Move Zeroes
        int nums[] = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        */

        /*Add Digits
        System.out.println(addDigits(38));
        */

        /*Contains Duplicate*/
        /**/

        /*Happy Number
        System.out.println(isHappy(18));
        */

        /*Add Binary
        System.out.println(addBinary("10101010", "111001"));
        */

        /*Judge Route Circle
        System.out.println(judgeCircle("LL"));
        */

        /*Island Perimeter
        int[][] grid = {{0,1,0,0},
                        {1,1,1,0},
                        {0,1,0,0},
                        {1,1,0,0}};
        System.out.println(islandPerimeter(grid));
        */

        /*Contains Duplicate II
        System.out.println(containsNearbyDuplicate(new int[] {1, 2, 3, 4, 1, 5}, 3));
        */

        /*Pascal's Triangle
        System.out.println(generate(10));
        */

        /*Remove Element
        int[] arr = {3,2,2,3};
        System.out.println(removeElement(arr, 3));
        */

        /*Remove Duplicates from Sorted Array
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));;
        */

        /*Factorial Trailing Zeroes
        System.out.println(trailingZeroes(13));
        */

        /*
        System.out.println(isPowerOfThree(8));
        */

        /*Find Anagram Mappings
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};
        int[] P = anagramMappings(A, B);
        */

        /*Valid Anagram
        System.out.println(isAnagram("anagram", "nagaram"));
        */

        /*Two Sum
        int[] res = twoSum(new int[]{0,4,3,0}, 0);
        */

        /*Self dividing numbers
        //System.out.println(isSelfDividing(11));
        List<Integer> list = selfDividingNumbers(1, 22);
        */

        /*First Unique Character in a String/
        System.out.println(firstUniqChar("loveleetcode"));
        */

        /*Palindrome Number
        isPalindrome(121);
        */

        /*Reverse Integer
        //System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse(-1234));
        */

        /*Sum of Two Integers
        System.out.println(getSum(2, 3));
        */

        /*Fizz Buzz
        List<String> list = fizzBuzz(15);
        */

        /*Valid Palindrome
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        */

        /*Valid Palindrome II
        System.out.println(validPalindrome("abcda"));
        */

        /*Merge two sorted arrays
        int[] nums1 = {0};
        int[] nums2 = {1};

        merge(nums1, 0, nums2, nums2.length);
        */

        /*Implement strStr()
        //System.out.println(strStr("hello", "ll"));
        System.out.println("".indexOf(""));
        */

        /*Power of Three
        System.out.println(isPowerOfThree(9));
        */

        /*Two Sum II - Input array is sorted
        int[] res = twoSum2(new int[]{2,7,11,15}, 21);
        */

        /*Missing Number
        System.out.println(missingNumber(new int[] {0}));
        */

        /*Reverse Words in a String III
        System.out.println(reverseWords(" "));
        */

        /*Find All Numbers Disappeared in an Array
        List<Integer> list = findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1});
        */

        /*Rotate Array
        int[] nums = new int[] {1,2,3,4,5,6};
        rotate(nums, 3);
        */

        /*Power of Two
        //System.out.println(isPowerOf2(30));
        //System.out.println(isPowerOfFour(20));
        System.out.println(findComplement(0));
        */

        /*Reverse Vowels of a String
        //System.out.println(reverseVowels("aA"));
        int i = 'a' - '\0';
        System.out.println(i);
        */

        /*Degree of an Array*/
        //System.out.println(findShortestSubArray(new int[] {1, 2, 2, 3, 1}));
        /**/

        //System.out.println(countPrimes(2));

        //System.out.println(isOneBitCharacter(new int[] {1, 1, 1, 0}));

        //int[] nums = new int[] {-2,0,3,-5,2,-1};
        //NumArray numArray = new NumArray(nums);
        //System.out.println(numArray.sumRange(5, 5));

        //System.out.println(isUgly(8));

        //System.out.println(nthUglyNumber(1352));
        //System.out.println(isIsomorphic("ab", "bb"));
        //System.out.println(reverseBits(1));
        //System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 2));

        //System.out.println(firstBadVersion(2));
        //System.out.println(wordPattern("abba", "dog cat cat fish"));
        //System.out.println(findTheDifference("abcd", "abcde"));
        //System.out.println(singleNumber2(new int[] {2,3,3,3}));
        //System.out.println(lengthOfLastWord("Hello World"));
        //System.out.println(lengthOfLongestSubstring("abcdbe"));
        //System.out.println(lengthOfLongestSubstring2("abcdbe"));
        //System.out.println(longestPalindrome("abbc"));
        //String s = "cbadc";
        //System.out.println(longestPalindromeRecur(s, 0, s.length() - 1));

        /*Min Stack
        MinStack3 minStack = new MinStack3();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());;
        minStack.pop();
        System.out.println(minStack.top());;
        System.out.println(minStack.getMin());;
        */

        //System.out.println(reverseBits(43261596));
        //System.out.println(guessNumber(108));
        //System.out.println(getSum(200, 3));
        //int[] nums = new int[] {1,2};
        //rotate(nums, 1);
        //System.out.println(reverseBits(43261596));
        //System.out.println(productExceptSelf(new int[] {1,2,3,4}));
        //System.out.println(intToRoman(1));
        //System.out.println(letterCombinations("23"));
        //groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
        //System.out.println(reverseWords3("       a     b "));
        //System.out.println(myAtoi("words and -987"));
        //System.out.println(myAtoi("-000000000000000000000000000000000000000000000000001"));
        //System.out.println(maxProduct(new int[] {2,3,-2,4}));
        //int[][] matrix = new int[][]{{5, 1, 9,11}, {2, 4, 8,10}, {13, 3, 6, 7}};
        int[][] matrix = new int[][]{{1}};
        //rotate(matrix);
        //System.out.println(findMin(new int[] {1,2}));
        //System.out.println(search(new int[] {3,4,5,6,1,2}, 3));
        //System.out.println(search(new int[] {2}, 1));
        //List<Integer> list = spiralOrder(matrix);
        //System.out.println(findDuplicate(new int[] {1,3,4,2,2}));
        //countBits(5);
        //int[][] matrix = new int[][] {{1,3,5,7,9},{2,4,6,8,10},{11,13,15,17,19},{12,14,16,18,20},{21,22,23,24,25}};
        //int[][] matrix = new int[][] {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        //int[][] matrix = new int[][] {};
        //System.out.println(searchMatrix(matrix, 13));
        //permute(new int[] {1, 2, 3});
        //System.out.println(productExceptSelf(new int[] {1,2,3,4}));
        //System.out.println(isPalindrome(-1122311));
        //System.out.println(containerWithMostWater(new int[] {2, 2, 5, 1, 6}));
        //List<Integer> list = topKFrequent(new int[] {2,2,3,3,3,3,1,1,1}, 2);
        /* Can attend meeting
        int[][] ints = {{0, 8}, {5, 10},{9, 20}};
        //int[][] ints = {{7, 10}, {2, 4}};
        //int[][] ints = {{6, 10}, {13, 14}, {12, 14}};
        List<Interval> intervalsList = new ArrayList<>();
        Interval[] intervals = new Interval[ints.length];
        for (int i = 0; i < ints.length; i++) {
            intervals[i] = new Interval(ints[i][0], ints[i][1]);
        }

        //System.out.println(canAttendMeetings(intervals));
        System.out.println(minMeetingRooms(intervals));
        */

        //System.out.println(multiply("123456789", "987654321"));

        //System.out.println(ListNode.toString(addTwoNumbers(ListNode.getListNode(new int[] {5}), ListNode.getListNode(new int[] {5}))));
        //int[] nums = new int[]{5, 2, 4, 3, 1};
        //int[] nums = new int[]{1,1,5};
        //int[] nums = new int[]{1};
        //nextPermutation(nums);
        //System.out.println(nums.toString());
        //int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        //int[] nums = new int[]{0, 0, 0, 0};
        //List<List<Integer>> lists = threeSum(nums);
        //Utils.printList(lists);
        //int[] nums = new int[] {-1, 2, 1, -4};
        //System.out.println(threeSumClosest(nums, -1));
        //System.out.println(threeSumClosest(nums, 2));
        int[] nums = new int[] {5,7,7,8,8,10};
        //System.out.println(majorityElement(nums));
        //List<String> list = summaryRanges(nums);
        System.out.println(Utils.printArray(searchRange(nums, 6)));
    }

    public int[] searchRange(int[] nums, int target) {
        // find the element
        int ind = binarySearch(nums, target, 0, nums.length - 1);
        if (ind == -1) return new int[]{-1, -1};
        // expand on left
        int i = ind, j = ind;
        while (i >= 0 && nums[i] == target) i--;
        while (j < nums.length && nums[j] == target) j++;

        return new int[] {i + 1, j - 1};
    }

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        List<String> strings = new ArrayList<>();
        int start = nums[0];
        int end = start;

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num - 1 == end) end = num;
            else {
                if (start == end) strings.add("" + start);
                else strings.add(start + "->"+ end);
                start = end = num;
            }
        }

        if (start == end) strings.add("" + start);
        else strings.add(start + "->"+ end);

        return strings;
    }

    public int majorityElement(int[] nums) {
        Integer i = null;
        int count = 0;

        for (int num : nums) {
            if (i == null) {
                i = num;
                count++;
            } else if (i == num){
                count++;
            } else {
                count--;
                if (count == 0) i = null;
            }
        }

        return i;
    }

    public int threeSumSmaller(int[] nums, int target) {
        //sort the array, to exclude duplicate first number
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1, k = nums.length - 1, newTarget = target - nums[i];
            while (j < k) {
                if (nums[j] + nums[k] <= target) {
                    lists.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[++j]);
                    while (j < k && nums[k] == nums[--k]);
                } else if (nums[j] + nums[k] > newTarget) k--;
            }
        }

        return lists.size();
    }

    public int threeSumClosest(int[] nums, int target) {
        //sort the array, to exclude duplicate first number
        Arrays.sort(nums);
        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            //skip same elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            //search subarry using two pointers
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int curSum = nums[j] + nums[k] + nums[i];
                if (curSum == target) return curSum;
                else if (curSum > target) k--;
                else j++;
                //updating minimum sum based on distance from target
                if (sum == Integer.MAX_VALUE || Math.abs(target - curSum) < Math.abs(target - sum)) sum = curSum;
            }
        }

        return sum;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        //sort the array, to exclude duplicate first number
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1, k = nums.length - 1, target = -nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    lists.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[++j]);
                    while (j < k && nums[k] == nums[--k]);
                } else if (nums[j] + nums[k] > target) k--;
                else j++;
            }
        }

        return lists;
    }

    public void nextPermutation(int[] nums) {
        int i, prev = Integer.MIN_VALUE;
        for (i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < prev)  break;
            prev = nums[i];
        }

        if (i < 0) {
            reverse(nums, 0);
            return;
        }
        //nums[i] will be less than nums[i+1]
        //search from the end for the first number greater than nums[i] and swap them
        for (int j = nums.length - 1; j > i; j--) {
            if (nums[j] > nums[i]) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                break;
            }
        }

        reverse(nums, i + 1);
    }

    public void reverse(int[] nums, int k) {
        for (int i = k, j = nums.length - 1; i < j; i++, j--) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

    public String nextClosestTime(String time) {
        int[] digits = new int[time.length()];
        Arrays.sort(digits);
        int i = 0;
        for (char c : time.toCharArray()) {
            if (c != ':') digits[i++] = c - '0';
        }

        for (i = time.length() - 1; i >= 0; i--) {
            for (int j = 0; j < digits.length; j++) {
                if (digits[j] > time.charAt(i) - '0') {
                }
            }
        }

        return "";
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode head = null;

        while (!s1.isEmpty() || !s2.isEmpty()) {
            int s = (s1.isEmpty() ? 0 : s1.pop()) + (s2.isEmpty() ? 0 : s2.pop()) + carry;
            carry = s > 9 ? 1 : 0;
            ListNode node = new ListNode(s % 10);
            node.next = head;
            head = node;
        }

        if (carry > 0) {
            ListNode node = new ListNode(carry);
            node.next = head;
            head = node;
        }

        return head;
    }

    public String multiply(String num1, String num2) {
        if (num1.length() == 0 || num2.length() == 0)
            return num1.length() == 0 ? num2 : num1;
        String mul = "";
        for (int i = num2.length() - 1, j = 0; i >= 0; i--, j++) {
            String s = getMul(num1, num2.charAt(i) - '0');
            mul = getSum(mul, s, j);
        }

        return mul;
    }

    private String getMul(String num1, int num) {
        if (num == 0) return "0";
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = num1.length() - 1; i >= 0; i--) {
            int m = (num1.charAt(i) - '0') * num + carry;
            carry = m / 10;
            sb.append(m % 10);
        }

        if (carry > 0) sb.append(carry);
        return sb.reverse().toString();
    }

    private String getSum(String num1, String num2, int i) {
        if (num1.length() == 0) return num2;
        while (i-- != 0) {
            num2 = num2.concat("0");
        }
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int j = num2.length() - 1, k = num1.length() - 1; j >= 0; j--, k--) {
            int sum = num2.charAt(j) - '0' + carry;
            if (k >= 0) {
                sum += num1.charAt(k) - '0';
            }

            carry = sum > 9 ? 1 : 0;
            sb.append(sum % 10);
        }

        return sb.reverse().toString();
    }

    public int containerWithMostWater(int[] height) {
        System.out.println(Integer.MAX_VALUE);
        if(height.length < 2) {
            return 0;
        }
        int maxArea = 0, tmpArea, i = 0, j = height.length - 1;

        while (i < j) {
            tmpArea = Math.min(height[i], height[j]) * (j - i);
            maxArea = tmpArea > maxArea ? tmpArea : maxArea;
            if (height[i] > height[j]) j--;
            else i++;
        }

        return maxArea;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0, prod = 1; i < nums.length; i++) {
            arr[i] = prod;
            prod *= nums[i];
        }

        for (int i = nums.length - 1, prod = 1; i >= 0; i--) {
            arr[i] *= prod;
            prod *= nums[i];
        }

        return arr;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        permuteRecur(nums, lists, new ArrayList<>());
        System.out.println(lists);
        return lists;
    }

    public void permuteRecur(int[] nums, List<List<Integer>> lists, List<Integer> list) {
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (list.contains(nums[i])) continue;
                list.add(nums[i]);
                permuteRecur(nums, lists, list);
                System.out.println("returned: i: " + i + " list: " + list);
                list.remove(new Integer(nums[i]));
            }
        }
    }

    public int findKthLargest(int[] nums, int k) {
        return 0;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        else if (matrix[0].length == 0) return false;

        for (int row = 0, col = matrix[0].length - 1; row < matrix.length && col >= 0; row++, col--) {
            if (target == matrix[row][col]) return true;
            else if (target < matrix[row][col]) {
                int ret = binarySearch(matrix[row], target, 0, col - 1);
                if (ret != -1) return true;
            } else if (target > matrix[row][col]) {
                int ret = binarySearchColumn(matrix, target, row + 1, matrix.length - 1, col);
                if (ret != -1) return true;
            }
        }

        return false;
    }

    public int binarySearchColumn(int[][] matrix, int target, int startRow, int endRow, int col) {
        if (endRow < startRow) return -1;
        int mid = (endRow - startRow) / 2 + startRow;
        if (target == matrix[mid][col]) return target;
        else if (target < matrix[mid][col]) return binarySearchColumn(matrix, target, startRow, mid - 1, col);
        else return binarySearchColumn(matrix, target, mid + 1, endRow, col);
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix.length > 0 && matrix[0].length < 1) return false;
        int row = 0;
        for (; row < matrix.length; row++) {
            if (target < matrix[row][0]) break;
        }

        if (--row < 0) return false;

        return binarySearch(matrix[row], target, 0, matrix[row].length - 1) != -1 ? true : false;
    }

    public int[] countBits(int num) {
        int[] arr = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            arr[i] = arr[i >> 1] + i % 2;
        }

        return arr;
    }

    public int findDuplicate(int[] nums) {
        int total = 0, acTotal = 0;

        for (int i = 1; i < nums.length; i++) {
           total += i;
        }

        for (int i = 0; i < nums.length; i++) {
            acTotal += nums[i];
        }

        return acTotal - total;
    }

    public List<Integer> spiralOrder2(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        if (matrix.length == 0) return list;

        int m = matrix.length;
        int n = matrix[0].length;

        for (int layer = 0; layer < (m - 1) / 2 + 1; layer++) {
            int row = layer, col = layer;
            if (layer == (m - 1) / 2 && m == n) {
                list.add(matrix[row][col]);
            } else {
                for (; col <= (n - 2) - layer; col++) list.add(matrix[row][col]);
                for (; row <= (m - 2) - layer; row++) list.add(matrix[row][col]);
                for (; col > layer; col--) list.add(matrix[row][col]);
                for (; row > layer; row--) list.add(matrix[row][col]);
            }
        }

        return list;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        if (matrix.length == 0) return list;

        int topRow = 0, bottomRow = matrix.length - 1, leftColumn = 0, rightColumn = matrix[0].length - 1;
        int row = topRow, col = leftColumn;

        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            if (topRow <= bottomRow) break;
            while (col <= rightColumn) list.add(matrix[row][col++]);
            row = ++topRow;
            col--;
            while (row <= bottomRow && leftColumn <= rightColumn) list.add(matrix[row++][col]);
            col = --rightColumn;
            row--;
            while (col >= leftColumn && topRow <= bottomRow) list.add(matrix[row][col--]);
            row = --bottomRow;
            col++;
            while (row >= topRow && leftColumn <= rightColumn) list.add(matrix[row--][col]);
            col = ++leftColumn;
            row++;
        }

        return list;
    }

    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int pivot = findPivot(nums, 0, nums.length - 1);
        if (target <= nums[pivot] && target >= nums[0])
            return binarySearch(nums, target, 0, pivot);
        else return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) return mid;
        else if (target >= nums[start] && target < nums[mid])
            return binarySearch(nums, target, start, mid - 1);
        else if (target > nums[mid] && target <= nums[end])
            return binarySearch(nums, target, mid + 1, end);
        else return -1;
    }

    public int findPivot(int[] nums, int start, int end) {
        if (nums.length == 1) return 0;
        if (nums[end] > nums[start]) return end;
        int mid = start + (end - start) / 2;
        if (nums[mid] > nums[mid + 1]) return mid;
        else if (nums[mid + 1] > nums[end]) return findPivot(nums, mid + 1, end);
        else return findPivot(nums, start, mid - 1);
    }

    public int findMin2(int[] nums) {
        if (nums.length == 0) return 0;
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                return min;
            }
        }

        return min;
    }

    public int findMin(int[] nums) {
        if (nums.length == 0) return 0;

        int i =  findPivot(nums, 0, nums.length - 1);
        if (i == nums.length - 1) return nums[0];
        else return nums[i + 1];
    }

    public void rotate(int[][] matrix) {
        if (matrix.length == 0) return;
        for (int i = 0; i < matrix.length / 2; i++) {
            rotateLayer(matrix, i);
        }
    }

    public void rotateLayer(int[][] matrix, int row) {
        int n = matrix[0].length;
        for (int col = row; col < n - row - 1; col++) {
            int rotVal = matrix[row][col];
            int newRow = row;
            int newCol = col;
            do {
                int tmpRow = newRow;
                newRow = newCol;
                newCol = Math.abs(n - 1 - tmpRow);

                int tmpVal = matrix[newRow][newCol];
                matrix[newRow][newCol] = rotVal;
                rotVal = tmpVal;
            } while (!(newRow == row && newCol == col));
        }
    }

    public int myAtoi(String str) {
        Pattern pattern = Pattern.compile("^(-|\\+)?\\d+");
        Matcher matcher = pattern.matcher(str.trim());
        if (matcher.find()) str = matcher.group(0);
        else return 0;

        int result = 0, mul = 1, sign = 1;
        try {
            if (str.charAt(0) == '-' || str.charAt(0) == '+') {
                sign = str.charAt(0) == '-' ? -1 : 1;
                str = str.substring(1, str.length());
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            return 0;
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            int x = (str.charAt(i) - '0') * mul;
            if (x / mul != (str.charAt(i) - '0')) return Integer.MAX_VALUE * sign;
            result += x;
            mul *= 10;
        }

        return result * sign;
    }

    public String reverseWords3(String s) {
        String[] parts = s.trim().split("\\t+");
        String out = "";
        for (int i = parts.length - 1; i > 0; i--) {
            out += parts[i] + " ";
        }
        return out + parts[0];
    }

    public String reverseWords(String s) {
        if (s.length() == 0) return s;
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].length() > 0) sb.append(strs[i] + " ");
        }

        return sb.toString().trim();
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new LinkedList<>();
        char[][] letters = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'},
                {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        Queue<String> queue = new LinkedList<>();
        for (char c : letters[digits.charAt(0) - '0']) {
           queue.add(c + "");
        }

        String str;
        while (queue.peek() != null && queue.peek().length() < digits.length() && (str = queue.poll()) != null) {
            for (char c : letters[digits.charAt(str.length()) - '0']) {
                queue.add(str + c);
            }
        }

        List<String> res = new LinkedList<>();
        while ((str = queue.poll()) != null) res.add(str);
        return res;
    }

    public String intToRoman(int num) {
        int[] divisor = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] values = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < divisor.length; i++) {
            int q = num / divisor[i];
            if (q > 0) {
                num = num % divisor[i];
                while (q-- != 0) sb.append(values[i]);
            }
        }
        return sb.toString();
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        List<Integer> result = new LinkedList<>();

        for (int num : nums) {
            treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
        }

        NavigableMap<Integer, Integer> nMap = treeMap.descendingMap();

        int count = 0;

        while (count != k) {
            Map.Entry<Integer, Integer> entry = nMap.pollFirstEntry();
            /*for (int n : entry.getValue()) {
                result.add(n);
                count++;
            }*/
        }

        return result;
    }

    public List<Integer> topKFrequent2(int[] nums, int k) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();
        List<Integer> result = new LinkedList<>();

        for (int num : nums) {
            table.put(num, table.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((o1, o2) -> (o2.getValue() - o1.getValue()));
        for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
            maxHeap.add(entry);
        }
        while (k-- != 0) result.add(maxHeap.poll().getKey());
        return result;
    }

    public int reverseBits2(int n) {
        int mask = 1, res = 0;

        for (int i = 0; i < 32; i++) {
            int bit = n & mask;
            res = bit != 0 ? res | 1 : res | 0;
            mask = mask << 1;
            if (i < 31) res = res << 1;
        }

        return res;
    }

    public int reverseBits(int n) {
        System.out.println((int) (Math.pow(2, 30)));
        int lMask = (int) Math.pow(2, 30);
        int rMask = 2;

        int l = 30;
        int r = 1;

        while (l++ > r--) {
            int lBit = n & lMask;
            int rBit = n & rMask;
        }

        return 0;
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (nums.length <= 1) return;

        int count = nums.length;

        for (int i = 0; i < nums.length && count > 0; i++) {
            int next = calcNext(i, nums.length, k);
            int mov = nums[i];

            while(count != 0 && next != i) {
                int tmp = nums[next];
                nums[next] = mov;
                mov = tmp;
                next = calcNext(next, nums.length, k);
                count--;
            }

            nums[next] = mov;
            count--;
        }
    }

    public int calcNext(int i, int n, int k) {
        if (i < n - k) return i + k;
        else return Math.abs(n - k - i);
    }

    public void rotate2(int[] nums, int k) {
        if (nums.length <= 1) return;
        k = k % nums.length;
        Queue<Integer> queue = new LinkedList<>();

        for (int i : nums) queue.add(i);

        int i = 0;
        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (i < nums.length - k) {
                nums[i + k] = num;
            } else {
                nums[Math.abs(nums.length - k - i)] = num;
            }
            i++;
        }
    }

    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }

    public int guessNumber(int n) {
        int guess, mid, start = 1, end = n;
        while ((guess = guess(mid = (start + ((end - start) / 2)))) != 0) {
            if (guess == 1) start = mid + 1;
            else end = mid - 1;
        }

        return mid;
    }

    public int guess(int num) {
        int PICK = 9;

        if (num == PICK) return 0;
        else if (num < PICK) return 1;
        else return -1;
    }

    public String longestPalindrome(String s) {
        if (s.length() == 0) return s;

        String ret = "";

        for (int i = 0; i < s.length(); i++) {
            String str = lpHelper(s, i - 1, i + 1);
            if (str.length() > ret.length()) ret = str;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                String str = lpHelper(s, i - 1, i + 2);
                if (str.length() > ret.length()) ret = str;
            }
        }

        return ret;
    }

    public String longestPalindromeRecur(String s, int start, int end) {
        if (start > end)  return "";
        else if (start == end) {
            return s.substring(start, end + 1);
        } else if (s.charAt(start) != s.charAt(end)) {
            String s1 = longestPalindromeRecur(s, start, end - 1);
            String s2 = longestPalindromeRecur(s, start + 1, end);

            String str = s1.length() > s2.length() ? s1 : s2;
            return str;
        } else {
            String s1 = longestPalindromeRecur(s, start + 1, end - 1);
            return s.substring(start, end + 1);
        }
    }

    public String lpHelper(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }

        return s.substring(start + 1, end);
    }

    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        int maxLen = 0;
        BitSet bitSet;

        for (int i = 0; i < s.length(); i++) {
            bitSet = new BitSet(256);
            int curLen = 0;
            int j = i;
            while (j < s.length() && !bitSet.get(s.charAt(j))) {
                bitSet.set(s.charAt(j));
                curLen++;
                j++;
            }

            maxLen = Math.max(curLen, maxLen);

            if (j == s.length()) break;
        }

        return maxLen;
    }

    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && len != 0) break;
            else if (s.charAt(i) != ' ') len++;
        }

        return len;
    }

    public int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i + 3) {
            if (i + 2 >= nums.length || nums[i + 2] != nums[i]) return nums[i];
        }

        return -1;
    }

    public char findTheDifferenceXOR(String s, String t) {
        if (t.length() <= s.length()) return '\0';
        int c = -1;

        for (int i = 0; i < s.length(); i++) {
            if (c == -1) c = s.charAt(i) ^ t.charAt(i);
            else c ^= s.charAt(i) ^ t.charAt(i);
        }

        return (char) c;
    }

    public char findTheDifference(String s, String t) {
        int[] count = new int[128];

        for (char c : s.toCharArray()) {
            count[c]++;
        }

        for (char c : t.toCharArray()) {
            int val = count[c] = count[c] - 1;
            if (val < 0) return c;
        }

        return '\0';
    }

    public boolean wordPattern(String pattern, String str) {
        char[] chars = pattern.toCharArray();
        String[] strings = str.split(" ");

        if (strings.length != chars.length) return false;

        HashMap<String, Character> map = new HashMap<>();
        HashMap<Character, String> map1 = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            String token = strings[i];
            char c = map.get(token) != null ? map.get(token) : '\0';

            if ((c != '\0' && chars[i] != c) || (c == '\0' && map1.get(chars[i]) != null)) return false;
            else if (c == '\0') {
                map.put(token, chars[i]);
                map1.put(chars[i], token);
            }

        }
        return true;
    }

    public int firstBadVersion(int n) {
        int i = 1, j = n;

        while (i < j) {
            int mid = i + (j - i) / 2;
            if (isBadVersion(mid)) j = mid - 1;
            else i = mid + 1;
        }

        return isBadVersion(i) ? i : i + 1;
    }

    public boolean isBadVersion(int n) {
        if (n >= 1) return true;
        else return false;
    }

    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length - 1;

        while (i <= j) {
            int mid = i + ((j - i) / 2);

            if (nums[mid] == target) return mid;
            else if (target < nums[mid]) j = mid - 1;
            else i = mid + 1;
        }

        return i;
        //return searchInsertBinary(nums, 0, nums.length - 1, target);
    }

    public int searchInsertBinary(int[] nums, int i, int j, int target) {
        if (i > j) return i;

        int mid = i + ((j - i) / 2);

        if (nums[mid] == target) return mid;
        else if (target < nums[mid]) return searchInsertBinary(nums, i, mid - 1, target);
        else return searchInsertBinary(nums, mid + 1, j, target);
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] map1 = new char[256];
        char[] map2 = new char[256];

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for (int i = 0; i < sArr.length; i++) {
            if (map1[sArr[i]] == '\0' && map2[tArr[i]] == '\0') {
                map1[sArr[i]] = tArr[i];
                map2[tArr[i]] = sArr[i];
            } else if (map1[sArr[i]] != tArr[i] && map2[tArr[i]] != sArr[i]) return false;
        }

        return true;
    }

    public int nthUglyNumber(int n) {
        int count = 0, i = 0;
        while (count < n) {
            if (isUgly(++i)) count++;
        }

        return i;
    }

    public boolean isUgly(int num) {
        if (num <= 0) return false;

        while (num > 1) {
            if (num % 2 == 0) num = num / 2;
            else if (num % 3 == 0) num = num / 3;
            else if (num % 5 == 0) num = num / 5;
            else return false;
        }

        return true;
    }

    class NumArray {
        private int[] nums;
        private Map<String, Integer> map;

        public NumArray(int[] nums) {
            this.nums = nums;
            map = new HashMap<>();
        }

        public int sumRange(int i, int j) {
            if (i == j) return this.nums[i];
            else if (map.containsKey("i" + ":" + "j")) return map.get("i" + ":" + "j");
            else {
                int res = this.sumRangeInit(i, j);
                map.put("i" + ":" + "j", res);
                return res;
            }
        }

        private int sumRangeInit(int i, int j) {
            int sum = 0;
            for(int k = i; k <= j; k++) {
                sum += nums[k];
            }

            return sum;
        }
    }

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length) {
            if (i == bits.length - 1) return true;
            if (bits[i] == 0) i++;
            else i += 2;
        }

        return false;
    }

    public int countPrimes(int n) {
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) count++;
        }

        return count;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public int findShortestSubArray(int[] nums) {
        return 0;
    }

    public int getMax(int[] nums) {
        return 0;
    }

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;

        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        while (i < j) {
            while (i < chars.length && !set.contains(chars[i])) {
                i++;
            }

            while (j >= 0 && !set.contains(chars[j])) {
                j--;
            }

            if (i > j) break;

            char c = chars[i];
            chars[i++] = chars[j];
            chars[j--] = c;
        }

        return new String(chars);
    }

    public int findComplement(int num) {
        if (num == 0) return 1;
        int n = 1073741824;

        for (int i = 31; i > 0; i--) {
            if ((n & num) > 0) break;
            else n = n >> 1;
        }

        return (n | (n - 1)) ^ num;
    }

    public boolean isPowerOfFour(int n) {
        if (n == 0) return false;

        while (n % 4 == 0) n /= 4;
        return n == 1 ? true : false;
    }

    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while (n % 2 == 0) n /= 2;
        return n == 1 ? true : false;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - 1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) list.add(i + 1);
        }

        return list;
    }

    public String reverseWords2(String s) {
        char[] chars = s.toCharArray();

        int i = 0, j = 0;

        while (i < chars.length && j < chars.length) {
            while (i < chars.length && chars[i] == ' ') i++;
            while (j < chars.length && chars[j] != ' ') j++;

            reverseStringHelper(chars, i, j - 1);

            i = j = j + 1;
        }

        return new String(chars);
    }

    public void reverseStringHelper(char[] chars, int start, int end) {
        while (start < end) {
            char c = chars[start];
            chars[start++] = chars[end];
            chars[end--] = c;
        }
    }

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = -1;

        for (i = 0; i < nums.length; i++) {
            if (i != nums[i]) return i;
        }

        return i;
    }

    public int[] twoSum2(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int indx = getIndex(numbers, target - numbers[i], i + 1, numbers.length - 1);
            if (indx != -1) return new int[] {i + 1, indx + 1};
        }

        return null;
    }

    public int getIndex(int[] nums, int n, int start, int end) {
        if (end < start) return -1;
        int mid = start + (end - start) / 2;
        if (nums[mid] == n) return mid;
        else if (n < nums[mid]) return getIndex(nums, n, start, mid - 1);
        else return getIndex(nums, n, mid + 1, end);
    }

    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0 || needle.length() == 0) return -1;
        int fIndx = -1;

        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();

        for (int i = 0; i < h.length; i++) {
            int tmp = i, j;
            fIndx = i;

            for (j = 0; j < n.length && tmp < h.length && h[tmp] == n[j]; j++, tmp++) {
            }

            if (j != n.length) fIndx = -1;
            else break;
        }

        return fIndx;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cur = m + n - 1;

        while (n > 0) {
            if (m > 0 && nums1[m - 1] > nums2[n - 1]) {
                nums1[cur--] = nums1[--m];
            } else nums1[cur--] = nums2[--n];
        }
    }

    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int count = 0;

        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (chars[i] != chars[j] && count == 0) return (palindromeCheck(chars, i + 1, j) || palindromeCheck(chars, i, j - 1));
            else if (chars[i] != chars[j]) return false;
        }

        return true;
    }

    public boolean palindromeCheck(char[] chars, int start, int end) {
        for (int i = start, j = end; i <= j; i++, j--) {
            if (chars[i] != chars[j]) return false;
        }

        return true;
    }

    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();

        for (int i = 0, j = chars.length - 1; i <= j;) {
            if(!isAlphaNumeric(chars[i])) {
                i++;
                continue;
            } else if (!isAlphaNumeric(chars[j])) {
                j--;
                continue;
            }
            else if (chars[i] != chars[j]) {
                return false;
            }
            else {
                i++;
                j--;
            }
        }

        return true;
    }

    public boolean isAlphaNumeric(char c) {
        int val = c - '\0';
        if ((val >= 48 && val <= 57) || (val >= 65 && val <= 90)|| (val >= 97 && val <= 122)) return true;
        else return false;
    }

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) list.add("FizzBuzz");
            else if (i % 3 == 0) list.add("Fizz");
            else if (i % 5 == 0) list.add("Buzz");
            else list.add(i + "");
        }

        return list;
    }

    public int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -x;
        }

        int rev = 0, prev = 0;

        while (x > 0) {
            int rem = x % 10;
            x = x / 10;
            rev = rev * 10 + rem;
            if ((rev - rem) / 10 != prev) return 0;
            prev = rev;
        }

        rev = rev * sign;

        return  rev;
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0) return false;
        else if (x == 0) return true;
        int max = 1000000000, min = 10;
        while (x < max) max = max / 10;
        while (max > min) {
            int l = x / max;
            int r = x % min;
            if (l != r) return false;
            max /= 10;
            min *= 10;
        }

        return true;
    }

    public String intToString(int x) {
        StringBuffer sb = new StringBuffer();

        while (x > 0) {
            int d = x % 10;
            x = x / 10;
            sb.append(d);
        }
        return sb.toString();
    }

    public int firstUniqChar(String s) {
        int[] map = new int[26];
        for(char c: s.toCharArray()){
            map[c - 'a']++;
        }
        for(char c: s.toCharArray())
            if(map[c - 'a'] == 1)
                return s.indexOf(c);
        return -1;
    }

    public int firstUniqChar2(String s) {
        char[] chars = s.toCharArray();
        int[] arr = new int[256];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = -1;
        }

        for (int i = 0; i < chars.length; i++) {
            int indx = chars[i] - '\0';
            if (arr[indx] == -1) arr[indx] = i;
            else arr[indx] = Integer.MAX_VALUE;
        }

        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                minIndex = Math.min(arr[i], minIndex);
            };
        }

        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) list.add(i);
        }

        return list;
    }

    public boolean isSelfDividing(int n) {
        int tmp = n;
        while (tmp > 0) {
            int digit = tmp % 10;
            if (digit == 0) return false;
            else if (n % ( digit % 10) == 0) {
                tmp = tmp / 10;
            } else return false;
        }
        return true;
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            if (map.get(second) != null) return new int[] {i, map.get(second)};
            else map.put(nums[i], i);
        }

        return null;
    }

    public boolean isAnagram(String s, String t) {
        int[] arr = new int[256];

        char a = 'a';
        System.out.println(a - '\0');

        for (char c : s.toCharArray()) {
            arr[c - '\0']++;
        }

        for (char c : t.toCharArray()) {
            arr[c - '\0']--;
        }

        for (int i : arr) {
            if (i != 0) return false;
        }

        return true;
    }

    public boolean isAnagram2(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;
            else {
                int val = map.get(c);
                if (val == 1) map.remove(c);
                else map.put(c, val - 1);
            }
        }

        if (map.isEmpty()) return true;
        else return false;
    }

    public int[] anagramMappings(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < B.length; i++) {
            map.put(B[i], i);
        }
        int[] P = new int[A.length];
        for (int j = 0; j < A.length; j ++) {
            P[j] = map.get(A[j]);
        }

        return P;
    }

    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }

    public int trailingZeroes(int n) {
        int fact = factorial(n);
        int mod = 0, count = 0;

        while ((mod = fact % 10) == 0) {
            fact = fact / 10;
            count++;
        }

        return count;
    }

    public int factorial(int n) {
        if (n == 1 || n == 0) return n;
        else return n * factorial(n - 1);
    }

    public int removeDuplicates(int[] nums) {
        int sp = 0, fp = 0;
        while (fp < nums.length) {
            if (fp + 1 >= nums.length) return sp + 1;
            else {
                if (nums[sp] == nums[fp + 1]) fp++;
                else nums[++sp] = nums[++fp];
            }
        }

        return sp;
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        if (numRows == 0) return list;

        if (numRows >= 1) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            list.add(row);
        }

        if (numRows == 1) return list;

        if (numRows >= 2) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            row.add(1);
            list.add(row);
        }

        if (numRows == 2) return list;

        for (int rowNum = 2; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> prevRow = list.get(rowNum - 1);
            for (int col = 1; col < rowNum; col++) {

                row.add(prevRow.get(col - 1) + prevRow.get(col));
            }
            row.add(1);
            list.add(row);
        }

        return list;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            }
        }

        return false;
    }

    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0) return 0;
        int perimeter = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 0) continue;
                //left
                if ((col - 1 >= 0 && grid[row][col - 1] != 1) || (col - 1 < 0))
                    perimeter++;

                //right
                if ((col + 1 < grid[0].length && grid[row][col + 1] != 1) || (col + 1 >= grid[0].length))
                    perimeter++;

                //top
                if ((row - 1 >= 0 && grid[row - 1][col] != 1) || (row - 1 < 0))
                    perimeter++;

                //bottom
                if ((row + 1 < grid.length && grid[row + 1][col] != 1) || (row + 1 >= grid.length))
                    perimeter++;
            }
        }

        return perimeter;
    }

    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }

        if ((x | y) == 0) return true;
        else return false;
    }

    public String addBinary(String a, String b) {
        if (a.length() == 0) return b;
        else if (b.length() == 0) return a;

        StringBuilder sb = new StringBuilder();

        int carry = 0;

        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int s = (i >= 0 ? Character.getNumericValue(a.charAt(i)) : 0) ^ (j >=0 ? Character.getNumericValue(b.charAt(j)) : 0) ^ carry;
            int tmp = (i >= 0 ? Character.getNumericValue(a.charAt(i)) : 0) + (j >=0 ? Character.getNumericValue(b.charAt(j)) : 0) + carry;
            if (tmp > 1) carry = 1;
            else carry = 0;
            sb.append(s);
        }

        if (carry == 1) sb.append("1");

        return sb.reverse().toString();
    }

    public boolean isHappy(int n) {
        HashSet set = new HashSet();
        int sum = n;
        while (sum != 1) {
            System.out.println(sum);
            n = sum;
            sum = 0;
            while (n > 0) {
                sum += (int) Math.pow(n % 10, 2);
                n = n / 10;
            }
            if (!set.add(sum)) return false;
        }

        return true;
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (!hashSet.add(num)) return true;
        }

        return false;
    }

    public int addDigits(int num) {
        if (num < 10) return num;
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        return addDigits(sum);
    }

    public void moveZeroes(int[] nums) {
        if (nums.length == 0) return;

        int nextZero = -1;
        int zeroIndex = -1;

        for (int i = 0; i < nums.length;) {
            if (nums[i] == 0 && zeroIndex == -1) {
                zeroIndex = i++;
            } else if (nums[i] == 0 && zeroIndex != -1) {
                nextZero = i++;
            } else {
                nums[zeroIndex] = nums[i];
                nums[i] = 0;
                if (nextZero == -1) i++;
                else i = zeroIndex = nextZero;
                nextZero = -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(Utils.printArray(nums));
    }

    public int hammingWeight(int n) {
        if(n == 0) return 0;
        int mask = 1, count = 0;

        for(int i = 0; i < 32; i++) {
            if((n & mask) != 0) count++;
            mask = mask << 1;
        }

        return count;
    }

    public int[] plusOne(int[] digits) {
        int[] result;

        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            result = new int[digits.length + 1];

            result[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
                return result;
            }
        }

        return digits;
    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) sum += nums[i];
        }

        return sum;
    }

    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            map.put(c, map.get(c) != null ? (map.get(c) + 1) : 1);
        }

        int count = 0;
        for (char c : J.toCharArray()) {
            count += map.get(c) != null ? map.get(c) : 0;
        }

        return count;
    }

    public boolean isPalindrome2(int x) {
        char[] chars = intToArray(x).toCharArray();
        int i = 0, j = chars.length - 1;
        while (i <= j) {
            if (chars[i] == '-') {
                i++;
                continue;
            }
            if (chars[i++] != chars[j--]) return false;
        }
        return true;
    }

    public String intToArray(int x) {
        StringBuilder sb = new StringBuilder();
        while (x != 0) {
            sb.append(x % 10);
            x = x / 10;
        }

        return sb.toString();
    }

    public int bitCounts(int n) {
        int count = 0;
        int mask = 1;
        while (n > 0) {
            if ((n & mask) == 1) count++;
            n = n >> 1;
        }

        return count;
    }

    public int hammingDistance(int x, int y) {
        return this.bitCounts(x ^ y);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0;;i++) {
            char ref = '\0';
            for (String str : strs) {
                if (str.length() == 0) return sb.toString();
                else if (str.length() != i && ref == '\0') ref = str.charAt(i);
                else if (str.length() == i || str.charAt(i) != ref) return sb.toString();
            }
            sb.append(ref);
        }
    }

    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum ^= i;
        }

        return sum;
    }

    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        char tmp;
        while (j > i) {
            tmp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = tmp;
        }

        return new String(chars);
    }

    public String reverseStringSB(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public void romanToIntMap() {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        int prev = -1;
        int tmpSum = 0;
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (prev < 0) {
                tmpSum = prev = map.get(s.charAt(i));
            } else {
                int val = map.get(s.charAt(i));
                if (val < prev) {
                    sum = sum + tmpSum - val;
                    tmpSum = prev = 0;
                } else {
                    tmpSum += val;
                    prev = val;
                }
            }
        }
        return sum + tmpSum;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode r = null, c = null;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            int val = sum % 10;
            if (r == null) c = r = new ListNode(val + carry);
            else {
                c.next = new ListNode(val);
                c = c.next;
            }
            carry = sum / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (carry > 0) {
            c.next = new ListNode(carry);
        }

        return r;
    }

    public int[] countBits2(int n) {
        int count[] = new int[n + 1];
        for (int j = 0; j <= n; j++) {
            int mask = 1;
            for (int i = 0; i < Integer.SIZE; i++) {
                int val = j & mask;
                if (val != 0 ) count[j]++;
                mask = mask << 1;
            }
        }

        return count;
    }

    public int numSquaresRecur(int n) {
        int maxSqrtNum = (int) Math.sqrt(n);

        if (n - (maxSqrtNum * maxSqrtNum) == 0) {
            return 1;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= maxSqrtNum; i++) {
            int val = n - (i * i);
            min = Math.min(min, (1 + numSquaresRecur(val)));
        }

        return min;
    }

    public void numSquaresCreateTree(TreeNode3 root) {
        //TreeNode2 tree = new TreeNode2(n);
        int maxSqrtNum = (int) Math.sqrt(root.val);
        if (root.val - (maxSqrtNum * maxSqrtNum) == 0) {
            return;
        }
        for (int i = 1; i <= maxSqrtNum; i++) {
            TreeNode3 node = new TreeNode3(root.val - (i * i));
            root.children.add(node);
            numSquaresCreateTree(node);
        }
    }

    public int numSquaresMinBFS(Queue<TreeNode3> queue, int level) {
        while (!queue.isEmpty()) {
            TreeNode3 root = queue.poll();
            if (root.val == -1) {
                queue.add(new TreeNode3(-1));
                level++;
            }
            else if (root.children.size() == 0) return ++level;
            else {
                for (TreeNode3 node : root.getChildren()) {
                    queue.add(node);
                }
            }
        }
        return level;
    }

    public int maxSquareNum(int n) {
        return 0;
    }
    public int numSquares(int n) {
        int count = 0;
        while(n > 0) {
            int i = (int)Math.sqrt(n);
            n = n - (i * i);
            count++;
        }

        return count;
    }

    public int numOfOne(int n) {
        int f;
        int count = 0;
        while (n > 0) {
            f = n & 1;
            if (f == 1) count++;
            n = n >> 1;
        }

        System.out.println("Number of 1 in " + n + " is " + count);
        return 0;
    }

    public boolean intDict(String s, List<String> wordDict) {
        for (String str : wordDict) {
            if (s.equals(str)) return true;
        }
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
         if (s.length() == 0) return true;
         for (int i = 1; i <= s.length(); i++) {
             System.out.println("Prefix: " + s.substring(0, i) + "  Suffix: " + s.substring(i, s.length()));
             //if (intDict(s.substring(0, i), wordDict) && wordBreak(s.substring(i, s.length()), wordDict)) return true;
             boolean b = intDict(s.substring(0, i), wordDict);
             boolean c = wordBreak(s.substring(i, s.length()), wordDict);

             if (b && c) return true;
         }
         return false;
    }

    public boolean wordBreakMemo(String s, List<String> wordDict) {
        if (s.length() == 0) return true;
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            boolean b = intDict(prefix, wordDict);
            String suffix = s.substring(i, s.length());
            System.out.println("Prefix: " + prefix + "  Suffix: " + suffix);
            boolean c;
            if (map.containsKey(suffix)){
                //c = map.get(suffix);
            }
            else {
                c = wordBreakMemo(suffix, wordDict);
                //map.put(suffix, c);
            }
            return true;
        }
        return false;
    }

    public int decodeWays(String S, int j, char[] charMap) {
        if(j <= 0) return 1;
        else return decodeWays(S, j - 1, charMap) + (charMapExist(charMap, S, j - 1) ? decodeWays(S, j - 2, charMap) : 0);
    }

    public boolean charMapExist(char[] charMap, String S, int i) {
        int k = (S.charAt(i) - '0') * 10 + S.charAt(i + 1) - '0';
        if (k > charMap.length - 1) return false;
        else return true;
    }

    public int numDecodings(String s) {
        if (s.length() == 0) return 0;
        if (s.equals("0")) return 0;
        return decodeWays(s, s.length() - 1);
    }

    public int decodeWays(String S, int j) {
        if(j <= 0) return 1;
        else return decodeWays(S, j - 1) + (charMapExist(S, j - 1) ? decodeWays(S, j - 2) : 0);
    }

    public boolean charMapExist(String S, int i) {
        if (i < 0) return false;
        int k = Character.getNumericValue(S.charAt(i)) * 10 + Character.getNumericValue(S.charAt(i + 1));
        if (k > 26) return false;
        else return true;
    }

    public boolean wordSearch(char[][] M, String S) {
        int[][] visited;

        for (int l = 0; l < M.length; l ++) {
            for (int m = 0; m < M[0].length; m++) {
                visited = new int[M.length][M[0].length];
                if (dfs(M, S, l, m, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] M, String S, int l, int m, int x, int[][] visited) {
        boolean flag = false;
        if (l < 0 || l >= M.length || m < 0 || m >= M[0].length) {
            return false;
        } else if (M[l][m] == '#') {
            return false;
        }
        else if (M[l][m] == S.charAt(x) && x == S.length() - 1) {
            return true;
        } else if (M[l][m] == S.charAt(x)) {
            visited[l][m] = '#';
            flag |= dfs(M, S, l + 1, m, x + 1, visited) || dfs(M, S, l - 1, m, x + 1, visited) ||
                     dfs(M, S, l, m + 1, x + 1, visited) || dfs(M, S, l, m - 1, x + 1, visited);
            visited[l][m] = 0;
            return flag;
        } else {
            return false;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void permuation(int[] nums, int start, int end, List<List<Integer>> lists) {
        if (start == end) {
            List<Integer> list = new ArrayList<>();
            for (int i : nums) {
                list.add(i);
            }
            lists.add(list);
        } else {
            for (int i = start; i <= end; i++) {
                swap(nums, start, i);
                permuation(nums, start + 1, end, lists);
                swap(nums, start, i);
            }
        }
    }

    public void swap2(int[] nums, int i, int j, HashMap<String, ArrayList<Integer>> hashSet) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

        String key = "";
        for (int k : nums) {
            key += k;
        }
        System.out.println(key);
        if (! hashSet.containsKey(key)) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int k : nums) {
                list.add(k);
            }
            hashSet.put(key, list);
        }
    }

    public void permuation2(int[] nums, int i, int j, HashMap<String, ArrayList<Integer>> hashSet) {
        if (j >= nums.length) {
            return;
        }
        for (int k = 0; k < nums.length; k++) {
            swap2(nums, i, j, hashSet);
            permuation2(nums, i, j + 1, hashSet);
        }
    }

    public class Interval {
        int start, end;
        Interval() {
            start = 0; end = 0;
        }
        Interval(int s, int e) {
            start = s; end = e;
        }

        public String toString() {
            return this.start + " : " + this.end;
        }
    }

    public int minMeetingRooms(Interval[] intervals) {
        if (intervals.length == 0) return 0;

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        PriorityQueue<Interval> pQueue = new PriorityQueue<>(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.end - o2.end;
            }
        });

        int prevEnd = -1, count = 0;
        for (Interval interval : intervals) {
            if (pQueue.isEmpty()) {
                pQueue.add(interval);
                //count++;
            } else {
                Interval item = pQueue.peek();
                if (interval.start >= item.end) pQueue.remove();
                //else count++;
                pQueue.add(interval);
            }
        }

        //return count;
        return pQueue.size();
    }

    public boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        int prevEnd = -1;
        for (Interval interval : intervals) {
            if (interval.start < prevEnd) return false;
            else prevEnd = interval.end;
        }

        return true;
    }

    public List<Interval> mergeIntervals(List<Interval> intervals) {

        if (intervals.size() <= 1) return intervals;

        intervals.sort((Interval o1, Interval o2) -> Integer.compare(o1.start, o2.start));

        ArrayList<Interval> resultList = new ArrayList<>();
        Interval preItem = null;
        for (Interval curItem : intervals) {
            if (preItem == null) {
                preItem = curItem;
                continue;
            }
            if (curItem.start <= preItem.end) {
                preItem.end = curItem.end;
                intervals.remove(curItem);
            }
        }
        return intervals;
    }
    public int jumpGame(int[] nums, int position, int[] dp) {
        if (position == nums.length - 1) return 1;
        int maxJump = Math.min(position + nums[position], nums.length - 1);
        for (int nextJump = position + 1; nextJump <= maxJump; nextJump++) {
            if (dp[nextJump] < 0) {
                dp[nextJump] = jumpGame(nums, nextJump, dp);
            }
        }

        return dp[position];
    }

    public int maxSubArray(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];
        int sum = Integer.MIN_VALUE, curSum = 0;

        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            sum = Math.max(sum, curSum);
            if (curSum <= 0) curSum = 0;
        }

        return sum;
    }

    public int maxSubarrayRecur(int[] arr, int i) {
        if (i == 0) {
            return arr[0];
        }

        return maxSubarrayRecur(arr, i - 1) > 0 ? arr[i] + maxSubarrayRecur(arr, i - 1) : arr[i];
    }

    public double myPow(double x, int n) {
        if (n == 0) return x;
        int absN = Math.abs(n);
        double result = 1;
        while (absN > 0) {

            if ((n & 1) == 1) {
                result *= x;
            }
            x *= x;
            absN = absN >> 1;
        }

        return n > 0 ? result : 1 / result;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }

    private void permute2(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
        }

        for (int i = start; i <= end; i++) {
            str = swap(str, start, i);
            permute2(str, start + 1, end);
            str = swap(str, start, i);
        }
    }

    private String swap(String str, int i, int j) {
        char[] charArr = str.toCharArray();
        char tmp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = tmp;
        return String.valueOf(charArr);
    }

    public String countAndSay(int n) {
        String seed = "1";
        if (n == 1) return seed;
        StringBuilder sb;
        for (int i = 1; i < n; i++) {
            sb = new StringBuilder();
            int count = 0;
            char curChar = '\0';
            for (int j = 0; j < seed.length(); ++j) {
                if(curChar == '\0' || seed.charAt(j) == curChar) {
                    curChar = seed.charAt(j);
                    count++;
                } else {
                    sb.append(count + "" + curChar);
                    curChar = seed.charAt(j);
                    count = 1;
                }
            }

            sb.append(count + "" + curChar);;
            seed = sb.toString();
        }
        return seed;
    }

    public boolean validSudoku(char[][] board) {
        if (board.length < 9 || board[0].length < 9) return false;
        HashSet<Character> rowSet;
        HashSet<Character> colSet;
        HashSet<Character>[] cubeSet = new HashSet[3];

        for (int i = 0; i < 9; i++) {
            // scan each row
            rowSet = new HashSet<>();
            colSet = new HashSet<>();

            if (i % 3 == 0) {
                cubeSet = new HashSet[3];
                for (int j = 0; j < 3; j++){
                    cubeSet[j] = new HashSet<Character>();
                }
            }

            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) {
                    return false;
                }

                if (board[j][i] != '.' && !colSet.add(board[j][i])) {
                    return false;
                }

                int cube = i / 3;
                int row = i % 3;
                int column = j % 3;

                if (board[i][j] != '.' && !cubeSet[cube].add(board[i][j])) {
                    return false;
                }
            }

        }
        return true;
    }

    public int[] searchRange2(int[] nums, int target) {
        return search2(nums, 0, nums.length - 1, target);
    }

    public int[] search2(int[] nums, int start, int end, int target) {
        int first = -1, last = -1;
        if (nums.length == 0 || nums == null) return new int[]{-1, -1};
        if (start == end && target == nums[start]) return new int[]{start, end};

        while (start < end) {
            int mid = (start + end + 1) / 2;
            if (nums[mid] == target && nums[mid + 1] == target) {

                for (int i = mid; nums[i] == target; i--) {
                    first = i;
                }
                for (int j = mid + 1; nums[j] == target; j++) {
                    last = j;
                }
                break;

            } else if (target <= nums[mid]) {
                if (target == nums[mid]) {
                    for (int i = mid; nums[i] == target; i--) {
                        first = i;
                    }
                    last = mid;
                    break;
                }
                end = mid;
            } else if (target >= nums[mid + 1]) {
                if (target == nums[mid + 1]) {
                    for (int j = mid + 1; nums[j] == target; j++) {
                        last = j;
                    }
                    first = mid + 1;
                    break;
                }
                start = mid + 1;
            }
        }

        return new int[]{first, last};
    }

    public int strStr(String needle, String haystack, int i, int j) {
        int index = -1;
        if (i == needle.length()) {
            return j - needle.length() + 1;
        }
        if(needle.charAt(i) == haystack.charAt(j)) {
            index = strStr(needle, haystack, i + 1, j + 1);
        } else {
            strStr(needle, haystack, 0, j + 1);
        }
        return index;

    }

    public List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arrayLists = new ArrayList<>();

        int negIndex = 0;
        int posIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                negIndex = i - 1;
                posIndex = i;
                break;
            }
        }

        for (int j = posIndex; j < nums.length; j++) {
            for (int k = negIndex; k > 0; k--) {
                if(nums[j] + nums[k] + nums[k - 1] == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[j]);
                    list.add(nums[k]);
                    list.add(nums[k - 1]);
                    arrayLists.add(list);
                }
            }
        }

        for (int k = negIndex; k >= 0; k--) {
            for (int j = posIndex; j < nums.length - 1; j++) {
                if(nums[k] + nums[j] + nums[j + 1] == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[k]);
                    list.add(nums[j]);
                    list.add(nums[j + 1]);
                    arrayLists.add(list);
                }
            }
        }

        return arrayLists;
    }

    public static void main(String[] args) {
        new Test2();
    }
}
