package com.sherlock.algorithm.sort;

/**
 * @author sherlock
 * @date 2022/3/28
 */
public class Quick3way {
  public static void sort(int[] nums) {
    sort(nums, 0, nums.length - 1);
  }

  private static void sort(int[] nums, int low, int high) {
    if (low >= high) {
      return;
    }
    int lt = low, i = low + 1, gt = high;
    int v = nums[low];
    while (i <= gt) {
      if (nums[i] < v) {
        int t = nums[lt];
        nums[lt] = nums[i];
        nums[i] = t;
        i++;
        lt++;
      } else if (nums[i] > v) {
        int t = nums[i];
        nums[i] = nums[gt];
        nums[gt] = t;
        gt--;
      }else {
        i++;
      }
    }
    sort(nums, low, lt - 1);
    sort(nums,gt+1,high);
  }
}
