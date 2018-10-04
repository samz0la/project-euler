package edu.cnm.deepdive;

public class ProjectEulerOne {

  public static void main(String[] args) {
    System.out.println(getSum(1000));
  }

  public static int getSum(int total) {
    int sum = 0;
    for (int i = 1; i < total; i++) {
      if (i % 3 == 0 | i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}