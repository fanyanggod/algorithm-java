package com.sherlock.algorithm.sort;

/**
 * @author sherlock
 * @date 2022/3/25
 */
public class Insertion {

  /**
   *            avg       bad       best
   * exchange:  n^2/4     n^2/2     0
   * compare:   n^2/4     n^2/2     n-1
   */
  public static void sort(int[] nums) {
    int n = nums.length;
    for (int i = 1; i < n; i++) {
      for (int j = i; j > 0 && nums[j] < nums[j-1]; j--) {
        int t = nums[j];
        nums[j] = nums[j - 1];
        nums[j - 1] = t;
      }
    }
  }
}
