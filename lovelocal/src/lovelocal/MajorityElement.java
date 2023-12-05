package lovelocal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajorityElement {
	    public static List<Integer> majorityElements(int[] nums) {
	        List<Integer> result = new ArrayList<>();
	        int candidate1 = Integer.MIN_VALUE, count1 = 0;
	        int candidate2 = Integer.MIN_VALUE, count2 = 0;
	        for (int num : nums) {
	            if (num == candidate1) {
	                count1++;
	            } else if (num == candidate2) {
	                count2++;
	            } else if (count1 == 0) {
	                candidate1 = num;
	                count1 = 1;
	            } else if (count2 == 0) {
	                candidate2 = num;
	                count2 = 1;
	            } else {
	                count1--;
	                count2--;
	            }
	        }
	        count1 = 0;
	        count2 = 0;
	        for (int num : nums) {
	            if (num == candidate1) {
	                count1++;
	            } else if (num == candidate2) {
	                count2++;
	            }
	        }
	        if (count1 > nums.length / 3) {
	            result.add(candidate1);
	        }
	        if (count2 > nums.length / 3) {
	            result.add(candidate2);
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the array elements separated by spaces: ");
	        String[] input = scanner.nextLine().split(" ");
	        int[] nums = new int[input.length];
	        for (int i = 0; i < input.length; i++) {
	            nums[i] = Integer.parseInt(input[i]);
	        }
	        List<Integer> result = majorityElements(nums);
	        System.out.println("Elements appearing more than ⌊ n/3 ⌋ times: " + result);
	        scanner.close();
	    }
	}
