package com.jsonmack.leetcode.easy;

/**
 * @author Jason MacKeigan
 */
public class SearchInsertPosition {

    //    Binary Search
    //
    //    We are given an ASC sorted array of numbers
    //
    //1. Find middle point of array (length / 2 ?)
    //2. IF:
    //    middle = target
    //      Return middle //DONE
    //    target < middle
    //      Recursive call to function, diving length in half again for new
    //      middle point
    //    target > middle
    //      Recursive call to function, combine length and middle and
    //      divide by 2 to find new upper middle point
    //
    //    If target is not present in array:
    //    Find where index is < target and index+1 is > target
    //    Find where index < target and index+1 != exists
    //    Find where index > target and index-1 != exists
    //
    //    If target < nums[0]
    //    Return 0;
    //    If target > nums[last]
    //    Return nums.length

    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        return search(nums, target, 0, nums.length - 1);
    }

    public int search(int[] nums, int target, int left, int right) {
        int pointer = left + (right / 2); //Math.ceil//THER IS SOMETHING FUNDAMENTALL FLAWRD URGHHH

        int valueAtPointer = nums[pointer];

        if (valueAtPointer == target) {
            return pointer;
        }
        if (right - left == 1) {
            return left > 0 ? pointer : pointer + 1;
        }
        if (target < valueAtPointer) {
            return search(nums, target, left, pointer);
        }
        return search(nums, target, pointer, right);
    }
    // [ 1, 3, 5, 6 ] l = 0, r = 3
    //
}
