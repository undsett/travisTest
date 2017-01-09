package com.hillel.tasks;

public class SumOfNumbers {
  public int getSum(int limit) {
    int sum = 0;
    for (int i = 0; i <= limit ; i++) {
      sum += i;
    }
    return sum;

  }
}
