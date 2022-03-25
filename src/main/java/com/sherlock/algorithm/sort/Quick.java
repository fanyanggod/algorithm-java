package com.sherlock.algorithm.sort;

/**
 * @author sherlock
 * @date 2022/3/25
 */
public class Quick {
  public static void sort(int[] nums) {
    sort(nums, 0, nums.length - 1);
  }

  private static void sort(int[] nums, int low, int high) {
    if (low >= high) {
      return;
    }
    int j = partition(nums, low, high);
    sort(nums, low, j - 1);
    sort(nums, j+1, high);
  }

  private static int partition(int[] nums, int low, int high) {
    int i = low, j = high + 1;
    int v = nums[low];
    // scan left/right, check and exchange element
    while (true) {
      while (nums[++i] < v) {
        if (i == high) {
          break;
        }
      }
      while (v < nums[--j]){
        if (j == low) {
          break;
        }
      }
      if (i >= j) {
        break;
      }
      int t = nums[i];
      nums[i] = nums[j];
      nums[j] = t;
    }
    int t = nums[low];
    nums[low] = nums[j];
    nums[j] = t;
    return j;
  }
}
