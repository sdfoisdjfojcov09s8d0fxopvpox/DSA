//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Dylan Gray
 */


public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};
    
    int iwhile = 0;
    while (iwhile < nums.length) { //print array
      System.out.print(nums[iwhile] + ", ");
      iwhile++;
    }
    System.out.println();
    for (int i = (nums.length - 1); i >= 0; i--) { //print reverse
      System.out.print(nums[i] + ", ");
    }
    System.out.println();
    System.out.println(nums[0]); //print first
    System.out.println(nums[nums.length - 1]); //print last

    System.out.println(lab.increment(3));

    System.out.println(lab.max(3, 4));
    System.out.println(lab.min(1, 23874982));
    System.out.println(lab.sum(nums));
    System.out.println(lab.average(nums));
    System.out.println(lab.max(nums));
    System.out.println(lab.min(nums));

  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
  if (a > b) { return a; }
  else return b;
  }
  public int min(int a, int b) {
  if (a < b) { return a; }
  else return b;
  }
  public int sum(int[] nums) {
    int sum = 0;
    for (int i : nums) {
      sum = sum + i;
    }
    return sum;
  }
  public int average(int[] nums) {
    int sum = 0;
    for (int i : nums) {
      sum = sum + i;
    }
    return (sum / nums.length);
  }
  public int max(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (max < nums[i]) {
        max = nums[i];
      }
    }
    return max;
  }
  public int min(int[] nums) {
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (min > nums[i]) {
        min = nums[i];
      }
    }
    return min;
  }
}
