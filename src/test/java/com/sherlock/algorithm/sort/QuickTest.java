package com.sherlock.algorithm.sort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author sherlock
 * @date 2022/3/25
 */
@Slf4j
class QuickTest {
  @Test
  void sort() {
    int[] nums = new int[] {1, -1, 5, -9};
    Quick.sort(nums);
    log.info(Arrays.toString(nums));
  }
}