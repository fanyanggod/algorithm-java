package com.sherlock.algorithm.sort;

/**
 * @author sherlock
 * @date 2022/3/25
 */
public class Selection {

  /**
   * exchange: N
   * compare: n(n-1)/2 ~ n*n/2
   */
  public static void sort(int[] nums) {
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      // min element index
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (nums[j] < nums[min]) {
          min =j;
        }
      }
      // exchange
      int t = nums[i];
      nums[i] = nums[min];
      nums[min] = t;
    }
  }
}
