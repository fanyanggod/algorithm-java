package com.sherlock.algorithm.sort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author sherlock
 * @date 2022/3/28
 */
@Slf4j
class Quick3wayTest {

  @Test
  void sort() {
    int[] nums = new int[] {3, 1, 5,0,2};
    Quick3way.sort(nums);
    log.info(Arrays.toString(nums));
  }
}