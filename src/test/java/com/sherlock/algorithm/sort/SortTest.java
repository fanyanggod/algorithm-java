package com.sherlock.algorithm.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author sherlock
 * @date 2022/3/25
 */
@Slf4j
class SortTest {
  @Test
  void sort() {


    int[] nums = new int[10000];
    for (int i = 0; i < 10000; i++) {
      nums[i] = (int) (-300 + Math.random() * (10000 + 300));
    }
    int[] nums2 = Arrays.copyOf(nums, 10000);
    int[] nums3 = Arrays.copyOf(nums, 10000);
    int[] nums4 = Arrays.copyOf(nums, 10000);
    int[] nums5 = Arrays.copyOf(nums, 10000);
    int[] nums6 = Arrays.copyOf(nums, 10000);
    int[] nums7 = Arrays.copyOf(nums, 10000);


    long as = System.currentTimeMillis();
    Selection.sort(nums);
    log.info("selection cost:{}",System.currentTimeMillis() - as);

    long bs = System.currentTimeMillis();
    Insertion.sort(nums2);
    log.info("insertion cost:{}",System.currentTimeMillis() - bs);

    long cs = System.currentTimeMillis();
    Shell.sort(nums3);
    log.info("shell cost:{}",System.currentTimeMillis() - cs);

    long ds = System.currentTimeMillis();
    Merge.sort(nums4);
    log.info("merge cost:{}",System.currentTimeMillis() - ds);

    long es = System.currentTimeMillis();
    MergeBU.sort(nums5);
    log.info("merge bu cost:{}",System.currentTimeMillis() - es);

    long fs = System.currentTimeMillis();
    Quick.sort(nums6);
    log.info("quick cost:{}",System.currentTimeMillis() - fs);

    long gs = System.currentTimeMillis();
    Quick3way.sort(nums7);
    log.info("quick3way cost:{}",System.currentTimeMillis() - gs);

    assertArrayEquals(nums,nums2);
    assertArrayEquals(nums, nums3);
    assertArrayEquals(nums, nums4);
    assertArrayEquals(nums, nums5);
    assertArrayEquals(nums, nums6);
    assertArrayEquals(nums, nums7);
  }
}
