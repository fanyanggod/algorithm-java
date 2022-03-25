package com.sherlock.algorithm.sort;

/**
 * @author sherlock
 * @date 2022/3/25
 */
public class Shell {
  public static void sort(int[] nums) {
    int n = nums.length;
    int h = 1;
    while (h < n / 3) {
      h = 3 * h + 1;
    }
    while (h >= 1) {
      for (int i = h; i < n; i++) {
        for (int j = i; j >= h && nums[j] < nums[j - h]; j -= h) {
          int t = nums[j];
          nums[j] = nums[j - h];
          nums[j - h] = t;
        }
      }
      h = h / 3;
    }
  }
}
