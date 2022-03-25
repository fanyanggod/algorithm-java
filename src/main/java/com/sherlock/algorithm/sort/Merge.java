package com.sherlock.algorithm.sort;

/**
 * @author sherlock
 * @date 2022/3/25
 */
public class Merge {
  private static int[] aux;

  public static void sort(int[] nums) {
    aux = new int[nums.length];
    sort(nums,0,nums.length-1);
  }

  private static void sort(int[] nums, int low, int high) {
    if (low >= high) {
      return;
    }
    int mid = low + (high - low) / 2;
    sort(nums,low,mid);
    sort(nums,mid+1,high);
    merge(nums,low,mid,high);
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
