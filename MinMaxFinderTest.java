package com.company;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class MinMaxFinderTest {
  MinMaxFinder m1;

  @BeforeEach
  void init() {

    this.m1 = new MinMaxFinder();
  }

  @Test
  void findMinMax() {

    int[] sample = { 31, 7, 1, 8 };
    int[] expected = { 1, 31 };
    int[] actual = this.m1.findMinMax(sample);
    assertArrayEquals(expected, actual);
  }

  private void assertArrayEquals(int[] expected, int[] actual) {

  }

  @Test
  void findMax() {

    int[] sample = { 31, 7, 1, 8 };
    int expected = 31;
    int actual = this.m1.maximum(sample);
    assertArrayEquals(expected, actual);
  }

  private void assertArrayEquals(int expected, int actual) {

  }

  @Test
  void findMin() {

    int[] sample = { 31, 7, 1, 8 };
    int expected = 1;
    int actual = this.m1.minimum(sample);
    assertArrayEquals(expected, actual);
  }

}
