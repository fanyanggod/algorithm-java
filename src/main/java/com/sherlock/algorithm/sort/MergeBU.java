package com.sherlock.algorithm.sort;

/**
 * @author sherlock
 * @date 2022/3/25
 */
public class MergeBU {
  private static int[] aux;

  public static void sort(int[] nums) {
    int n = nums.length;
    aux = new int[n];

    for (int sz = 1; sz < n; sz = sz+sz) {
      for (int low = 0; low < n - sz; low += sz+sz) {
        merge(nums,low,low+sz-1,Math.min(low+2*sz-1,n-1));
      }
    }
  }

  public static void merge(int[] nums, int low, int mid, int high) {
    int i = low, j = mid + 1;

    if (high + 1 - low >= 0) {
      System.arraycopy(nums, low, aux, low, high + 1 - low);
    }

    for (int k = low; k <= high; k++) {
      if (i > mid) {
        nums[k] = aux[j++];
      } else if (j > high) {
        nums[k] = aux[i++];
      } else if (aux[j] < aux[i]) {
        nums[k] = aux[j++];
      } else {
        nums[k] = aux[i++];
      }
    }
  }

}
