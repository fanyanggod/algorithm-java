package com.sherlock.algorithm.sort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author sherlock
 * @date 2022/3/25
 */
class InsertionTest {

  @Test
  void sort() {
    int[] nums = new int[] {1, -1, 5, -9};
    Insertion.sort(nums);
    System.out.println(Arrays.toString(nums));
  }
}