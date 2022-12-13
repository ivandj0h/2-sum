package ivandjoh.online.twosum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
//		int[] nums = {2, 7, 11, 15};
//		int target = 9;
//		int[] result = twoSum3(nums, target);
//		System.out.println("Indeksnya adalah -> [" + result[0] + ", " + result[1] + "]");
//	}

	// First Solution (Brute Force) - > O(n^2)
//	public static int[] twoSum(int[] nums, int target) {
//		int[] result = new int[2];
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] + nums[j] == target) {
//					return new int[] {i, j};
//				}
//			}
//		}
//		return result;
//	}


	// Third Solution (One-pass Hash Table) -> O(n)
//	public static int[] twoSum3(int[] nums, int target) {
//		Map<Integer, Integer> complements = new HashMap<>();
//		for (int i = 0; i < nums.length; i++) {
//			Integer complementIndex = complements.get(nums[i]);
//			if (complementIndex != null) {
//				return new int[] {i, complementIndex};
//			}
//			complements.put(target - nums[i], i);
//		}
//		return nums;
	}
}
